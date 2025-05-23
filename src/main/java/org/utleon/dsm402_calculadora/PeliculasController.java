package org.utleon.dsm402_calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PeliculasController {

    @FXML
    private Button btnRegistrar;

    @FXML
    private TextField txtAnio;

    @FXML
    private TextField txtDirector;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextArea txtLista;

    @FXML
    private TextField txtTitulo;

    // Arreglo de tipo pelicula
    Pelicula[] peliculas = new Pelicula[10];
    int contador;

    public void Registrar(){
        // Se genera un objeto de pelicula sobrecargado
        Pelicula p = new Pelicula();
        p.setTitulo(txtTitulo.getText());
        p.setAnio(txtAnio.getText());
        p.setDirector(txtDirector.getText());
        p.setGenero(txtGenero.getText());
        // Agregar el objeto a la estructura
        peliculas[contador]= p;
        //Aumentar el contador
        contador++;
        // Mostrar la estructura en el txtArea
        // Iterar sobre el arreglo y mostrar las películas en el txtLista
        // string para almacenar el resultado final
        String listaPeliculas = "";

        // Iterar sobre el arreglo y construir la cadena
        for (int i = 0; i < contador; i++) {
            Pelicula pelicula = peliculas[i];
            listaPeliculas += "Título: " + pelicula.getTitulo()
                    + ", Año: " + pelicula.getAnio()
                    + ", Director: " + pelicula.getDirector()
                    + ", Género: " + pelicula.getGenero()
                    + "\n";
        }

        // Mostrar la estructura en el txtLista
        txtLista.setText(listaPeliculas);

        // Mostrar la estructura en el txtLista

        //Limpiar los campos
        txtTitulo.setText("");
        txtGenero.setText("");
        txtAnio.setText("");
        txtDirector.setText("");
    }
}