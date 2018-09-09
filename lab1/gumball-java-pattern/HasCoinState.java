

import java.util.Random;

public class HasCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int coin) {
	        if(gumballMachine.price == 25 || gumballMachine.total > 50 )
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectCoin() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		if(gumballMachine.total >= 50 || gumballMachine.price == 25) 
		gumballMachine.setState(gumballMachine.getSoldState());
		else
		gumballMachine.setState(gumballMachine.getNoCoinState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
