package com.ne.ne_airlines.Controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;


public class ReservationController {
    @FXML
    private TextField idRes;
    @FXML
    private Button confirmBtn;

    @FXML
    private Button backBtn;
    @FXML
    public void initialize()
    {

        backBtn.setOnAction(actionEvent ->
        {
            backBtn.getScene().getWindow().hide();
            openNewScene("EscaleView.fxml");
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
            javafx.stage.Stage currentStage = (javafx.stage.Stage) backBtn.getScene().getWindow();
            currentStage.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    public void confirmBooking(String idRes){
com.ne.ne_airlines.Database.database db = new com.ne.ne_airlines.Database.database();
        boolean confirmed = db.confirmBooking(idRes);
        if (confirmed) {
            showAlert(Alert.AlertType.INFORMATION, "Success", "Booking Confirmed", "The booking has been successfully confirmed!");
        } else {
            showAlert(Alert.AlertType.ERROR, "Error", "Failed to Confirm Booking", "An error occurred while confirming the booking!");
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
