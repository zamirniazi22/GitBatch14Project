package Stringobject;

import java.util.Scanner;

public class DemoTaskscav {

	public static void main(String[] args) {
		 String userName;
	        String password;
	        String confirmPassword;

	        Scanner scanner=new Scanner(System.in);
	        System.out.println("Please Enter the userName");
	        userName=scanner.next();
	        System.out.println("Please Enter the password");
	        password=scanner.next();
	        System.out.println("Please Enter the password Again");
	        confirmPassword=scanner.next();


	        if(userName.isEmpty() || password.isEmpty()) {
	            System.out.println("Username and Password cannot be empty");
	        }else if(password.length()<8) {
	            System.out.println("Password is too short");
	        }else if(password.contains(userName)) {
	            System.out.println("Password cannot contain username");
	        } else if(!password.equals(confirmPassword)) {
	            System.out.println("Passwords do not match");
	        }else {
	            System.out.println("Your username and password has been created");
	        }


	    }

	}


