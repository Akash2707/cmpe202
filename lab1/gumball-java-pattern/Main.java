    

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5,25,"Quarter");

        System.out.println(gumballMachine);
        
        gumballMachine.insertCoin(10);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(25);
        gumballMachine.insertCoin(25);
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        

        GumballMachine gumballMachine1 = new GumballMachine(5,50,"Quarter");

        System.out.println(gumballMachine1);
        
        gumballMachine1.insertCoin(10);
        gumballMachine1.insertCoin(25);
        gumballMachine1.insertCoin(25);
        
        gumballMachine1.turnCrank();
        
        GumballMachine gumballMachine2 = new GumballMachine(5,50,"Any");

        System.out.println(gumballMachine2);
        
        gumballMachine2.insertCoin(10);
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin(10);
        gumballMachine2.insertCoin(10);
        gumballMachine2.insertCoin(10);
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin(20);
        gumballMachine2.turnCrank();
    }
}
