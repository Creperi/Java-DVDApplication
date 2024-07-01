package Models;

import jakarta.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
@XmlRootElement
class ShoppingCard{
    private String ID;
    private String customerID;
    private int creationday;
    private int creationmonth;
    private int creationyear;
    private String status;
    private double balance = 0.0f;
    ShoppingCard(String ID, String customerID, int creationday, int creationmonth, int creationyear){
        this.ID = ID;
        this.customerID = customerID;
        this.creationday = creationday;
        this.creationmonth = creationmonth;
        this.creationyear = creationyear;
    }
    public void generateID() {
        if (ID == null) {
            byte[] array = new byte[16];
            new SecureRandom().nextBytes(array);
            ID = new String(array, StandardCharsets.UTF_8);
        } else {
            System.out.println("ID can't be generated");
        }
    }
    
    void addBalance(double balance){
        this.balance = this.balance + balance;
    }
    void setId(String ID){
        this.ID = ID;
    }
    void setStatus(String status){
        this.status = status;
    }
    String getStatus(){
        return status;
    }
    @Produces("text/html")
    public String getPurchaseCard() {
        return "ID: " + ID + "<br>customerID: " + customerID + "<br>creationDate: " + creationday + "/" + creationmonth + "/" + creationyear + "<br>balance: " + balance;
    }
    public void removeShoppingCard(ShoppingCard card) {
        if (!card.getStatus().equals("Active")) {
            System.out.println("The card can't be deleted");
        } else {
            card = null;
        }
    }

}