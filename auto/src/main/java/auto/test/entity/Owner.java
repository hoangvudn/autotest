package auto.test.entity;

public class Owner extends User {
    private String address;
    public Owner(String email, String password, String name, String phone, String address) {
        super(email, password, name, phone);
        this.address = address;
    }

    public User register(User user) {
        System.out.println("Name: "+this.name+ " Address: "+this.address);
        return new Owner(user.email,user.password,user.name,user.phone,this.address);
    }
}
