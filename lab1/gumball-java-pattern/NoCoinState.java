

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        /* if ( (coin == 25) && (gumballMachine.price == 25) && (gumballMachine.type.equals("Quarter"))){ 
           System.out.println("You inserted a coin");  
           gumballMachine.setState(gumballMachine.getHasCoinState());
        }
        else if((coin == 25 && gumballMachine.price == 50 && gumballMachine.type.equals("Quarter")) || 
                (gumballMachine.price == 50 && !gumballMachine.type.equals("Quarter"))){
           System.out.println("You inserted a coin");
           gumballMachine.total += coin;
           if(gumballMachine.total >=50)
           gumballMachine.setState(gumballMachine.getHasCoinState());
              }else{
                  System.out.println("You haven't inserted a quarter");  
               }*/
        if( coin == 25){
             System.out.println("You inserted a coin");  
             gumballMachine.total += coin;
             if(gumballMachine.price == 25 || gumballMachine.total >=50 )
                gumballMachine.setState(gumballMachine.getHasCoinState());
        }else if(!gumballMachine.type.equals("Quarter")){
                 System.out.println("You inserted a coin");
                 gumballMachine.total += coin;
                 if(gumballMachine.total >=50)
                 gumballMachine.setState(gumballMachine.getHasCoinState());
                }else{
                  System.out.println("You haven't inserted a quarter");  
               }
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a quarter");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter or coin");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}
