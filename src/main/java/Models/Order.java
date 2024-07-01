package Models;


import Models.DVD;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
@XmlRootElement
public class Order{
    private String Order_ID;
    private String Deliveraddress;
    private String status;
    private String Customer_ID;
    private String Card_ID;
    private String ISBN;
    private int orderDay;
    private int orderMonth;
    private int orderYear;
    private int completionday;
    private int completionmonth;
    private int completionyear;
    ArrayList<DVD> DVDs = new ArrayList<DVD>();
    Order(String Order_ID, String Deliveraddress, String status, String Customer_ID, String Card_ID, String ISBN, int orderDay, int orderMonth, int orderYear){
        this.Order_ID = Order_ID;
        this.Deliveraddress = Deliveraddress;
        this.status = status;
        this.Customer_ID = Customer_ID;
        this.Card_ID = Card_ID;
        this.ISBN = ISBN;
        this.orderDay = orderDay;
        this.orderMonth = orderMonth;
        this.orderYear = orderYear;
    }
    public void UpdateStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
    String getCustomerID(){
        return Customer_ID;
    }
    public String getID(){
        return Order_ID;
    }
    public String viewOrder(){
        return "Order ID: " + Order_ID + "\nDelivery Address: " + Deliveraddress
                + "\nStatus: " + status + "\nCustomer ID: " + Customer_ID +
                "\nShopping Card ID: " + Card_ID + "\nISBN: " + ISBN +
                "\nDate of order: " + Integer.toString(orderDay) + "/" + Integer.toString(orderMonth)  + "/" +
                Integer.toString(orderYear);
    }
    
}