public class Debugger {
    public static void main(String [] args){


        var employee = new Employee(50000, 500);
        int salary = employee.calculateSalary(4);
        System.out.println(Employee.noOfEmployees);
//        System.out.println(Employee.getNoOfEmployees());




//        employee.calculateSalary(4) // instance member
//        employee.test ; // instance
//
//        employee.setBaseSalary(50000);
//        employee.setHourlyRate(500);
        // math calculation
//        int employeSalary2 = employee.calculateSalary(0); // it should not perform calculation and should return base salary
//        int s

//        System.out.println(employeSalary2);

        // constructor overloading

        // different implemation for same method
//       // calculateSalary()
        //calculateSalary(extraHours)
        //calculateSalary(extraHours, position)
//
//        System.out.println(salary);
        // A speca



//        System.out.println(salary);
//        employee.baseSalary

//        String name = "hello"; // strings are immutable
//        String upperCase = name.toUpperCase();
//        System.out.println(name.toUpperCase());
//        StringBuilder name = new StringBuilder("hello"); // mutable
//         name.append(" world");
//         name.toString()
//         name.toString().
//
//         int
//        System.out.println(name.toString());

//        Setters(mutators), getters(accessors)

        // constructor --
        // a special method the will be called when we create a new object
        // is used to initialize the values/ variables / fields


//        System.out.println("start");
        printNumbers(10);
//        System.out.println("end");
    }

    public static void printNumbers(int number){

        for(int i =1; i<=10; i++){
//            System.out.println(i);
        }

    }
}
