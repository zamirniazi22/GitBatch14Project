package Stringobject;

public abstract class StringPractice {

	public static void main(String[] args) {
	String str="HelloWorld";
	String s1=new String("HelloWorld");
	//String.length();
String Str1=new String("welcome Student at syntax for studing to much ");
System.out.println("Str1length");
System.out.println(Str1.length());
String str2=new String("Tutorials");
System.out.println(str2.length());
	String str3=new String("GOOD NIGHT");
	System.out.println(str3.toLowerCase());
	String str4=new String("good morning");
	System.out.println(str4.toUpperCase());
	
	
String S= " 5 hours sleep is";
S=S.concat("good for helth");
System.out.println(S);

str="wrong";
boolean b=str.isEmpty();
System.out.println(b);


String str6= "  How are you doing   ";
System.out.println(str6.trim());
String str7="Welcome to the United State of America";
System.out.println(str7.startsWith("Welcome"));
System.out.println(str7.startsWith("America"));
System.out.println(str7.endsWith("America"));

String str8="Syntax has a lot of good students";
boolean contains=str8.contains("good");
System.out.println(contains);
boolean rav;
String str9="that is great";
String str10=str9;
String str11="that is great";
String str12=new String("that is great");
System.out.println(str9.equals(str10));
System.out.println(str9.equals(str11));
rav=str9.equalsIgnoreCase(str12);
String st="love is live";
char result=st.charAt(10);
System.out.println(result);
	
String strt="you are the best";
System.out.println(strt.indexOf('5'));

String strn= new String("I am in America");
System.out.println(strn.replace('i','E'));
String mix="3213Hello 89 World354545 *&***^&*^&*";
System.out.println(mix.replaceAll("[&,*]" , " "));
String subject="I love Java and I want to learn more";
String [] splittedSub = subject.split(" ");
System.out.println(splittedSub.length);
for(int i=0; i<splittedSub.length;i++) {
	System.out.println(splittedSub[i]);
	
	String str0="study";
	str.concat("tonight");
	System.out.println(str0);
	StringBuilder strB=new StringBuilder("study");
	strB.append(" tonight");
	System.out.println(strB);
	
}
}
}