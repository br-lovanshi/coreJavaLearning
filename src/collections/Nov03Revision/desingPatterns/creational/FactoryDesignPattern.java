package collections.Nov03Revision.desingPatterns.factory;

interface Employee{
    int salary();

}

class BackendDeveloper implements Employee{

    @Override
    public int salary() {
        return 1000000;
    }
}

class FrontendDeveloper implements Employee{

    @Override
    public int salary() {
        return 800000;
    }


}

abstract class EmployeeFactory{
   abstract Employee createEmployee();
}

class FrontendDeveloperFactory extends EmployeeFactory{

    public Employee createEmployee(){
        return new FrontendDeveloper();
    }
}

class BackendDeveloperFactory extends EmployeeFactory{

    @Override
    Employee createEmployee() {
        return new BackendDeveloper();
    }
}

public class FactoryDesignPattern {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new BackendDeveloperFactory();
        Employee employee = employeeFactory.createEmployee();
        System.out.println(employee.salary());
    }
}


// follow open close principle
// Interface produce the same type of subclass based on the requirements