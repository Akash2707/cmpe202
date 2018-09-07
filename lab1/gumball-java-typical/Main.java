

public class Main {

    public static void main(String[] args) {
        
        GumballMachine gumballMachine1 = new GumballMachine(1,25,"Quarter");
          
        System.out.println("GumballMachine 1 : ");
        
        gumballMachine1.insertQuarter( 10 );
        gumballMachine1.turnCrank();
        gumballMachine1.insertQuarter( 25 );
        gumballMachine1.turnCrank();
        gumballMachine1.insertQuarter( 25 );
        gumballMachine1.turnCrank();
        
        GumballMachine gumballMachine2 = new GumballMachine(4,50,"Quarter");
        
        System.out.println(" ");
        System.out.println("GumballMachine 2 : ");
        
        gumballMachine2.insertQuarter( 10 );
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.turnCrank();
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.turnCrank();
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.turnCrank();
        
        GumballMachine gumballMachine3 = new GumballMachine(5,50,"Any");
        
        System.out.println(" ");
        System.out.println("GumballMachine 3 : ");
        
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.insertQuarter( 25 );
        gumballMachine3.turnCrank();
        gumballMachine3.insertQuarter( 25 );
        gumballMachine3.turnCrank();
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.insertQuarter( 5 );
        gumballMachine3.insertQuarter( 25 );
        gumballMachine3.turnCrank();
       
        
        
        
}
}