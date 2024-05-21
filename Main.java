package Vec;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int m,e,cap;
	 String c,type,t;
	 System.out.println("Enter model=");
	 m=s.nextInt();
	 System.out.println("Enter engine no=");
	 e=s.nextInt();
	 System.out.println("Enter color=");
	 c=s.next();
	 System.out.println("Enter 1 --- For Bus ,Enter 2 --- For Car ,Enter 3 --- For Bike");
	 int c1;
	 c1=s.nextInt();
	 switch(c1) {
		 case 1:
			 System.out.println("Enter Bus seat capacity=");
			 cap=s.nextInt();
			 Bus b=new Bus(m,e,c,cap);
			 System.out.println("Bus Details:");
			 b.busdisplay();
			 break;
		 case 2:
			 System.out.println("Enter car type(Pertol or Desiel or EV):");
			 type=s.next();
			 Car car=new Car(m,e,c,type);
			 System.out.println("Car Details=");
			 car.cardisplay();
			 break;
		 case 3:
			 System.out.println("Enter bike type(Standard or Sports or Mountain):");
			 t=s.next();
			 Bike bi=new Bike(m,e,c,t);
			 System.out.println("Bike Details:");
			 bi.bikedisplay();
			 break;
		default:
			System.out.println("You have entered invalid input...");
	 } 
 }
	
}
