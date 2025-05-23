package org.utleon.dsm402_calculadora;

public class Boletos {
    private String nombre;
    private String origen;
    private String destino;
    private String km;

    public Boletos() {
    }

    public Boletos(String nombre, String origen, String destino, String km) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.km = km;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Boletos{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", km='" + km + '\'' +
                '}';
    }
}
