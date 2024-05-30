package Hospital;

public class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
    }

    void display() {
        super.display();
        System.out.println("Specialization: " + this.specialization);
    }
}
