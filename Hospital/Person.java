package Hospital;
public class Person {
	private int age;
	   private String name,gender;
	   public Person(String str,int a,String g)
	   {
		   this.name=str;
		   this.age=a;
		   this.gender=g;
	   }
	   void perdisplay() {
	       System.out.println("Name: " +this.name);
	       System.out.println("Age: " + this.age);
	       System.out.println("Gender: " + this.gender);
	   }
	   
	 

}
