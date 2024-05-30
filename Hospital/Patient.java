package Hospital;
public class Patient extends Person 
{
	   private int bedno;
	   private String des;

	    public Patient(String str,int a,String g,String d, int bno) 
	    {
	        super(str,a,g);
	        this.des= d;
	        this.bedno=bno;
	    }
	    void patdisplay() 
	    {
	    	super.perdisplay();
	        System.out.println("Disease=" + this.des);
	        System.out.println("Bed No=" + this.bedno);
	    }
}