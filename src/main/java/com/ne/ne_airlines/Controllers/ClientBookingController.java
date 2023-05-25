package com.ne.ne_airlines.Controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;


public class ClientBookingController {
    @FXML
    private TableView<?> bookings;
    @FXML
    private Button bookBtn;
    @FXML
    private Button nextBtn;
    @FXML
    private Button backBtn;
    @FXML
    private TextField idflight;
    @FXML
    public void initialize()
    {

        nextBtn.setOnAction(actionEvent ->
        {
            nextBtn.getScene().getWindow().hide();
            openNewScene("ClientCancelBookingView.fxml");
        });

        backBtn.setOnAction(actionEvent ->
        {
            backBtn.getScene().getWindow().hide();
            openNewScene("ClientDashboardView.fxml");
        });
    }
    public void openNewScene(String fxmlFile) {
        try {
            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource(fxmlFile));
            javafx.scene.Parent root = loader.load();
            javafx.stage.Stage stage = new javafx.stage.Stage();
            stage.setScene(new javafx.scene.Scene(root));
            stage.show();

            // Close the current window
            javafx.stage.Stage currentStage = (javafx.stage.Stage) bookBtn.getScene().getWindow();
            currentStage.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }




}
