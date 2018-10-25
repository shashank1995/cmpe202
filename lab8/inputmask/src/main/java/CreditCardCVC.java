/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IKeyEventHandler prevHandler ;
	private String cvc = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }

    public void setPrev ( IKeyEventHandler prev) {
    	this.prevHandler = prev ;
    }	

	public String display() {
		if ( cvc.equals("") )
			return "[123]" + "  " ;
		else
			return "[" + cvc + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if(ch.equals("X") && cnt==21){
			prevHandler.key("Z",100);
		}
		if(cnt==24 && ch.equals("X")){
			cvc=cvc.substring(0,2);
		}
		if(ch.equals("X")){
			if(cnt==22)
				cvc="";
			else if(cnt==23)
				cvc=cvc.substring(0,1);
		}
		else{
			if ( cnt >= 21 && cnt <= 23 )
				cvc += ch ;
			else if ( nextHandler != null )
				nextHandler.key(ch, cnt) ;
		}
		}
	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}