package designPatterns;

interface CertificatePrototype {
    CertificatePrototype clone();
}

class EmployeeCertificate implements CertificatePrototype {
    private int id;
    private String name;

    public EmployeeCertificate(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public CertificatePrototype clone() {
        return new EmployeeCertificate(id, name);// shallow copy
//        return new EmployeeCertificate(id, new String(name)); // deep copy
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeCertificate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Prototype {
    public static void main(String[] args) {
        EmployeeCertificate original = new EmployeeCertificate(1, "Ram");
        System.out.println(original);
        EmployeeCertificate employee2 = (EmployeeCertificate) original.clone();
        employee2.setName("Shyam");
        System.out.println(employee2);
    }
}


/** Prototype design pattern is used when you don't want to create new object/ when using new keyword is costly(memory/time)
 Use Prototype Design Pattern when: Don't wanna write code from screatch, reuse object, similar or duplicate object.

 Shallow copy:- When you copy the object but not its inner references
 Deep Copy:- Copy object and its inner reference

 Q: What's the difference between new and clone()?
 ✅ new calls the constructor, clone() copies the object without calling the constructor.

 Q1. What design principle does Prototype Pattern follow?
 ✅ Avoids repetitive object creation logic.

 Q2. Which interface is used for cloning in Java?
 ✅ The Cloneable marker interface.

 Q3. Does clone() do deep copy or shallow copy by default in Java?
 ✅ Shallow copy.


 **/