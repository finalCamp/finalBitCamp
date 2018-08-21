package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.scribejava.core.model.OAuth2AccessToken;

import model.Member;
import service.MemberServiceImpl;
import service.NaverLoginBO;

@Controller
public class MemberController {
	@Autowired
	MemberServiceImpl mService;

	// NaverLoginBO
	private NaverLoginBO naverLoginBO;

	// NaverLoginBO
	@Autowired
	private void setNaverLoginBO(NaverLoginBO naverLoginBO) {
		this.naverLoginBO = naverLoginBO;
	}

	@RequestMapping("main.do")
	public ModelAndView memberInfo(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		String userId = (String) session.getAttribute("userId");
		if (userId == null) {
			mav.setViewName("loginForm");
		} else {
			mav.addObject("member", mService.selectMember(userId));
			mav.setViewName("main");
		}
		return mav;
	}

	public void joinMember(String userid, String pw, String pwChk, String name, String email, String addr, int phone,
			int post) {

	}

	public void updateMember(String userid, String pw, String pwChk, String name, String email, String addr, int phone,
			int post) {

	}

	public void getMember(String userId) {

	}

	public void leaveMember(String userId, String pw) {

	}

	@RequestMapping("memberLogin.do")
	public String loginMember(HttpSession session, String userId, String pw) {
		if (mService.login(userId, pw)) {
			session.setAttribute("userId", userId);
			return "redirect:main.do";
		} else {
			System.out.println("실패");
			return "redirect:loginForm.do";
		}
	}
	
	@RequestMapping("kakaoLogin.do")
	public String kakaoLogin(@RequestParam("code") String code, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		// accessToken 얻기
		JsonNode token = service.kakaoLogin.getAccessToken(code);
		// 로그 아웃 시 accessToken 사용하기 위해서 session에 등록
		session.setAttribute("KaccessToken", token.path("access_token").toString());
		// accessToken으로 고객 정보 얻기
		JsonNode profile = service.kakaoLogin.getKakaoUserInfo(token.path("access_token").toString());
		// 얻은 고객정보 DB에 저장되어 있는지 확인
		mService.MemberKakao(profile, session);
		return "redirect:main.do";
	}

	@RequestMapping("naverLogin.do")
	public String naverLogin(HttpSession session) {
		// 네아로 인증 URL을 생성하기 위하여 getAuthorizationUrl을 호출
		String naverAuthUrl = naverLoginBO.getAuthorizationUrl(session);
		// 생성한 인증 URL을 view로 전달
		return "redirect:" + naverAuthUrl;
	}

	@RequestMapping("loginForm.do")
	public String loginForm() {
		return "loginForm";
	}

	@RequestMapping("callback.do")
	public String callback(@RequestParam String code, @RequestParam String state, HttpSession session)
			throws IOException {
		// 네아로 인증이 성공적으로 완료되면 code 파라미터가 전달되며 이를 통해 access token을 발급
		OAuth2AccessToken oauthToken = naverLoginBO.getAccessToken(session, code, state);
		String apiResult = naverLoginBO.getUserProfile(oauthToken);
		mService.MemberNaver(apiResult, session);
		return "redirect:main.do";

	}
	

	@RequestMapping("logout.do")
	public String logoutMember(HttpSession session) {
		String user = (String) session.getAttribute("userId");
		Member m = new Member();
		m = mService.selectMember(user);
		if (m.getType() == 1) { // 일반 회원 로그아웃
			session.removeAttribute("userId");
		} else if (m.getType() == 2) { // naver 회원 로그아웃
			String accessToken = (String) session.getAttribute("NaccessToken");
			try {
				String result = naverLoginBO.tokenDelete(accessToken);
				System.out.println("result = " + result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (m.getType() == 3) { // kakao 회원 로그아웃
			String accessToken = (String) session.getAttribute("KaccessToken");
			service.kakaoLogin.kakaoLogOut(accessToken);
			// session.removeAttribute("userId");
		}
		session.removeAttribute("userId");
		return "redirect:loginForm.do";
	}

	public void getMemberList(Date joinDate) {

	}

	public void getNewMemberNum(Date joinDate) {

	}
}
