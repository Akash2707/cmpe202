import java.util.Arrays;
import java.util.List;

/**
 * Write a description of class TaxStrategyMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TaxStrategyMain
{
    /**
     * Constructor for objects of class TaxStrategyMain
     */
    public TaxStrategyMain()
    {
        
    }

    public static void main(String [] args) {

 
        //Create a List of Tax strategies for different scenarios
        List<TaxStrategy> taxStrategyList =
                Arrays.asList(
                        new PersonalTaxStrategy(),
                        new PersonalTaxPenaltyStrategy(),
                        new PersonalTaxRebateStrategy());

 
        //Calculate Tax for different scenarios with corresponding strategies
        for (TaxStrategy taxStrategy : taxStrategyList) {
            System.out.println(taxStrategy.calculateTax(30000.0));
        }
    }
}


