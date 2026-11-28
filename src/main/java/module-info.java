module com.example.fish_hatchery {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fish_hatchery to javafx.fxml;
    opens com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician
            to javafx.fxml, javafx.base;
    exports com.example.fish_hatchery;
}