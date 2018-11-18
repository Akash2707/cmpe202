
/**
 * Write a description of class PersonalTaxRebateStrategy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonalTaxRebateStrategy implements TaxStrategy
{    
    /**
     * Constructor for objects of class PersonalTaxRebateStrategy
     */
    public PersonalTaxRebateStrategy()
    {
        
    }

    /**
     *
     * @param  income  for calculating the income     
     * @return  tax
     */
    
     @Override

    public double calculateTax(double income) {
        System.out.println("PersonalTaxWithRebate   ");
        double tax = income * 0.2       ;
        return tax;

    }
}
