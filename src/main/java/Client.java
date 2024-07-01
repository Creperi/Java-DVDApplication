package com.vogella.jersey.jaxb;

import jakarta.ws.rs.*;
import java.util.HashMap;
import Models.Order;
import Models.Customer;
import jakarta.ws.rs.core.MediaType;


@Path("/main")
public class Client {
    private static HashMap<String, User> users = new HashMap<>();
    private static HashMap<String, Order> orders = new HashMap<>();
    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.TEXT_XML)
    public String register(User user) {
        if (users.containsKey(user.getUsername())) {
            return "<p>User already exists</p>";
        }
        users.put(user.getUsername(), user);
        return "<p>User registered successfully</p>";
    }

    @POST
    @Path("/order")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.TEXT_XML)
    public String generateOrder(Order order) {
        if (order == null) {
            return "<p>Failed to create order</p>";
        }
        orders.put(order.getID(), order);
        return "<p>Order created successfully</p>";
    }

    @PUT
    @Path("/order/{id}/status")
    @Produces(MediaType.TEXT_XML)
    public String updateOrderStatus(@PathParam("id") String id, @QueryParam("status") String status) {
        Order order = orders.get(id);
        if (order == null) {
            return "<p>Order not found</p>";
        }
        if (order.getStatus().equals("created") && (status.equals("charged") || status.equals("cancelled"))) {
            order.UpdateStatus(status);
        } else if (order.getStatus().equals("charged") && (status.equals("pending") || status.equals("completed"))) {
            order.UpdateStatus(status);
        } else if (order.getStatus().equals("pending")) {
            return "<p>The order is pending due to " + order.getReason() + "</p>";
        } else if (order.getStatus().equals("cancelled")) {
            return "<p>The order is cancelled due to " + order.getReason() + "</p>";
        }
        return "<p>Order status: " + order.getStatus() + "</p>";
    }

    @DELETE
    @Path("/order/{id}")
    @Produces(MediaType.TEXT_HTML)
    public String deleteOrder(@PathParam("id") String id) {
        Order order = orders.get(id);
        if (order == null || !order.getStatus().equals("active")) {
            return "<p>The order can't be deleted</p>";
        }
        order.UpdateStatus("deleted");
        return "<p>Status: " + order.getStatus() + "</p>";
    }

    @POST
    @Path("/balance")
    @Produces(MediaType.TEXT_HTML)
    public String setBalance(@QueryParam("balance") double balance) {
        shoppingCard.addBalance(balance);
        return "<p>Balance added</p>";
    }

    @POST
    @Path("/generatePurchaseCardID")
    @Produces(MediaType.TEXT_HTML)
    public String generatePurchaseCardID() {
        int n = 10;
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        // Assume ShoppingCard is defined and set ID logic here
        shoppingCard.setID(sb.toString());
        return "<p>Purchase card ID generated</p>";
    }
}
