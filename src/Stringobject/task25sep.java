package Stringobject;

public class task25sep {

	public static void main(String[] args) {
		//When you say create, we define using variable? When you say read, we use scanner. Right?

	

	        String str="Batch 14 is really good";
	        String[]arr=str.split("\s");
	        System.out.println(Arrays.toString(arr));
	        System.out.println(arr[4]);

	        String str2="Today is Sunday. Sunday is good. Java is also good";
	        String[] arr2=str2.split("[.]");
	        System.out.println(Arrays.toString(arr2));
		
		
		
	}

}
