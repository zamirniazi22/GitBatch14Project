package objects;

public class Student {
 String name;
 String Id;
 int age;
 double weight;
 char gender;
 void study() {
	 System.out.println("Student is studing");
 }
	void deleteMessages()	{
		System.out.println("Deleting message from Discord");
	} 
		 
	 void ear() {
		 System.out.println("Eating pizzzzzzzzzzza");
		 }
	 public static void main(String[] args) {
		 Student Friadoonobject=new Student();
		 Friadoonobject.name="Friadoon";
		 Friadoonobject.Id="123";
		 Friadoonobject.age=22;
		 System.out.println(Friadoonobject.name);
		 System.out.println(Friadoonobject.age);
		 Friadoonobject.deleteMessages();
		 Student student2=new Student();
		 student2.name="Asma";
		 student2.age=16;
		 student2.weight=30;
		 student2.gender='F';
		 System.out.println(student2.name);
		 
	 }
			

		
 
	

}
