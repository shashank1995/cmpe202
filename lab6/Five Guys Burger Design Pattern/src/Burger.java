import java.util.ArrayList;

public class Burger {
public String name;
public String short_name;
public int cal;
public double price;

public Burger() {}

public Burger(String burger_name,String short_burger_name,int calouries,double cost){
	this.name = burger_name;
	this.short_name = short_burger_name;
	this.cal = calouries;
	this.price = cost;
}

public ArrayList<Burger> getAllBurgerType(){
ArrayList<Burger> BurgerType = new ArrayList<Burger>();
Burger b1 = new Burger("HAMBURGER","HB",700,6.99);
BurgerType.add(b1);
Burger b2 = new Burger("CHEESEBURGER","CB",840,5.99);
BurgerType.add(b2);
Burger b3 = new Burger("BACON BURGER","BB",780,6.49);
BurgerType.add(b3);
Burger b4 = new Burger("BACON CHEESEBURGER","BC",920,7.99);
BurgerType.add(b4);
Burger b5 = new Burger("LITTLE HAMBURGER","LHB",480,4.99);
BurgerType.add(b5);
Burger b6 = new Burger("LITTLE CHEESEBURGER","LCB",550,3.49);
BurgerType.add(b6);
Burger b7 = new Burger("LITTLE BACON BURGER","LBB",560,4.49);
BurgerType.add(b7);
Burger b8 = new Burger("LITTLE BACON CHEESEBURGER","LBC",630,5.49);
BurgerType.add(b8);
return BurgerType;
}

}
