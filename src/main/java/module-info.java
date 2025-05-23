module org.utleon.dsm402_calculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.utleon.dsm402_calculadora to javafx.fxml;
    exports org.utleon.dsm402_calculadora;
}