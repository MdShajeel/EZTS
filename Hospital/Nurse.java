package Hospital;

public class Nurse extends Person {
    private int roomNumber, floorNumber, numberOfPatients;

    public Nurse(String name, int age, String gender, int roomNumber, int floorNumber, int numberOfPatients) {
        super(name, age, gender);
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.numberOfPatients = numberOfPatients;
    }

    void display() {
        super.display();
        System.out.println("Floor Number: " + this.floorNumber);
        System.out.println("Room Number: " + this.roomNumber);
        System.out.println("Number of Patients allocated to Nurse: " + this.numberOfPatients);
    }
}
