package functionalProgramming;

public class Student {
    private int roll;
    private String name;
    private double score;

    public Student(int roll, String name, double score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
