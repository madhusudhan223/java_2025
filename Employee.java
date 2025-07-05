public class Employee {

        private int baseSalary;
        private int hourlyRate;
////
//    public  Employee(){
//
//    }
        public Employee(int baseSalary, int hourlyRate){
            setBaseSalary(baseSalary);
            setHourlyRate(hourlyRate);
        }

    public int calculateSalary(int extraHours ){
        return baseSalary +  (hourlyRate * extraHours);
    }
//    public int calculateSalary(){
//        return baseSalary ;
//    }



    private void setBaseSalary(int baseSalary){ // setter for base salary
        if(baseSalary < 0) {
            throw new IllegalArgumentException("Salary cant be nagative");
        }
        this.baseSalary = baseSalary ;
    }
    private void setHourlyRate(int hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }

}

// fileds variables  always should be private to the particular class--

// if you want set the field values --> use setters
// if you want to access the fields --> use getters


//encapsulation : Bundle the data and methods (that operates on data) in a single unit / class.

// defaults values for number --> 0
//booleans false
// reference --> null

// you made changes in your local
//git add - stages file
// git commit -m ""

//    git add . -- will add the files
// git add file.java

// git push --> git hub online