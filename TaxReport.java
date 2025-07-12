public class TaxReport {

    private TaxCalculator calculator;


    public void showTax(){
        var taxCalculator = new TaxCalculator(100_000);
        var tax = taxCalculator.calculateTax(0.3F, 1000);
        System.out.println(tax);
    }
}
