package designPatterns;

class Principle{
    private static Principle principle;

    private Principle(){
        System.out.println("Principle");
    }

    public static Principle getInstance(){
        if(principle != null){
            synchronized (Principle.class) {
                principle = new Principle();
            }
        }
        return principle;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Principle principle = Principle.getInstance();
        System.out.println(principle);
    }
}
