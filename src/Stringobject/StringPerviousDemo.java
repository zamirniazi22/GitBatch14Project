package Stringobject;

import java.util.Arrays;

public class StringPerviousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Today is Sunday";
        String day=str.substring(9);            //(9) is called argument
        System.out.println(day);
        System.out.println(str.substring(6,8));

        System.out.println(str.charAt(4));        //calling the method charAt on str object
        System.out.println();

        char[] charArr=str.toCharArray();
        System.out.println(Arrays.toString(charArr));
        //System.out.println(charArr);
        int index=str.indexOf("a");
        System.out.println(index);
        System.out.println(str.indexOf("a",6));


    }


		
	

}
