public class TaxCalculator2025 implements TaxCalculator  {
    private double taxableIncome;

    public TaxCalculator2025(double income){
        this.taxableIncome = income;
    }

    //annotations -->
    @Override
    public double calculateTax(float rate){
        return taxableIncome * rate;
    }
}


// interface ---> TaxCalculator

// final classes --> when we make class as final
