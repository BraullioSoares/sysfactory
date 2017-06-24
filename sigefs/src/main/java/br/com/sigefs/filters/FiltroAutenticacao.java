package br.com.sigefs.filters;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(dispatcherTypes = {DispatcherType.REQUEST}, urlPatterns="/*")
public class FiltroAutenticacao implements Filter {

    public FiltroAutenticacao() {

    }
    
	public void destroy() {

	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		String url = httpRequest.getRequestURI();
		HttpSession sessao = httpRequest.getSession(false);
		
		if (sessao != null || url.indexOf("login.jsp") != -1 || url.indexOf("autenticador.do") != -1){
			System.out.println("passou pelo filtro.");
			chain.doFilter(request, response);
		} else {
			httpResponse.sendRedirect("login.jsp");
		}
		
	}
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
