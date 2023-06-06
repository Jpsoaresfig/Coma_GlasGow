package com.jp.hospital;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class PrimaryController {

    @FXML
    private Button butinicial;

    @FXML
    private AnchorPane telainicio;
 
    @FXML
    private ImageView imagetela;

    @FXML
    private TextField txtnome;

    public static String nome;

    @FXML
    void irParaSegundaTela(ActionEvent event) throws IOException {
        nome=txtnome.getText();
        App.switchToScene("Segunda.fxml");
    }

    
    
    
}
