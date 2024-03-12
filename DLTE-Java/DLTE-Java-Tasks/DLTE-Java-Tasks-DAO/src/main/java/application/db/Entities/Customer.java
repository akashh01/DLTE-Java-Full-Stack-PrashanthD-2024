package application.db.Entities;


import java.util.ArrayList;

public class Customer{

    private String username;
    private String password;
    private String address;
    private String email;
    private Long contact;
    private Long initialBalance;
    private ArrayList transaction;

    public Customer() {
    }

    public Customer(String username, String password, String address, String email, Long contact, Long initialBalance, ArrayList transaction) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.email = email;
        this.contact = contact;
        this.initialBalance = initialBalance;
        this.transaction = transaction;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public Long getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Long initialBalance) {
        this.initialBalance = initialBalance;
    }

    public ArrayList getTransaction() {
        return transaction;
    }

    public void setTransaction(ArrayList transaction) {
        this.transaction = transaction;
    }

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }
}