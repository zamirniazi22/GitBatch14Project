package Stringobject2;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Create a String that should be combination of letters, numbers and special characters.
 *  Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
 */
		String allinone="ABCDEFGHIJKLMNOPQRSTUVWXWZabcdefghijklmnopqrstuvwxyz12345,@#%$&*!";
		System.out.println(allinone.replaceAll("[!-@-#-$-&-*-%]", ""));
		String[]splittedSub=allinone.split("[a-z,A-Z,0-9]");
		System.out.println("the alphanumaric are :"+splittedSub.length);
		
		
	}

}
