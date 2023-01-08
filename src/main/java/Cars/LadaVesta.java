package Cars;

import Abstract.Car;
import Abstract.iRefueling;
import Enums.TypeFuel;

public class LadaVesta extends Car implements iRefueling {

    public LadaVesta() {
        setFuelType(TypeFuel.GASOLINE);
    }

    @Override
    public void fuel() {
        System.out.println("Full Tank of GASOLINE, please...");
    }
}
