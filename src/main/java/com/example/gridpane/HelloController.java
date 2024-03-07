package com.example.gridpane;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    /*
               <image>
                    <image url= "@imagenes/cafe2.png"> EL @ INICIA EN DONDE ESTÁ EL FXML, EN ESTE CASO EN COM.EXAMPLE.GRIDPANE
               </image>
    Image image = new Image (getClass().getResourceAsStream(ImageName));
               imagenLogo.setImage(image)
    */
}