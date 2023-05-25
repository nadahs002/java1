package com.ne.ne_airlines.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;


public class VolController {
    @FXML
    private TextField idflight;
    @FXML
    private TextField depdate;
    @FXML
    private TextField deptime;
    @FXML
    private TextField aerodep;
    @FXML
    private TextField flightdur;
    @FXML
    private TextField aeroarr;
    @FXML
    private Button nextBtn;
    @FXML
    private Button backBtn;
    @FXML
    public void initialize()
    {
        nextBtn.setOnAction(actionEvent ->
        {
            nextBtn.getScene().getWindow().hide();
            openNewScene("ClientBookingView.fxml");
        });

        backBtn.setOnAction(actionEvent ->
        {
            backBtn.getScene().getWindow().hide();
            openNewScene("ClientDashboardView.fxml");
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
            javafx.stage.Stage currentStage = (javafx.stage.Stage) nextBtn.getScene().getWindow();
            currentStage.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
