package org.utleon.dsm402_calculadora;

public class Pelicula {
    private String titulo;
    private String genero;
    private String director;
    private String anio;

    public Pelicula(){}

    public Pelicula(String titulo, String genero, String director, String anio) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return
                "Titulo=" + titulo +
                ", Género=" + genero  +
                ", Director=" + director +
                ", Año=" + anio;
    }
}

