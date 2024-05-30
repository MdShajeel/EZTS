package Hospital;
public class Nurse extends Person
{
    private int roomno,floorno,noofp;
    public Nurse(String str,int a,String g,int r,int f,int p) 
    {
        super(str,a,g);
        this.roomno=r;
        this.floorno=f;
        this.noofp=p;
    }
    void nurdisplay() 
    {
    	super.perdisplay();
        System.out.println("Floor No=" + this.floorno);
        System.out.println("Room No=" + this.roomno);
        System.out.println("No of patients allocated to Nurse=" + this.noofp);
    }
}
