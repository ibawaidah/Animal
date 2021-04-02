package Animal ;
public class Animal {
	int age;
	String gender; 
	 public Animal (int old, String sex) {
		 age=old;
		 gender = sex; 
		  }
	 public static void main(String[] args) {
		    Animal myAnimal = new Animal(5, "male");
		    System.out.println(myAnimal.age + " " + myAnimal.gender);
		  }

}
