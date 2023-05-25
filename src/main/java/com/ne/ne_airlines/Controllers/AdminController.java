package com.ne.ne_airlines.Controllers;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import com.ne.ne_airlines.Models.Escale;
import com.ne.ne_airlines.Models.Vol;
import com.ne.ne_airlines.Models.Admin;
import com.ne.ne_airlines.Models.Reservation;

public class AdminController {
    @FXML
    private Button flightsBtn;
    @FXML
    private Button layoversBtn;
    @FXML
    private Button bookingsBtn;
    @FXML
    private Button backBtn;
    @FXML
    private Button fmanageBtn;
    @FXML
    public void initialize()
    {
        flightsBtn.setOnAction(actionEvent ->
        {
            flightsBtn.getScene().getWindow().hide();
            openNewScene("AdminFlightsView.fxml");
        });

        layoversBtn.setOnAction(actionEvent ->
        {
            layoversBtn.getScene().getWindow().hide();
            openNewScene("AdminLayoversView.fxml");
        });

        bookingsBtn.setOnAction(actionEvent ->
        {
            bookingsBtn.getScene().getWindow().hide();
            openNewScene("AdminBookingsView.fxml");
        });

        backBtn.setOnAction(actionEvent ->
        {
            backBtn.getScene().getWindow().hide();
            openNewScene("LoginView.fxml");
        });

        fmanageBtn.setOnAction(actionEvent ->
        {
            fmanageBtn.getScene().getWindow().hide();
            openNewScene("AdminFlightManagementView.fxml");
        });
    }
    public void openNewScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            javafx.scene.Parent root = loader.load();
            javafx.stage.Stage stage = new javafx.stage.Stage();
            stage.setScene(new javafx.scene.Scene(root));
            stage.show();

            // Close the current window
            javafx.stage.Stage currentStage = (javafx.stage.Stage) flightsBtn.getScene().getWindow();
            currentStage.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }


}

