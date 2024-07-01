package Models;


import Models.User;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
@XmlRootElement (name = "Credit Card")
class CreditCard{
    private String Number;
    private int CVV;
    private String Type;
    private int expmonth;
    private int expyear;
    CreditCard(String Number, int CVV, String Type, int expmonth, int expyear) {
        this.Number = Number;
        this.CVV = CVV;
        this.Type = Type;
        this.expmonth = expmonth;
        this.expyear = expyear;
    }

}