module com.project.typespeed {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.typespeed to javafx.fxml;
    exports com.project.typespeed;
}