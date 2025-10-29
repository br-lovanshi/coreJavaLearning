package designPatterns.revision;


import java.util.ArrayList;
import java.util.List;

interface Info{
    void update(String msg);
}

class Students implements Info {
    private String name;

    Students(String name){
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("Dear " + this.name + " " + msg);
    }
}

class SendUpdate{
    private static List<Students> studentsList = new ArrayList<>();

    public void add(Students students){
        studentsList.add(students);
    }
    public void notifyStudents(String msg){
        for(Students st: studentsList){
            st.update(msg);
        }
    }

}

public class ObserverRev {
    public static void main(String[] args) {

        // students example:

        SendUpdate sendUpdate = new SendUpdate();
        sendUpdate.add(new Students("Brajesh"));
        sendUpdate.add(new Students("Vicky"));
        sendUpdate.notifyStudents("Today is leave...");
    }
}
