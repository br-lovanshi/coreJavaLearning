package designPatterns;

import java.util.ArrayList;
import java.util.List;

interface Observer1{
    void update(String title);
}

interface Subject{
    void subscribe(Observer1 observer);
    void unsubscribe(Observer1 observer);
    void notifyObserver(String title);
}

class Channel implements Subject{
    private List<Observer1> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer1 observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer1 observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObserver(String title) {
        for(Observer1 observer: subscribers){
            observer.update(title);
        }
    }

    public void uploadVideo(String title){
        System.out.println("New video uploaded.");
        notifyObserver(title);
    }
}
class Subscriber implements Observer1{

    @Override
    public void update(String title) {
        System.out.println("Title:- " + title);
    }
}


public class Observer {
    public static void main(String[] args) {
        Channel youTubeChannel1 = new Channel();
        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        Subscriber subscriber3 = new Subscriber();
        youTubeChannel1.subscribe(subscriber1);
        youTubeChannel1.subscribe(subscriber2);
        youTubeChannel1.subscribe(subscriber3);

        // notified to all subscribers
//        youTubeChannel1.uploadVideo("Learn about Observer Design Pattern");

        // students example:

        SendUpdate sendUpdate = new SendUpdate();
        sendUpdate.add(new Students("Brajesh"));
        sendUpdate.add(new Students("Vicky"));
        sendUpdate.notifyStudents("Today is leave...");
    }
}

/**
 * Observer pattern is useful or applied when you want to stablish one to many relationship, when one object change or update it will notified to all its observer
 * Example: YouTube change when new video upload it will update/notified to all its subscribers.
 * It is event drive architecture.
 * */


interface Info{
    void update(String msg);
}

class Students implements Info{
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