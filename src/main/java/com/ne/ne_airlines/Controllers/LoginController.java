package com.ne.ne_airlines.Controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginController {
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Button loginBtn;
    private Connection connection;

    public LoginController() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ne_airlines", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleLoginBtn() {
        String username = this.username.getText();
        String password = this.password.getText();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
            String dbPassword = resultSet.getString("password");
                if (password.equals(dbPassword)) {
                    String userType = resultSet.getString("username");

                    if (userType.equals("admin")) {
                        System.out.println("Admin login successful");
                        openAdminDashboard();
                    } else if (userType.equals("eya")) {
                        System.out.println("User login successful");
                        openClientDashboard();

                    }
                } else {
                    System.out.println("Invalid password");
                }
            } else {
                System.out.println("Invalid username");
            }
            //PreparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void openAdminDashboard() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminView.fxml"));
            Parent root = loader.load();
            AdminController adminController = loader.getController();
            //adminController.setConnection(connection);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void openClientDashboard(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ClientDashboardView.fxml"));
            Parent root = loader.load();
            ClientDashboardController clientDashboardController = loader.getController();
            //clientDashboardController.setConnection(connection);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void closeConnnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

