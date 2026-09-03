package Modal;

import Interface.IModificable;

public class HojaDeCalculo implements IModificable {
    private String nombreArchivo;
    private int cantidadFilas;

    public HojaDeCalculo(String nombreArchivo, int cantidadFilas) {
        this.nombreArchivo = nombreArchivo;
        this.cantidadFilas = cantidadFilas;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getCantidadFilas() {
        return cantidadFilas;
    }

    public void setCantidadFilas(int cantidadFilas) {
        this.cantidadFilas = cantidadFilas;
    }

    @Override
    public String toString() {
        return "HojaDeCalculo{" +
                "nombreArchivo='" + nombreArchivo + '\'' +
                ", cantidadFilas=" + cantidadFilas +
                '}';
    }

    @Override
    public boolean guardar() {
        return true;
    }

    @Override
    public boolean abrir() {
        return true;
    }

    @Override
    public boolean cerrar() {
        return true;
    }
}
