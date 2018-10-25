/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IKeyEventHandler prevHandler ;
	private String date = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }

    public void setPrev (IKeyEventHandler prev) {
    	this.prevHandler = prev ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return "[" + date + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if(ch.equals("X") && cnt==17){
			prevHandler.key("Y",100);
		}
		if(ch.equals("Z")){
			date = date.substring(0,date.length()-1);
		}
		if(ch.equals("X") && cnt<=20){
			if(cnt==18){
				date="";
			}
			else if(cnt==19){
				date=date.substring(0,1);
			}
			else if(cnt==20){
				date=date.substring(0,2);
			}
		}
		else{
		if(cnt==17 || cnt>=19 && cnt<=20)
		date+=ch;
		else if(cnt==18)
			date+=ch + '/';
		else if(nextHandler!=null)
			nextHandler.key(ch,cnt);
		}
		// if ( cnt >= 17 && cnt <= 20  )
		// 	date += ch ;
		// else if ( nextHandler != null )
		// 	nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}