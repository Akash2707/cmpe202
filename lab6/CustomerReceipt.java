
 
public class CustomerReceipt implements Receipt
{
    // instance variables - replace the example below with your own
    public CustomerReceipt()
    {
    }
    
    public Component printSequence() {

        Composite customerReceipt = new Composite( "Customer Receipt" ) ;
        
        CustomBurger customBurger = new CustomBurger( "" ) ;
        Burger burger = new Burger("1. LBB",5.59);
        Bacon bacon = new Bacon("{{{Bacon}}}");
        Lettuce lettuce = new Lettuce("Lettuce");
        Tomato tomato = new Tomato("Tomato");
        GOnion gonion = new GOnion("->|G Onion");
        GJalapeno gjalapeno = new GJalapeno("->|G Jalapeno");
        Fries fries = new Fries("2. LTL CAJ",2.79);
        
        customerReceipt.addChild( customBurger ) ;
        
        customBurger.addChild( burger ) ;
        customBurger.addChild( bacon ) ;
        customBurger.addChild( lettuce ) ;
        customBurger.addChild( tomato ) ;
        customBurger.addChild( gonion ) ;
        customBurger.addChild( gjalapeno ) ;
        customerReceipt.addChild(fries);
        
        return customerReceipt;

    }

 }
