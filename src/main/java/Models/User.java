package Models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
class User{
    private String fullname;
    private String username;
    private String password;
    User(String fullname, String username, String password){
        this.fullname = fullname;
        this.username = username;
        this.password = password;
    }
    void Login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String htmlResponse = "<html>";
        htmlResponse += "<h2>Your username is: " + username + "<br/>";
        htmlResponse += "Your password is: " + password + "</h2>";
        htmlResponse += "</html>";
    }
    String getPassword(){
        return password;
    }
    void setPassword(String password) {
        this.password = password;
    }
}