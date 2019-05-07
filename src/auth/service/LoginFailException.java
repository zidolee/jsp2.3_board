package auth.service;

public class LoginFailException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LoginFailException() {
		super("해당 멤버는 존재하지 않습니다.");
	}

}
