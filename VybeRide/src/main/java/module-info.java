module com.vyberide {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.vyberide to javafx.fxml;
    opens com.vyberide.controllers to javafx.fxml;
    opens com.vyberide.database to javafx.fxml;

    exports com.vyberide;
    exports com.vyberide.controllers;
    exports com.vyberide.database;
}
