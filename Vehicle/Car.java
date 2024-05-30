package Vehicle;

public class Car extends Vehicle {

	private String ftype;

    public Car(int m, int e, String c, String ft) {
    	super(m,e,c);
        this.ftype = ft;
    }

    void cardisplay() {
    	super.vecdisplay();
        System.out.println("Fuel Type: " +  this.ftype);
    }
}
