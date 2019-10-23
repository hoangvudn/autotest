package auto.test.entity;

public abstract class Vehicles {
    protected String numberPanel;
    protected String color;
    protected String type;
    protected String brand;
    protected String id;

    protected Vehicles(String id, String numberPanel, String color, String type, String brand){
              this.numberPanel=numberPanel;
              this.id = id;
              this.color=color;
              this.type=type;
              this.brand=brand;

    }
    public String getNumberPanel() {
        return numberPanel;
    }

    public Vehicles(String numberPanel, String color, String type, String brand) {
    }


    protected abstract Vehicles registerVehicle(Vehicles vh);
}
