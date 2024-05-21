package Vec;
import java.util.*;
public class Vehicle 
{
   private int model,engine;
   private String color;
   public Vehicle(int m,int e,String c)
   {
	   this.model=m;
	   this.engine=e;
	   this.color=c;
   }
   void vecdisplay() {
       System.out.println("Model: " +this.model);
       System.out.println("Engine: " + this.engine);
       System.out.println("Color: " + this.color);
   }
}
