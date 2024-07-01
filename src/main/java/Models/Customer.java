package Models;


import javax.xml.bind.annotation.XmlRootElement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
@XmlRootElement (name = "Customer")
public class Customer extends User{
    CreditCard creditcard;
    Customer(String Fullname, String username, String password, String address) {
        super(Fullname, username, password);
    }

    String getUsername(){
        return username;
    }
    void changePassword(String newPassword) {
        this.password = newPassword;
    }

    void addCreditCard(Number, CVV, Type, expmonth, expyear) {
        creditcard = new CreditCard(Number, CVV, Type, expmonth, expyear);
    }

     void removeShoppingCard(class ShoppingCard){
            if(!(card.getStatus().equals("Active"))){
                System.out.println("The card can't be deleted");
            }
            else{
                ShoppingCard = null;
            }
        }
    }
}