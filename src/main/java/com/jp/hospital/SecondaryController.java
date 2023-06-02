package com.jp.hospital;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.stage.FileChooser;
import java.io.File;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

public class SecondaryController implements Initializable {
    @FXML
    private RadioButton AB1;

    @FXML
    private RadioButton AB2;

    @FXML
    private RadioButton AB3;

    @FXML
    private RadioButton AB4;

    @FXML
    private RadioButton RM1;

    @FXML
    private RadioButton RM2;

    @FXML
    private RadioButton RM3;

    @FXML
    private RadioButton RM4;

    @FXML
    private RadioButton RM5;

    @FXML
    private RadioButton RM6;

    @FXML
    private RadioButton RP0;

    @FXML
    private RadioButton RP1;

    @FXML
    private RadioButton RP2;

    @FXML
    private RadioButton RV1;

    @FXML
    private RadioButton RV2;

    @FXML
    private RadioButton RV3;

    @FXML
    private RadioButton RV4;

    @FXML
    private RadioButton RV5;

    @FXML
    private Label labelNome;

    @FXML
    private Button Result;

    @FXML
    private TextArea infoadd;

    @FXML
    private Button finalizar;

    @FXML
    private Label resulltfinal;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        labelNome.setText(PrimaryController.nome);
    }

    @FXML
    void calculateResult(ActionEvent event) {
        int somaValores = sumSelectedValues();
        resulltfinal.setText("Resultado: " + somaValores);
    }

    @FXML
    private void finalize(ActionEvent event) {
        String info = infoadd.getText();

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Salvar Arquivo");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivos de Texto", "*.txt"));

        File file = fileChooser.showSaveDialog(null);

        if (file != null) {
            try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {
                writer.println("Nome: " + PrimaryController.nome);
                writer.println("Informações adicionais: " + info);
                writer.println("Resultado: " + resulltfinal.getText());

                System.out.println("Arquivo salvo com sucesso.");
            } catch (IOException e) {
                System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
            }
        }
    }

    private int sumSelectedValues() {
        int somaValores = 0;

        if (AB1.isSelected()) {
            somaValores += 1;
        }
        if (AB2.isSelected()) {
            somaValores += 2;
        }
        if (AB3.isSelected()) {
            somaValores += 3;
        }
        if (AB4.isSelected()) {
            somaValores += 4;
        }

        if (RV1.isSelected()) {
            somaValores += 1;
        }
        if (RV2.isSelected()) {
            somaValores += 2;
        }
        if (RV3.isSelected()) {
            somaValores += 3;
        }
        if (RV4.isSelected()) {
            somaValores += 4;
        }
        if (RV5.isSelected()) {
            somaValores += 5;
        }

        if (RM1.isSelected()) {
            somaValores += 1;
        }
        if (RM2.isSelected()) {
            somaValores += 2;
        }
        if (RM3.isSelected()) {
            somaValores += 3;
        }
        if (RM4.isSelected()) {
            somaValores += 4;
        }
        if (RM5.isSelected()) {
            somaValores += 5;
        }
        if (RM6.isSelected()) {
            somaValores += 6;
        }

        if (RP0.isSelected()) {
            somaValores += 0;
        }
        if (RP1.isSelected()) {
            somaValores -= 1;
        }
        if (RP2.isSelected()) {
            somaValores -= 2;
        }

        return somaValores;
    }
}
