package auth.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class LoginHandler implements CommandHandler{
	
	private  static final String FORM_VIEW = "/WEB-INF/view/loginForm.jsp";

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {

		return null;
	}

}
