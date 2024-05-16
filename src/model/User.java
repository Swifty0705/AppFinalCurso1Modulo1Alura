package model;

import java.util.Scanner;

public class User {

    static int id;
    private String username;
    private String email;
    private String phone;
    private String address;
    Scanner sc = new Scanner(System.in);

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        id++;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return "Username: "+username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return "Correo electronico: "+ email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return"Telefono: "+ phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return "Dirección: "+address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void writeUser(){
        System.out.println("Digite el email");
        this.setEmail(sc.nextLine());
        System.out.println("Digite la dirección");
        this.setAddress(sc.nextLine());
        System.out.println("Digite el telefono");
        this.setPhone(sc.nextLine());
    }

    public void readUser(){
        System.out.println(this.getId());
        System.out.println(this.getUsername());
        System.out.println(this.getEmail());
        System.out.println(this.getPhone());
        System.out.println(this.getAddress());
    }


}
