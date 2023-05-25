module com.ne.ne_airlines {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.ne.ne_airlines to javafx.fxml;
    exports com.ne.ne_airlines;
}