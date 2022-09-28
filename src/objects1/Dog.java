package objects1;

public class Dog {
// create  a dog class and create three different objects of it: bulldog, Husky,Labrador
	
String name;
String color;
int weight;
void bark() {
	System.out.println("it is alwasys barking");
}
	void Runing() {
		System.out.println("it is Runing very fast");
	}

	void biting() {
		System.out.println("it is bitting every one except his owner");
	}
	public static void main(String[]args) {
		
	Dog dog1=new Dog();
	dog1.name="bulldog";
	dog1.color="yellow";
	dog1.weight=26;
	System.out.println("the name of dog is "+dog1.name+" its color "+dog1.color+" and its weight is "+dog1.weight+"Lb");
	dog1.Runing();
	System.out.println("-----------");
	Dog dog2=new Dog();
	dog2.name="Husky";
	dog2.color="black";
	dog2.weight=36;

	System.out.println("the name of second  dog is  "+dog2.name+ " its color "+dog2.color+"  and its weight is "+dog2.weight+"Lb");
	dog2.bark();
	System.out.println("---------------------");
	Dog dog3=new Dog();
	dog3.name="Labrador";
	dog3.color="White";
	dog3.weight=30;
	
	System.out.println("the name of third  dog is  "+dog3.name+ " its color "+dog3.color+"  and its weight is "+dog3.weight+"Lb");
	dog3.biting();
	
	}

	
}
