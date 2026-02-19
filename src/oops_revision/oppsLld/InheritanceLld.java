package oops_revision.oppsLld;

class Car{
    void start(){}
    void stop(){}
}

class ElectricCar extends Car{
    public void chargeBattery(){}
}

class DesilCar extends Car{
    public void fuelTank(){}
}

public class InheritanceLld {
    public static void main(String[] args) {
        Car electric = new ElectricCar();
        electric.start();
        electric.stop();
        ElectricCar electricCar = new ElectricCar();
        electricCar.chargeBattery();

        Car desilCar = new DesilCar();
        desilCar.stop();
    }
}
