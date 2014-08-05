package com.gtafe.web.interceptor;

import com.gtafe.model.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginHandlerInterceptor extends HandlerInterceptorAdapter {

	/**
	 * 每次调用方法前进行预判，只有存在session才能执行对应方法
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
			HttpSession session = request.getSession();
			User user= (User) session.getAttribute("account");
			if(user!=null){
				return true;
			}else{
				response.sendRedirect(request.getContextPath()+"/user/login");
				return false;
			}
		}
}
