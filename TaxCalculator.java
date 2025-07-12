public class TaxCalculator {
    private double taxableIncome;

    public TaxCalculator(double income){
        this.taxableIncome = income;
    }

    public double calculateTax(float rate, int insurance){
        return taxableIncome * rate;
    }
}
