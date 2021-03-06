/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp extends DisplayComp
{

	private String date = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		return date;
	}	

	public void key(String ch, int cnt) {
		if (cnt >= 17 && cnt <= 20){
			if (ch.toLowerCase().matches("x|delete") && date.length() > 0) {
				date = date.substring(0, date.length() - 1);
			}else {
				date += ch;
			}
		 } else if (nextHandler != null)
				nextHandler.key(ch, cnt);
	}

	public void addSubComponent(IDisplayComponent c) {
		return; // do nothing
	}

}