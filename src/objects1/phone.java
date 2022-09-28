package objects1;

public class phone {
	String name;
String Make;
String Model;
String color;
int storage;
double size;
boolean cheap;
void call() {
	System.out.println(" active in coming and going call");
}

	void voicerecording() {
		System.out.println(" good in clear voice recording");
	}
	void videoRecording() {
		System.out.println(" perfect quality in video recording");
	}

	public static void main(String[] args) {
		phone phone1=new phone();
		phone1.name="Iphone ";
		phone1.Make="14";
		phone1.Model=" pro ";
		phone1.color="purple";
		phone1.storage=256;
		phone1.size= 6.7;
		phone1.cheap=false;
	    System.out.println(phone1.name);
	    System.out.println("Iphone"+phone1.Make+phone1.Model+"color "+phone1.color+" " +phone1.storage+"GB");
	    System.out.println("---------------------------");
		
	    phone phone2=new phone();
		phone2.name="Pixel ";
	    phone2.Make="22";
		phone2.Model=" Google pixle 6A ";
	    phone2.color="White";
	    phone2.storage=128;
	    phone2.size= 6;
	    phone2.cheap=true;
	    System.out.println(phone2.name);
	    System.out.println("pixel"+phone2.Make+phone2.Model+"color "+phone2.color+" " +phone2.storage+"GB");
	    
		System.out.println("-----------------");
		
		phone phone3=new phone();
		phone3.name="Sunsung ";
	    phone3.Make="  22";
		phone3.Model=" ultra s 22 ";
	    phone3.color="Green";
	    phone3.storage=500;
	    phone3.size= 7;
	    phone3.cheap=true;
	    System.out.println(phone3.name);
	    System.out.println("Sumsung"+phone3.Make+phone3.Model+"color "+phone3.color+" " +phone3.storage+"GB");
	    
		
	}
	
	
}
