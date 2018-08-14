package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.scribejava.core.model.OAuth2AccessToken;

import service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService mService = new MemberService();

	// NaverLoginBO
	private NaverLoginBO naverLoginBO;

	// NaverLoginBO
	@Autowired
	private void setNaverLoginBO(NaverLoginBO naverLoginBO) {
		this.naverLoginBO = naverLoginBO;
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

	public void loginMember(String userId, String pw) {

	}

	@RequestMapping("naverLogin.do")
	public ModelAndView naverLogin(HttpSession session) {
		// 네아로 인증 URL을 생성하기 위하여 getAuthorizationUrl을 호출
		String naverAuthUrl = naverLoginBO.getAuthorizationUrl(session);
		return new ModelAndView("loginForm.do", "url", naverAuthUrl);
	}

	@RequestMapping("/callback")
	public ModelAndView callback(@RequestParam String code, @RequestParam String state, HttpSession session)
			throws IOException {
		/* 네아로 인증이 성공적으로 완료되면 code 파라미터가 전달되며 이를 통해 access token을 발급 */
		OAuth2AccessToken oauthToken = naverLoginBO.getAccessToken(session, code, state);
		return new ModelAndView("callback");
	}

	public void logoutMember() {

	}

	public void getMemberList(Date joinDate) {

	}

	public void getNewMemberNum(Date joinDate) {

	}
}
