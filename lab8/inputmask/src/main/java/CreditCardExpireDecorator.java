/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExpireDecorator extends decorator
{   
    final static String slash = "/"; 
	public CreditCardExpireDecorator(DisplayComp c){
        super(c);
     }
  
	public String display() {
        String cardExDate = this.component.display();
        StringBuilder ExDate = new StringBuilder();
        if ( cardExDate.equals("") )
            ExDate.append("[MM/YY]" + "  ");
        else  {
            ExDate.append("[");
            for(int i=0;i<cardExDate.length();i++) {
                if(i==2)
                    ExDate.append(slash + cardExDate.charAt(i));
                else
                    ExDate.append(cardExDate.charAt(i));
            }

            ExDate.append("]  " );
        }
		return ExDate.toString();
	}	

	

}