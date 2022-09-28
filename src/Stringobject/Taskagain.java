package Stringobject;

public class Taskagain {

	public static void main(String[] args) {
		String username="zamirniazi";
		String pass="niazi123";
		String confirmPassword="niazi123";
		if(username.isEmpty() || pass.isEmpty())
		{
			System.out.println("Username and Password be empty");
		}else if(pass.length()<8) {
			System.out.println( "password is to short");
		}else if (pass.contains(username)) {
			System.out.println("password can not contain username");
		}else if(!confirmPassword.equals(pass))
		{
			System.out.println("password do not match");
		}else {
			System.out.println("your username and password has been created");
		}
		

		
		
		
		
		
		
	}

}
