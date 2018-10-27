/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNumberDecorator extends decorator
{   
    final static String space = " "; 
	public CreditCardNumberDecorator(DisplayComp c){
        super(c);
     }
  
	public String display() {
        String count = this.component.display();
        StringBuilder cardNumber = new StringBuilder();
        if ( count.equals("") )
            cardNumber.append("[4444 4444 4444 4444]" + "  ");
        else  {
            cardNumber.append("[");
            for(int i=0;i<count.length();i++) {
                if(i==4 || i==8 || i==12)
                    cardNumber.append(space + count.charAt(i));
                else
                    cardNumber.append(count.charAt(i));
            }
            cardNumber.append("]  ");
        }
		return cardNumber.toString();
	}	

	

}