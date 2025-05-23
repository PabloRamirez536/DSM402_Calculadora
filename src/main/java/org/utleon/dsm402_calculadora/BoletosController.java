package org.utleon.dsm402_calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoletosController {

    @FXML
    private Button btnRegistrar;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtOrigen;

    @FXML
    private TextField txtDestino;

    @FXML
    private TextField txtKm;

    @FXML
    private TextArea txtLista;


    Boletos[] boletos = new Boletos[10];
    int contador;

    public void Registrar() {
        // Se genera un objeto de pelicula sobrecargado
        Boletos b = new Boletos();
        b.setNombre(txtNombre.getText());
        b.setOrigen(txtOrigen.getText());
        b.setDestino(txtDestino.getText());
        b.setKm(txtKm.getText());

        // Agregar el objeto a la estructura
        boletos[contador] = b;
        //Aumentar el contador
        contador++;

        String listaBoletos = "";

        // Iterar sobre el arreglo y construir la cadena
        for (int i = 0; i < contador; i++) {
            Boletos boleto = boletos[i];
            double total;  // Usamos double si el precio puede ser decimal

            // Obtener los kilómetros del boleto
            int km = Integer.parseInt(boleto.getKm());

            if (km >= 10 && km <= 50) {
                total = 5*km;

            } else if (km > 50 && km < 70) {
                total = 4*km;

            } else if (km >= 70) {
                total = 3.5*km;
            } else {
                total = 0;
            }

            listaBoletos += "Nombre: " + boleto.getNombre()
                    + ", Lugar de Origen: " + boleto.getOrigen()
                    + ", Lugar de Destino: " + boleto.getDestino()
                    + ", Distancia en KM del viaje: " + km
                    + ", Precio del Boleto: " + total
                    + "\n";
        }

        // Mostrar la estructura en el txtLista
        txtLista.setText(listaBoletos);


        // Mostrar la estructura en el txtLista

        //Limpiar los campos
        txtNombre.setText("");
        txtOrigen.setText("");
        txtDestino.setText("");
        txtKm.setText("");

    }

}