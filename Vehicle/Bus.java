package Vehicle;

public class Bus extends Vehicle {
    private int se;

    public Bus(int m, int e, String c, int sc) 
    {
        super(m,e,c);
        this.se= sc;
    }
    void busdisplay() {
    	super.vecdisplay();
        System.out.println( "Seating Capacity: " + this.se);
    }
}
