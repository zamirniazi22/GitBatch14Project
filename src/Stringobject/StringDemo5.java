package Stringobject;

public class StringDemo5 {

	private static String str2;

	public static void main(String[] args) {
		  String str=" i love java ";
	        System.out.println(str);
	        /*
	         * Remove the spaces before and after the
	         * String but not the ones which are present in between
	         /
	        System.out.println(str.trim());

	        String str2="Java is very easy";
	        /
	         * startsWith=> checks if a String starts with a specific letter or word
	         * endsWith=> checks if a String Ends with a specific letter or word
	         * contains=> checks if a String Contains a specific letter or word
	         */
	        System.out.println(str2.startsWith("J"));
	        System.out.println(str2.endsWith("y"));
	        System.out.println(str2.contains("very"));

	}

}
