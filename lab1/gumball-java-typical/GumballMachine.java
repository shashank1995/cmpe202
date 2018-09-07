interface GumballMachine
{


    public void insertQuarter(int coin);
    
    public void turnCrank();
    
}

class GumballType1 implements GumballMachine{
int num_gumballs;
boolean has_quarter;

public GumballType1(int size) {
	this.num_gumballs = size;
	this.has_quarter = false;
}

@Override
public void insertQuarter(int coin) {
	if(coin==25) 
		this.has_quarter = true;
	else
		this.has_quarter = false;
}

@Override
public void turnCrank()
{
	if ( this.has_quarter )
	{
		if ( this.num_gumballs > 0 )
		{
			this.num_gumballs-- ;
			this.has_quarter = false ;
			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
		}
		else
		{
			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
		}
	}
	else 
	{
		System.out.println( "Please insert a quarter" ) ;
	}        
}
}

class GumballType2 implements GumballMachine{
	int num_gumballs;
	boolean has_quarter;
	boolean has_two_quarter;
	
	public GumballType2(int size) {
		this.num_gumballs = size;
		this.has_quarter = false;
		this.has_two_quarter = false;
	}
	
	@Override
	public void insertQuarter(int coin) {
		if(coin==25 && this.has_quarter == false) 
			this.has_quarter = true;
		else if(coin==25 && this.has_quarter == true)
			this.has_two_quarter = true;
	}
	
	@Override
	public void turnCrank()
	{
		if ( this.has_quarter && this.has_two_quarter)
		{
			if ( this.num_gumballs > 0 )
			{
				this.num_gumballs-- ;
				this.has_quarter = false ;
				this.has_two_quarter = false;
				System.out.println( "Thanks for your two quarter.  Gumball Ejected!" ) ;
			}
			else
			{
				System.out.println( "No More Gumballs!  Sorry, can't return your tow quarter." ) ;
			}
		}
		else 
		{
			if(this.has_quarter==false) {
				System.out.println("Please insert two quarter for gumball.");
			}
			else if(this.has_quarter && this.has_two_quarter==false) {
				System.out.println("Please insert one more quarter for gumball.");
			}
		}        
	}
	}

class GumballType3 implements GumballMachine{
	int num_gumballs;
	int total_cash;
	
	public GumballType3(int size) {
		this.num_gumballs = size;
		this.total_cash = 0;
	}
	
	@Override
	public void insertQuarter(int coin) {
		if(coin==1) {
		this.total_cash = this.total_cash + coin;
		System.out.println("Penny inserted.");
		int remaining = 50-this.total_cash;
		if(this.total_cash < 50)
			System.out.println("You still need to insert " + remaining + " cash.");
		}
		if(coin==5) {
			this.total_cash = this.total_cash + coin;
			System.out.println("Nickel inserted.");
			int remaining = 50-this.total_cash;
			if(this.total_cash < 50)
				System.out.println("You still need to insert " + remaining + " cash.");
			}
		if(coin==10) {
			this.total_cash = this.total_cash + coin;
			System.out.println("Dime inserted.");
			int remaining = 50-this.total_cash;
			if(this.total_cash < 50)
				System.out.println("You still need to insert " + remaining + " cash.");
			}
		if(coin==25) {
			this.total_cash = this.total_cash + coin;
			System.out.println("Quarter inserted.");
			int remaining = 50-this.total_cash;
			if(this.total_cash < 50) {
				System.out.println("You still need to insert " + remaining + " cash.");
			}
			}
	}
	
	@Override
	public void turnCrank()
	{
		if(this.num_gumballs > 0) {
		int remaining = 50-this.total_cash;
		if(this.total_cash == 50) {
			this.num_gumballs--;
			this.total_cash = 0;
			System.out.println("Thanks for your money. Gumball ejected.");
		}
		else if(this.total_cash < 50) {
			System.out.println("You still need to insert " + remaining + " cash.");
		}
		else if(this.total_cash > 50) {
			this.num_gumballs--;
			this.total_cash = this.total_cash-50;
			System.out.println("Thanks for the extra money. Gumball ejected.");
		}
		}
		else
			System.out.println("No More Gumballs!  Sorry, can't return your money.");
	}
}