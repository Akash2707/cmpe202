
public class Leaf implements Component {

    private String description ;
    protected Double price ;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public Leaf ( String d ) 
    {
        description = d ;
        price = 0.0 ;
    }
    
    public void printDescription() {

        if (price > 0)
            description = description + " " + String.valueOf(price);  
            
        System.out.println( description ) ;
    
}
    
    public double Price() {
        return price;
      }

    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
     
}
 
