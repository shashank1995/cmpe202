import java.util.ArrayList;
import java.util.*;
import java.text.*;


public class Printing_Receipt implements Print {
	
	public Printing_Receipt() {}
	
	public void print(ArrayList<ArrayList<String>>toppings,ArrayList<Burger> all_burger,int money) {
		System.out.println("         FIVE GUYS       ");
		System.out.println("      BURGER AND FRIES   ");
		System.out.println("       STORE # CA-1294   ");
		System.out.println("     5353 ALMADEN EXPY N60   ");
		System.out.println("       SAN JOSE, CA 95118  ");
		System.out.println("        (P) 408-264-9300  \n\n");
		Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("MM/dd/yyyy  hh:mm:ss a");
	    System.out.println("     " + ft.format(dNow) + "    \n");
	    System.out.println("       FIVE GUYS         ");
	    Random rand = new Random();
	    int  n = rand.nextInt(50) + 1;
	    System.out.println("Order Number:  " + n + "\n");
	    int index = 1;
	    double total_cost = 0;
	    int index_b = 0;
	    for(Burger b:all_burger) {
	    	System.out.println(index + "  " + b.short_name + "                 " + b.price);
	    	total_cost += b.price;
	    	System.out.println("   {{{{ BACON }}}}");
	    	ArrayList<String> str = toppings.get(index_b);
	    		for(int i=0;i<str.size()/2;i++) {
	    			System.out.println("   " + str.get(i));		
	    		}
	    		for(int i=str.size()/2;i<str.size();i++) {
	    			System.out.println("   ->|" + str.get(i));
	    		}
	    		index_b++;
	    }
	   System.out.println("   Total:             $" + total_cost + "\n");
	   System.out.println("   Cash $" + money + "             $" + Double.valueOf(money));
	   Double change=Double.valueOf(money)-total_cost;
	   System.out.println("   Change             $" + change);
	}
}
