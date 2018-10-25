/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IKeyEventHandler prevHandler ;
	private String number = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

    public void setPrev( IKeyEventHandler prev){
    	this.prevHandler = prev ;
    }

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			return "[" + number + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if(ch.equals("Y")){
			number = number.substring(0,number.length()-1);
		}
		if(ch.equals("X") && cnt<=16){
			if(cnt<=4){
			number = number.substring(0,cnt-2);
		}
		if(cnt>5 && cnt<=8){
			number = number.substring(0,cnt-1);
		}
		if(cnt>9 && cnt<=12){
			number = number.substring(0,cnt);
		}
		else if(cnt>13 && cnt<=16){
			number = number.substring(0,cnt+1);	
		}
			else if(cnt==5){
				number = number.substring(0,cnt-2);
			}
			else if(cnt==9){
				number = number.substring(0,cnt-1);
			}
			else if(cnt==13){
				number = number.substring(0,cnt);
			}
		}
		else{
		if(cnt<4 || cnt>4 && cnt<8 || cnt>8 && cnt<12 || cnt>12 && cnt<=16)
			number += ch;
		else if(cnt==4){
			number += ch + " ";
		}
		else if(cnt==8){
			number += ch + " ";
		}
		else if(cnt==12){
			number += ch + " ";
		}
		else if(nextHandler!=null)
			nextHandler.key(ch,cnt);
	}
		// if ( cnt <= 16 )
		// 	number += ch ;
		// else if ( nextHandler != null )
		// 	nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}