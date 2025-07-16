public class TaxReport {

    private TaxCalculator2025 calculator;

    public TaxReport(TaxCalculator2025 calculator) {
        this.calculator = calculator;
    }

    public void showTax(){
        var tax = calculator.calculateTax(0.3F);
        System.out.println(tax);
    }
}


// dependency injection ---> we should not create instances of their dependencies

// constructor injection
// setters injection
// method injection
