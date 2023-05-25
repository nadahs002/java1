package com.ne.ne_airlines.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class database {
    public static Connection main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ne_airlines", "root", "");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private Connection connection;
    public void insertClient(String firstname, String lastname, String adress, String email, String phone, String passport) {
        try {
            Connection connect = database.main(null);
            String query = "INSERT INTO client (firstname, lastname, adress, email, phone, passport) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setString(1, firstname);
            preparedStmt.setString(2, lastname);
            preparedStmt.setString(3, adress);
            preparedStmt.setString(4, email);
            preparedStmt.setString(5, phone);
            preparedStmt.setString(6, passport);
            preparedStmt.execute();
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean cancelBooking(String idVol) {
        try {
            String sql = "UPDATE reservations SET status = 'Canceled' WHERE idVol = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, idVol);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                return true; // Cancellation successful
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Cancellation failed
    }
    public boolean confirmBooking(String idRes){
        try{
            String sql = "UPDATE reservations SET status = 'Confirmed' WHERE idRes = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, idRes);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                return true; // Confirmation successful
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Confirmation failed
    }
}

