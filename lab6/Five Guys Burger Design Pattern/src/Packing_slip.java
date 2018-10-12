import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Packing_slip implements Print {

public Packing_slip() {}

public void print(ArrayList<ArrayList<String>> toppings,ArrayList<Burger> all_burger,int money) {
	System.out.println("Patties - " + all_burger.size() + "\n\n");
	Random rand = new Random();
    int  n = rand.nextInt(50) + 1;
    System.out.println("Order Number:  " + n + "\n");
    Date dNow = new Date( );
    SimpleDateFormat ft = 
    new SimpleDateFormat ("MM/dd/yyyy  hh:mm:ss a");
    System.out.println("     " + ft.format(dNow) + "    \n");
    System.out.println("       FIVE GUYS         \n\n");
    int index = 1;
    int index_b = 0;
    for(Burger b:all_burger) {
    	System.out.println("Sandwich# " + index);
    	System.out.println("1  " + b.short_name);
    	index++;
    	ArrayList<String> str = toppings.get(index_b);
    		for(int i=0;i<str.size()/2;i++) {
    			System.out.println("   " + str.get(i));		
    		}
    		for(int i=str.size()/2;i<str.size();i++) {
    			System.out.println("   ->|" + str.get(i));
    		}
    		index_b++;
    		System.out.println("   {{{{ BACON }}}}");
    }
}
	
}
