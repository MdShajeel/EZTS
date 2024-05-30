package Hospital;

public class Patient extends Person {
    private int bedNumber;
    private String disease;

    public Patient(String name, int age, String gender, String disease, int bedNumber) {
        super(name, age, gender);
        this.disease = disease;
        this.bedNumber = bedNumber;
    }

    void display() {
        super.display();
        System.out.println("Disease: " + this.disease);
        System.out.println("Bed Number: " + this.bedNumber);
    }
}
