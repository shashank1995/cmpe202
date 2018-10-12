import java.util.ArrayList;

public class Toppings {
	public ArrayList<String> collection = new ArrayList<String>();
	
	public ArrayList<String> getAllToppingsList() {
		collection.add("MAYO");
		collection.add("LETTUCE");
		collection.add("PICKLES");
		collection.add("TOMATOES");
		collection.add("GRILLED ONIONS");
		collection.add("GRILLED MUSHROOMS");
		collection.add("KETCHUP");
		collection.add("MUSTARD");
		collection.add("RELISH");
		collection.add("ONIONS");
		collection.add("JALAPENO PEPPERS");
		collection.add("GREEN PEPPERS");
		collection.add("A.1* STEAK SAUCE");
		collection.add("BAR-B-Q SAUCE");
		collection.add("HOT SAUCE");
		collection.add("I AM DONE WITH TOPPINGS");
		return collection;
	}
}
