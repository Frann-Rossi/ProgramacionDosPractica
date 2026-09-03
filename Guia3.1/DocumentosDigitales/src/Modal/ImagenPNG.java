package Modal;

import Interface.IDocumento;

public class ImagenPNG implements IDocumento {
    private  String nombreArchivo;
    private  String resolucion;

    public ImagenPNG(String nombreArchivo, String resolucion) {
        this.nombreArchivo = nombreArchivo;
        this.resolucion = resolucion;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "ImagenPNG{" +
                "nombreArchivo='" + nombreArchivo + '\'' +
                ", resolucion='" + resolucion + '\'' +
                '}';
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
