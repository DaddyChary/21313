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
public class Filtro {
    
    private int id;
    private int price;
    private int user_id;
    private int amount;
    private Date date;

    public Filtro() {
    }

    public Filtro(int price, int id, int user_id, int amount, Date date) {
        this.price = price;
        this.id = id;
        this.user_id = user_id;
        this.amount = amount;
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Filtro{" + "price=" + price + ", id=" + id + ", user_id=" + user_id + ", amount=" + amount + ", date=" + date + '}';
    }
    
}
