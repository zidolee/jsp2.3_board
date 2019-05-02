package member.service;

public class DuplicateIdException extends RuntimeException{
	
	public DuplicateIdException() {
		super("중복된 아이디가 존재 합니다.");
	}
}
