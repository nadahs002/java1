package com.ne.ne_airlines.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class VolManagController {
    @FXML
    private Button updateBtn;
    @FXML
    private Button cancelBtn;
    @FXML
    private Button backBtn;
    @FXML
    private TextField idflight;
    @FXML
    public void initialize()
    {
        backBtn.setOnAction(actionEvent ->
        {
            backBtn.getScene().getWindow().hide();
            openNewScene("AdminDashboardView.fxml");
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
            javafx.stage.Stage currentStage = (javafx.stage.Stage) updateBtn.getScene().getWindow();
            currentStage.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
