
/**
 * Write a description of class PersonalTaxStrategy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonalTaxStrategy implements TaxStrategy
{
    /**
     * Constructor for objects of class PersonalTaxStrategy
     */
    public PersonalTaxStrategy()
    {
        // initialise instance variables
    
    }

    /**
     *
     * @param  income  for calculating the income     
     * @return  tax
     */
    
     @Override

    public double calculateTax(double income) {
        System.out.println("PersonalTax");
        double tax = income * 0.3;
        return tax;

    }

}
