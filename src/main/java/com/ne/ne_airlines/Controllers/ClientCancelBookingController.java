package com.ne.ne_airlines.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ClientCancelBookingController {
    @FXML
    private TextField idflight;
    @FXML
    private Button cancelBtn;
    @FXML
    private Button backBtn;
    @FXML
    public void initialize()
    {
        backBtn.setOnAction(actionEvent ->
        {
            backBtn.getScene().getWindow().hide();
            openNewScene("ClientBookingView.fxml");
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
            javafx.stage.Stage currentStage = (javafx.stage.Stage) backBtn.getScene().getWindow();
            currentStage.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public void cancelBooking(String idVol) {
        com.ne.ne_airlines.Database.database db = new com.ne.ne_airlines.Database.database();
        boolean canceled = db.cancelBooking(idVol);
        if (canceled) {
            showAlert(Alert.AlertType.INFORMATION, "Success", "Booking Canceled", "The booking has been successfully canceled!");
        } else {
            showAlert(Alert.AlertType.ERROR, "Error", "Failed to Cancel Booking", "An error occurred while canceling the booking!");
        }
    }

    public void showAlert(Alert.AlertType alertType, String title, String header, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
