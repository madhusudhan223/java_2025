public class TaxReport {


    private TaxCalculator calculator;

//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    public void showTax(TaxCalculator calculator){
//        TaxCalculator.minimum_tax = 10;
        var tax = calculator.calculateTax(0.3F);
        System.out.println(tax);
    }

//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }


}


// dependency injection ---> we should not create instances of their dependencies

// constructor injection
// setters injection
// method injection
