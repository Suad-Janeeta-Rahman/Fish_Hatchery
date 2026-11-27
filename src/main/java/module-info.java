module com.example.fish_hatchery {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fish_hatchery to javafx.fxml;
    opens com.example.fish_hatchery.ridwan_2412433.user.hatchery_manager to javafx.fxml, javafx.base;
    exports com.example.fish_hatchery;
    exports com.example.fish_hatchery.ridwan_2412433.user.hatchery_manager;
}