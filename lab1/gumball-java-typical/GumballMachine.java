
public class GumballMachine
{

    private int num_gumballs;
    private int gumball_price;
    private String gumball_type;
    private boolean has_quarter;
    private int total;

    public GumballMachine(int size,int price,String type)
    {
        // initialise instance variables
        this.num_gumballs = size; //number of ball
        this.gumball_price = price; //price of a ball
        this.gumball_type = type;
        this.has_quarter = false;
        this.total = 0;
    }

    public void insertQuarter(int coin)
    {
        if ( (coin == 25) && (this.gumball_price == 25) && (this.gumball_type.equals("Quarter"))){ 
            this.has_quarter = true ;
        }
        else if(coin == 25 && gumball_price == 50 && gumball_type.equals("Quarter")){
            total += coin;
        }else if( gumball_price == 50 && !gumball_type.equals("Quarter")){
            total += coin;
        }
        else {
              System.out.println( "Coin eject..." ) ;
            }
        }
    
    public void turnCrank()
    {
        if ( this.has_quarter || (this.total >= this.gumball_price) )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your Coins.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter or coins" ) ;
        }        
    }
}
