package objects;

public class Dog {
	// state
	// attributes/properties /fields
	String name;
	String color;
	String breed;
	double weight;
	int age;
	// these are the behaviors of  adog
	void bark() {
		System.out.println("Barking.........");
		
	}
	
void sleep() {
	System.out.println("Dog is sleeping..... ");
}
	public static void main(String[]args) {
		Dog dog1=new Dog();
		// calling a behavior on an object
		dog1.bark();
		dog1.sleep();
	}

}
