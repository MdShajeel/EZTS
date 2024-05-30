package Hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, bedNumber, floorNumber, numberOfPatients;
        String name, gender, specialization, disease;
        System.out.println("Enter Name=");
        name = scanner.next();
        System.out.println("Enter Age=");
        age = scanner.nextInt();
        System.out.println("Enter Gender=");
        gender = scanner.next();
        System.out.println("Enter 1 ---if you are Doctor, Enter 2 ---if you are Patient, Enter 3 ---if you are Nurse");
        int choice;
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Your specialization=");
                specialization = scanner.next();
                Doctor doctor = new Doctor(name, age, gender, specialization);
                System.out.println("Doctor Details:");
                doctor.display();
                break;
            case 2:
                System.out.println("Enter Your Disease:");
                disease = scanner.next();
                System.out.println("Enter Your Bed No:");
                bedNumber = scanner.nextInt();
                Patient patient = new Patient(name, age, gender, disease, bedNumber);
                System.out.println("Patient Details=");
                patient.display();
                break;
            case 3:
                System.out.println("Enter Floor Number:");
                floorNumber = scanner.nextInt();
                System.out.println("Enter Room Number:");
                int roomNumber = scanner.nextInt();
                System.out.println("Enter Number of Patients allocated to Nurse:");
                numberOfPatients = scanner.nextInt();
                Nurse nurse = new Nurse(name, age, gender, floorNumber, roomNumber, numberOfPatients);
                System.out.println("Nurse Details:");
                nurse.display();
                break;
            default:
                System.out.println("You have entered invalid input...");
        }
    }
}
