package collections.Nov03Revision.desingPatterns.Structure;

import com.sun.tools.javac.Main;

class DvdPlayer{
    void on(){
        System.out.println("On dvd player");
    }

    void play(String movie){
        System.out.println("Playing movie " + movie);
    }

}

class SoundSystem{
    void on(){
        System.out.println("On sound system");
    }
}

class Projector{
    void on(){
        System.out.println("On projector");
    }
}

class HomeTheater{
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    HomeTheater(DvdPlayer dvdPlayer, Projector projector, SoundSystem soundSystem){
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String name){
        dvdPlayer.on();
        projector.on();
        soundSystem.on();
        dvdPlayer.play(name);
    }
}
public class Facade {

    public static void main(String[] args) {
        HomeTheater homeTheater = new HomeTheater(new DvdPlayer(), new Projector(), new SoundSystem());
        homeTheater.watchMovie("Ramayan");
    }
}


// Facade pattern hides complex subsystem interactions behind one simple interface
// Zomato is facade :- Restaurant, delivery, payment tracking all are managing while pressing order