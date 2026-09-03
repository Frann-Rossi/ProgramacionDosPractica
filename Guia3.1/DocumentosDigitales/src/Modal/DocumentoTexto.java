package Modal;

import Interface.IModificable;

public class DocumentoTexto implements IModificable {
    private String nombreArchivo;
    private String contenido;

    public DocumentoTexto(String nombreArchivo, String contenido) {
        this.nombreArchivo = nombreArchivo;
        this.contenido = contenido;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "DocumentoTexto{" +
                "nombreArchivo='" + nombreArchivo + '\'' +
                ", contenido='" + contenido + '\'' +
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
