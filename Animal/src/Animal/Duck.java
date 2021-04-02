package Animal;

public class Duck {
	String beakColor=" yellow "; 
	 public static void main(String[] args) {
		    Animal Duck = new Animal(5, "male");
System.out.println(Duck.gender+" "+Duck.age);
	 }
	 public   void swim() {
		 System.out.println("it swim");
	 }
	 public   void quack() {
		 System.out.println("Annouing");
	 } 
}
