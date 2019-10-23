package main;

import auto.test.entity.Owner;
import auto.test.entity.Car;
import auto.test.service.FileOfGarage;

import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
    //  Owner user = new Owner("vu@gmail.com","12345","Hoang Vu","0905667877","2 Me nu");
       // user.register(user);
//        Car vh=new Car("4545","Blue","Sport","Toyota","old");
//        vh.registerVehicle(vh);
        FileOfGarage fileOfGarage = new FileOfGarage();
        fileOfGarage.descriptionAboutStatusOfVehicle(new Owner("Vu@gmai", "ABC123", " Yuri", "090536456", " 12 Me Nhu"),
                new Car("123456", "David", "abc123", "xyt123", "123"));
        fileOfGarage.descriptionAboutStatusOfVehicle(new Owner("Duc Anh@yahoo", "DBC456", " Tommy", "123455", " 15 Le Van Thu"),
                new Car("123456", "Tom", "", "", "456"));
        fileOfGarage.descriptionAboutStatusOfVehicle(new Owner("Manh@gmail", "GTR789", " David", "8678886", " 17 Vo Nguyen Giap"),
                new Car("123456", "", "", "", "789"));
        fileOfGarage.descriptionAboutStatusOfVehicle(new Owner("Longh@Yahoo", "CIA989", " Jack", "8678", " 122 Le Van Thu"),
                new Car("123456", "", "", "", "999"));
        List<Owner> owners = fileOfGarage.getOwners();
        //List<Car> abc=fileOfGarrage.getCar();
        for (Owner o : owners) {
            System.out.println("Name:" + o.getName() + " -- Address:" + o.getAddress() + " -- Email:" + o.getEmail());
        }
        /*List<Car> cars=fileOfGarage.getCar();
        for (Car c:cars){
            System.out.println("--numberPanel: "+c.getnumberPanel()+"Status: "+c.getStatus());
        }*/
        //------------------Example Split statement-------------------------------
        String str="Nguyen@HoangVu@Gmail.com";
        String[] Arrstr=str.split("@",3);
        for (String a:Arrstr)
            System.out.println(a);
    }
}
