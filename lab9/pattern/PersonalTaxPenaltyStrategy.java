
/**
 * Write a description of class PersonalTaxPenaltyStrategy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonalTaxPenaltyStrategy implements TaxStrategy
{
    /**
     * Constructor for objects of class PersonalTaxPenaltyStrategy
     */
    public PersonalTaxPenaltyStrategy()
    {

    }

    /**
     *
     * @param  income  for calculating the income     
     * @return  tax
     */
    
     @Override

    public double calculateTax(double income) {
        System.out.println("PersonalTaxWithPenalty");
        double tax = income * 0.4;
        return tax;

    }
}
