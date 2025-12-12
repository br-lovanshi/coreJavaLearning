package collections.Nov03Revision;


// Sealed class : Control which class can extend or implement
//public sealed class Shape permits Circle, Rectangle { }
//
//final class Circle extends Shape { }
//final class Rectangle extends Shape { }

class Java17Features {
    public static void main(String[] args) {

        Object obj = "Bharat";
        if (obj instanceof String) {
            System.out.println(((String) obj).toUpperCase()); // no need to cast obj -> string after instanceof check
        }
    }
}


//class Animal {
//    private int id;
//    private String Name;
//    private boolean canFly;
//}

record Animal(int id, String name, double cgpa) {

    @Override
    public String name() {
        return name;
    }
}
