package collections.Nov03Revision.solid;

interface Vehicle{
    void startEngin();
    void climateAcOn();
}

class Cycle implements Vehicle {

    @Override
    public void startEngin() {
        throw new UnsupportedOperationException("Does not have engin");
    }

    @Override
    public void climateAcOn() {
        throw new UnsupportedOperationException("Does not have AC");
    }
}
public class LSP {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        cycle.climateAcOn();
    }
}

// Subclass should exactly the copy of parent class without failure.