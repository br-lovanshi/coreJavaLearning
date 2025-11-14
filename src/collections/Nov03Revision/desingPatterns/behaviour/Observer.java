package collections.Nov03Revision.desingPatterns.Structure;

import java.util.ArrayList;
import java.util.List;


class Observers{
    private User user;

    Observers(User user){
        this.user = user;
    }

    public void notified(String message){
        user.update(message);
    }

}

class User {
    private String name;

    User(String name){
        this.name = name;
    }

    public void update(String message){
        System.out.println("Dear " + name + " " + message);
    }
}

class Channel{
    List<Observers> observerList = new ArrayList<>();


    public void subscribe(Observers observer){
        observerList.add(observer);
    }

    public void unsubscribe(Observers observers){
        observerList.remove(observers);
    }

    public void notification(String msg){
        for(Observers observers: observerList){
            observers.notified(msg);
        }
    }
}

public class Observer {
    public static void main(String[] args) {

        Observers o1 = new Observers(new User("Ram"));
        Observers o2 = new Observers(new User("Ravi"));
        Observers o3 = new Observers(new User("Karan"));

        Channel channel = new Channel();
        channel.subscribe(o1);
        channel.subscribe(o2);
        channel.subscribe(o3);

        channel.notification("New video is live now");

    }
}


// structure design pattern
// follow pub-sub model
