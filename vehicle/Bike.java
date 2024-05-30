package Vec;
public class Bike extends Vehicle {
    String ti;

    public Bike(int m, int e, String c, String t) 
    {
    	super(m,e,c);
        ti = t;
    }
    void bikedisplay() {
    	super.vecdisplay();
        System.out.println("Type: " + ti);
    }
}
