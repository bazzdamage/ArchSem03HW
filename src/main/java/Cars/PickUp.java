package Cars;

import Abstract.Car;
import Abstract.iRefueling;
import Abstract.iWipe;

public class PickUp extends Car implements iRefueling, iWipe {
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipeWindshield() {

    }

    @Override
    public void wipeHeadlights() {

    }

    @Override
    public void wipeRearMirror() {

    }
}
