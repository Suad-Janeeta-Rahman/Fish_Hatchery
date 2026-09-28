module com.example.fish_hatchery {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fish_hatchery to javafx.fxml;
    exports com.example.fish_hatchery;
}