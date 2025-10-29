package designPatterns.revision;



class MathsSubject{
    private static MathsSubject mathsSubject;
    private MathsSubject(){};
    public synchronized static MathsSubject getMathSubject(){
        if (mathsSubject == null) {
                mathsSubject = new MathsSubject();
        }
        return mathsSubject;
    }
}

public class SingletonRev {
    public static void main(String[] args) {
       MathsSubject mathsSubject = MathsSubject.getMathSubject();
    }
}
