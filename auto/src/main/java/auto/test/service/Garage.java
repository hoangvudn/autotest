package auto.test.service;

import auto.test.entity.BrokenDescription;
import auto.test.entity.Car;
import auto.test.entity.Owner;
import auto.test.entity.Vehicles;

import java.io.IOException;
import java.util.List;

public interface Garage {
    BrokenDescription descriptionAboutStatusOfVehicle(Owner owner, Vehicles vehicels) throws IOException;
    //BrokenDescription descriptionAboutStatusOfVehicelCar(Owner owner, Car car) throws IOException;
    //List<Owner> getOwners();
    //List<Car> getCar();

    void giveContract();
}
