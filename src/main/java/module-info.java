module com.example.arvorebinaria {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.arvorebinaria to javafx.fxml;
    exports com.example.arvorebinaria;
}