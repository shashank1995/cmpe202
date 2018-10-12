import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
public static void main(String [] args) throws NumberFormatException, IOException {
	ArrayList<Burger> burger_order=new ArrayList<Burger>();
	ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
	String s;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	do {
	System.out.println("Choose your burger: ");
	int index = 1;
	Burger bug = new Burger();
	ArrayList<Burger> all_burger  = bug.getAllBurgerType();
	for(Burger b:all_burger) {
		System.out.println(" " + index + ". " + b.name);
		index++;
	}
	int choice = Integer.parseInt(in.readLine());
	burger_order.add(all_burger.get(choice-1));
	ArrayList<String> toppings_burger = new ArrayList<String>();
	Toppings toppings = new Toppings();
	ArrayList<String> all_toppings = toppings.getAllToppingsList();
	do {
	System.out.println("Choose your toppings:");
	int index_a = 1;
	for(String top:all_toppings) {
		System.out.println(" " + index_a + ". " + top);
		index_a++;
	}
	choice = Integer.parseInt(in.readLine());
	if(choice<16) {
	toppings_burger.add(all_toppings.get(choice-1));
	}
	} while(choice!=16);
	arr.add(toppings_burger);
	System.out.println("Do you want to add another burger, Enter Yes or No:");
	s = in.readLine();
	}while(s.equals("Yes"));
	System.out.println("Money in cash:");
	int ur_money = Integer.parseInt(in.readLine());
	Printing_Receipt pr = new Printing_Receipt();
	pr.print(arr, burger_order, ur_money);
	System.out.println("\n\n");
	Packing_slip ps = new Packing_slip();
	ps.print(arr, burger_order, ur_money);
}
}
