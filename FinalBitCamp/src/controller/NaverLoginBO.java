package controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;

public class NaverLoginBO {
	
	private final static String CLIENT_ID = "6v9TKn5i1Mbssv2UQuEW";
	private final static String CLIENT_SECRET = "S7ix_Q335o";
	private final static String REDIRECT_URI = "http://localhost:8080/FinalBitCamp/callback.do";
	private final static String SESSION_STATE = "oauth_state";
	
	//네아로 인증 URL 생성 method
	public String getAuthorizationUrl(HttpSession session) {
		//세션 유효성 검증을 위하여 난수를 생성
		String state = generateRandomString();
		//생성한 난수 값을 session에 저장
		setSession(session, state);
		//scribe 에서 제공하는 인증 URL 생성 기능을 이용하여 네아로 인증 URL 생성
		OAuth20Service oauthService = new ServiceBuilder().apiKey(CLIENT_ID)
				.apiSecret(CLIENT_SECRET).callback(REDIRECT_URI).state(state)
				.build(NaverLoginApi.instance());
		return oauthService.getAuthorizationUrl();
				
	}
	
	//네아로 callback 처리 및 accessToken 획득 Method
	public OAuth2AccessToken getAccessToken(HttpSession session, String code, String state) throws IOException{
		// callback으로 전달받은 세션검증용 난수값과 세션에 저장되어 있는 값이 일치하는지 확인
		String sessionState = getSession(session);
		if(StringUtils.equals(sessionState, state)) {
			OAuth20Service oauthService = new ServiceBuilder().apiKey(CLIENT_ID)
					.apiSecret(CLIENT_SECRET).callback(REDIRECT_URI).state(state)
					.build(NaverLoginApi.instance());
			//Scribe에서 제공하는 AccessToken 획득 기능으로 네아로 Access Token을 획득
			OAuth2AccessToken accessToken = oauthService.getAccessToken(code);
			return accessToken;
		}
		return null;
	}
	
	//세션 유효성 검증을 위한 난수 생성기
	private String generateRandomString() {
		return UUID.randomUUID().toString();
	}
	
	//Http session에 데이터 저장
	private void setSession(HttpSession session, String state) {
		session.setAttribute(SESSION_STATE, state);
	}
	
	//Http session에서 데이터 가져오기
	private String getSession(HttpSession session) {
		return (String)session.getAttribute(SESSION_STATE);
	}
}
