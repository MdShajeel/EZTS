package Hospital;

import java.util.Scanner;

public class Main 
{public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int age,b,r,f,nofp;
	 String name,gender,spe,de;
	 System.out.println("Enter Name=");
	 name=s.next();
	 System.out.println("Enter Age=");
	 age=s.nextInt();
	 System.out.println("Enter Gender=");
	 gender=s.next();
	 System.out.println("Enter 1 ---if you are Docter ,Enter 2 ---if you are Patient ,Enter 3 ---if you are Nurse");
	 int c1;
	 c1=s.nextInt();
	 switch(c1) {
		 case 1:
			 System.out.println("Enter Your specialation=");
			 spe=s.next();
			 Doctor d=new Doctor(name,age,gender,spe);
			 System.out.println("Doctor Details:");
			 d.docdisplay();
			 break;
		 case 2:
			 System.out.println("Enter Your Disease:");
			 de=s.next();
			 System.out.println("Enter Your Bed No:");
			 b=s.nextInt();
			 Patient p=new Patient(name,age,gender,de,b);
			 System.out.println("Patient Details=");
			 p.patdisplay();
			 break;
		 case 3:
			 System.out.println("Enter Floor NO");
			 f=s.nextInt();
			 System.out.println("Enter Room NO");
			 r=s.nextInt();
			 System.out.println("Enter No of patients allocated to nurse=");
			 nofp=s.nextInt();
			 Nurse n=new Nurse(name,age,gender,f,r,nofp);
			 System.out.println("Nurse Details:");
			 n.nurdisplay();
			 break;
		default:
			System.out.println("You have entered invalid input...");
	 } 
}
}