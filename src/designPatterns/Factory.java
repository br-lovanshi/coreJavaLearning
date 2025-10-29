package designPatterns;

interface Employee{
 void salary();
}
class SoftwareEngineer implements Employee{
    private int id;
    private String name;
    @Override
    public void salary() {
        System.out.println(50000);
    }
}
class WebDeveloper implements Employee{
    private int id;
    private String name;
    @Override
    public void salary() {
        System.out.println(40000);
    }
}
class EmployeeFactory{
    public static Employee getEmployee(String employeeType){
        if("SoftwareEngineer".equalsIgnoreCase(employeeType.trim())){
            return new SoftwareEngineer();
        }else if ("WebDeveloper".equalsIgnoreCase(employeeType.trim())){
            return new WebDeveloper();
        }else{
            return null;
        }
    }
}
public class Factory {
    public static void main(String[] args) {
        Employee engineer = EmployeeFactory.getEmployee("SoftwareEngineer");
        engineer.salary();

        Shoe office = ShoeFactory.getShoe("Office");
        office.type();

        Pen pen = PenFactory.getPen("ball");
        pen.PenIntro();
    }
}


/** Factory Design pattern hide the creation logic to the client, Object creation is centralized here.
 it is useful :
       - when we want to hide creation logic,
       - object is repeatable or similar,
        - Object creation logic is complex
        - When we want to apply open/closed principle
***/
interface Shoe{
    void type();
}
class SportShoe implements Shoe{

    @Override
    public void type() {
        System.out.println("Sport shoes");
    }
}

class OfficeShoe implements Shoe{

    @Override
    public void type() {
        System.out.println("Office wear");
    }
}

class ShoeFactory{
    public static Shoe getShoe(String type){
        if(type.trim().equalsIgnoreCase("SPORT")){
            return new SportShoe();
        }else if(type.trim().equalsIgnoreCase("OFFICE")){
            return new OfficeShoe();
        }else{
            return null;
        }
    }
}



interface Pen{
    void PenIntro();
}

class GelPen implements Pen{

    @Override
    public void PenIntro() {
        System.out.println("I'm gel pen.");
    }
}

class BallPen implements Pen{

    @Override
    public void PenIntro() {
        System.out.println("I'm ball pen.");
    }
}

class PenFactory{
   public static Pen getPen(String type){
        if(type.trim().equalsIgnoreCase("Gel")){
            return new GelPen();
        }else if(type.trim().equalsIgnoreCase("ball")){
            return new BallPen();
        }else return null;
    }
}