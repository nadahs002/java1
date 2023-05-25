package com.ne.ne_airlines.Controllers;

import com.ne.ne_airlines.Models.Vol;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;


public class ClientDashboardController {
    @FXML
    private Button bookBtn;
    @FXML
    private Button checkBtn;
    @FXML
    private Button backBtn;
    @FXML
    public void initialize()
    {
        bookBtn.setOnAction(actionEvent ->
        {
            bookBtn.getScene().getWindow().hide();
            openNewScene("ClientBookingView.fxml");
        });

        checkBtn.setOnAction(actionEvent ->
        {
            checkBtn.getScene().getWindow().hide();
            openNewScene("ClientCancelBookingView.fxml");
        });

        backBtn.setOnAction(actionEvent ->
        {
            backBtn.getScene().getWindow().hide();
            openNewScene("LoginView.fxml");
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
            javafx.stage.Stage currentStage = (javafx.stage.Stage) bookBtn.getScene().getWindow();
            currentStage.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
