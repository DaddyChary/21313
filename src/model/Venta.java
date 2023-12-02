/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author DaddyChary
 */
public class Venta {
    
    private int id;
    private int productID;
    private int userID;
    private int amount;
    private LocalDate fecha;

    public Venta() {
    }

    public Venta(int id, int productID, int userID, int amount, LocalDate fecha) {
        this.id = id;
        this.productID = productID;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", productID=" + productID + ", userID=" + userID + ", amount=" + amount + ", fecha=" + fecha + '}';
    }


}
