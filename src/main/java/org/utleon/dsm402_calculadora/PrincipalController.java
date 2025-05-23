package org.utleon.dsm402_calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrincipalController {

    @FXML
    private TextField txtNum1;
    @FXML
    private TextField txtNum2;
    @FXML
    private Button btnSumar;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnDividir;
    @FXML
    private Button btnRestar;
    @FXML
    private TextField txtResultado;

    public void sumar(){
        double resultado = (Double.parseDouble(txtNum1.getText()) + Double.parseDouble(txtNum2.getText()));
        txtResultado.setText(String.valueOf(resultado));
    }

    public void restar(){
        double resultado = (Double.parseDouble(txtNum1.getText()) - Double.parseDouble(txtNum2.getText()));
        txtResultado.setText(String.valueOf(resultado));
    }

    public void multiplicar(){
        double resultado = (Double.parseDouble(txtNum1.getText()) * Double.parseDouble(txtNum2.getText()));
        txtResultado.setText(String.valueOf(resultado));
    }

    public void dividir(){
        double resultado = (Double.parseDouble(txtNum1.getText()) / Double.parseDouble(txtNum2.getText()));
        txtResultado.setText(String.valueOf(resultado));
    }

}
