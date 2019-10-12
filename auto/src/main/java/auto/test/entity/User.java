package auto.test.entity;

public abstract class User {
    protected String name;
    protected String email;
    protected String phone;
    protected String password;
    protected User(String email,String password,String name,String phone){
        this.email = email;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }
    protected abstract User register(User user);

}
