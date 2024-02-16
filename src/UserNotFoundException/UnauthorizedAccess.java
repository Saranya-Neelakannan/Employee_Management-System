package UserNotFoundException;

public class UnauthorizedAccess extends RuntimeException{
	public UnauthorizedAccess (String s){
		super(s);
	}

}
