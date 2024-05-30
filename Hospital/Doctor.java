package Hospital;

public class Doctor extends Person
{
	    private String speciallity;
	    public Doctor(String str,int a,String g,String d) 
	    {
	        super(str,a,g);
	        this.speciallity= d;
	    }
	    void docdisplay() 
	    {
	    	super.perdisplay();
	        System.out.println("Disease=" + this.speciallity);
	    }

}
