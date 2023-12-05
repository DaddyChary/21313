/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.sql.Date;

/**
 *
 * @author DaddyChary
 */
public class Venta {
    
    private int id;
    private int productID;
    private int price;
    private int total_ventas;
    private String productName;
    private String userName;
    private int userID;
    private int amount;
    private Date fecha;
    

    public Venta() {
    }

    public Venta(int id, int productID, int price, int total_ventas, String productName, String userName, int userID, int amount, Date fecha) {
        this.id = id;
        this.productID = productID;
        this.price = price;
        this.total_ventas = total_ventas;
        this.productName = productName;
        this.userName = userName;
        this.userID = userID;
        this.amount = amount;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal_ventas() {
        return total_ventas;
    }

    public void setTotal_ventas(int total_ventas) {
        this.total_ventas = total_ventas;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", productID=" + productID + ", price=" + price + ", total_ventas=" + total_ventas + ", productName=" + productName + ", userName=" + userName + ", userID=" + userID + ", amount=" + amount + ", fecha=" + fecha + '}';
    }

}
