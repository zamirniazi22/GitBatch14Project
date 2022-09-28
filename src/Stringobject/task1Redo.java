package Stringobject;

public class task1Redo {

	private static Object firstHalf;
	private static Object secondHalf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hi everyone";
int length=str.length();
if(!str.isEmpty()&& length%2!=0&& length>=3 ) {
	int middleIndex=length/2;
	System.out.println(middleIndex);
}

		//String day="Sunday";
	//	for(int l=day.length()-1;l>=0;l--) {
		//	System.out.print(day.charAt(l));
		//}
		
		String fatherName="Daniel";
		String MotherName="Mary";
		boolean boy= false;
		String firstHalf;
		String secondHalf;
		if (boy) {
			firstHalf=fatherName.substring(0,fatherName.length()/2);
			secondHalf=MotherName.substring(MotherName.length()/2);
			
		}else {
			
			firstHalf=MotherName.substring(0,MotherName.length()/2);
			 secondHalf=fatherName.substring(fatherName.length()/2);
			
			}
		System.out.print(firstHalf+secondHalf);
		}
	
		String str3="I love to learn java";
		String[]arr=str3.split("[t]");
	
	private static int fatherName() {
		// TODO Auto-generated method stub
		return 0;
		
	}

}
