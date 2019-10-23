package auto.test.service;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import auto.test.entity.BrokenDescription;
import auto.test.entity.Car;
import auto.test.entity.Owner;
import auto.test.entity.Vehicles;
import auto.utils.FileUtils;

public class FileOfGarage implements Garage {
    public BrokenDescription descriptionAboutStatusOfVehicle(Owner owner, Vehicles vehicels) throws IOException {
       FileUtils.writeToFile(FileUtils.FILENAME,"Name: "+owner.getName()+"--Address: " +owner.getAddress() + "--Email: " + owner.getEmail());
       return null;
    }
    /*public BrokenDescription descriptionAboutStatusOfVehicelCar(Owner owner, Car car) throws IOException {
       FileUtils.writeToFile(FileUtils.FILENAME,"numberPanel: " + car.getnumberPanel()+"Status: "+ car.getStatus());
       return null;
    }*/

    public List<Owner> getOwners() {
        List<Owner> listOwner = new ArrayList<Owner>();
        File file = new File(FileUtils.FILENAME);
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("Address:")) {
                    String data[] = line.split("--");
                    Owner o = new Owner(data[2].split(":")[1],"",data[0].split(":")[1],"",data[1].split(":")[1]);
                    listOwner.add(o);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOwner;
    }
   //=====================================================================================================
   /* public List<Car> getCar() {
        List<Car> listCar = new ArrayList<Car>();
        File file = new File(FileUtils.FILENAME);
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("numberPanel:")) {
                    String data[] = line.split("--");
                    Car c=new Car(data[0].split(":")[1],"",data[0].split(":")[1],"",data[0].split(":")[1]);
                    listCar.add(c);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listCar;
    }*/



    public void giveContract() {

    }
}
