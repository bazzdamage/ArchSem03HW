package Cars;

import Abstract.Car;
import Abstract.iRefueling;
import Enums.TypeFuel;

public class BMWX5D extends Car implements iRefueling {

    public BMWX5D() {
        setFuelType(TypeFuel.DIESEL);
    }

    @Override
    public void fuel() {
        System.out.println("Full Tank of Diesel, please...");
    }
}
