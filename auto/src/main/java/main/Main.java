package main;

import auto.test.entity.Owner;


public class Main {
    public static void main(String[] args) {
        Owner user = new Owner("vu@gmail.com","12345","Hoang Vu","0905667877","2 Me nu");
        user.register(user);
    }
}
