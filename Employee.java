public class Employee {

        private int baseSalary;
       public  static int noOfEmployees = 500;
        private int hourlyRate;
////
//    public  Employee(){
//
//    }
        public Employee(int baseSalary, int hourlyRate){
            setBaseSalary(baseSalary);
            setHourlyRate(hourlyRate);
        }

        public static int getNoOfEmployees(){
            return noOfEmployees;
        }

    public int calculateSalary(int extraHours ){
            noOfEmployees++;
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

//  git add . -- will add the files
// git add file.java

// git commit -m ""


// instance members -- is accessible only after creating an instance
// static members or class members ---> to access static members we dont need to create an instance

//members --> fields and methods


// git push --> push your changes to git hub (online)

// git -->
// github, bitbucket