package models;

public class Customer {
    private String customerId;
    private String email;
    private String name;

    public Customer(String customerId, String email, String name){
        this.customerId = customerId;
        this.email = email;
        this.name = name;
    }

    public String getUserName(){
        return name;
    }
}
