public class Main{
	public static void main(String[] args) {
		GumballType1 gumball1 = new GumballType1(5);
		
		System.out.println(gumball1);
		
		gumball1.insertQuarter(25);
		gumball1.turnCrank();
		
		System.out.println(gumball1);
		
		GumballType2 gumball2 = new GumballType2(3);
		
		System.out.println(gumball2);
		
		gumball2.insertQuarter(25);
		gumball2.turnCrank();
		gumball2.insertQuarter(25);
		gumball2.turnCrank();
		
		System.out.println(gumball2);
		
		GumballType3 gumball3 = new GumballType3(4);
		
		System.out.println(gumball3);
		
		gumball3.insertQuarter(5);
		gumball3.insertQuarter(1);
		gumball3.turnCrank();
		gumball3.insertQuarter(10);
		gumball3.insertQuarter(25);
		gumball3.turnCrank();
		gumball3.insertQuarter(1);
		gumball3.insertQuarter(1);
		gumball3.insertQuarter(1);
		gumball3.insertQuarter(5);
		gumball3.insertQuarter(5);
		gumball3.turnCrank();
		
		System.out.println(gumball3);
		
	}
}