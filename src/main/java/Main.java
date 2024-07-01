import Models.Customer;
import Models.DVD;
import Models.CreditCard;
import Models.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
package net.codejava.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Scanner;
package com.vogella.jersey.jaxb;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
class Employee extends User{
    private String role;
    Customer(String Fullname, String username, String password, String role){
        Super(Fullname, username, password);
        this.role = role;
    }
    String getRole(){
        return role;
    }
}
}


void SQLinjecton(){
    ArrayList<DVD> DVDs = new ArrayList<DVD>();
    ArrayList<Customer> Customers = new ArrayList<Customer>();
    ArrayList<Employee> Employees = new ArrayList<Employee>();
    ArrayList<Order> Orders = new ArrayList<Order>();
    try (Conntection){
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/dvd_club","root","");
        Statement stmt=con.createStatement();
        stmt.addBunch("select * from DVD");
        stmt.addBunch("select * from Users");
        stmt.addBunch("select * from Customers");
        stmt.addBunch("select * from Employees");
        stmt.addBunch("select * from Orders");
        stmt.executeBatch();
        while(rs.next()){

            DVD.add(rs.getString('ID'),//Μπαίνουν οι υπόλοιπες μεταβλητές//);
        }
        //...Τα επόμενα ισχύουν και για τους υπόλοιπους πίνακες
    }
    catch{

    }

}

public static void Main(){
        public static void main(String[] args) {
            String uri = "https://localhost:8080/My-Jersey-Project/rest/emp/getEmp";
            EmpRequest request = new EmpRequest();
            // set id as 1 for OK response
            request.setId(2);
            request.setName("PK");
            try {
                Client client = Client.create();
                WebResource r = client.resource(uri);
                ClientResponse response = r.type(MediaType.APPLICATION_XML).post(ClientResponse.class, request);
                System.out.println(response.getStatus());
                if (response.getStatus() == 200) {
                    EmpResponse empResponse = response.getEntity(EmpResponse.class);
                    System.out.println(empResponse.getId() + "::" + empResponse.getName());
                } else {
                    ErrorResponse exc = response.getEntity(ErrorResponse.class);
                    System.out.println(exc.getErrorCode());
                    System.out.println(exc.getErrorId());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
