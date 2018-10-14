
public class PackingSlip implements Receipt
{
    public PackingSlip()
    {

    }
    
     public Component printSequence() {
        Composite packageSlip = new Composite( "Packing Slip" ) ;
        
        CustomBurger customBurger = new CustomBurger("1. LBB") ;
        Bacon bacon = new Bacon("{{{Bacon}}}");
        Lettuce lettuce = new Lettuce("Lettuce");
        Tomato tomato = new Tomato("Tomato");
        GOnion gonion = new GOnion("->|G Onion");
        GJalapeno gjalapeno = new GJalapeno("->|G Jalapeno");
        Fries fries = new Fries("1. LTL CAJ");
        
        packageSlip.addChild( customBurger );
        customBurger.addChild( lettuce ) ;
        customBurger.addChild( tomato ) ;
        customBurger.addChild( gonion ) ;
        customBurger.addChild( gjalapeno ) ;
        customBurger.addChild( bacon ) ;
        packageSlip.addChild(fries);
        
        return packageSlip;

    }
}

