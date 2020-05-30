package exercicio11.eng2020_1_a11.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception{
		HttpSession session = request.getSession();
		
		if(session.getAttribute("usuarioLogado") == null)
			response.sendRedirect("login");
		
		return true;
	}
}
