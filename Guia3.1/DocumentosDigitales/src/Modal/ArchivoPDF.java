package Modal;

import Interface.IDocumento;

public class ArchivoPDF implements IDocumento {
    private String nombreArchivo;
    private int cantidadPaginas;

    public ArchivoPDF(String nombreArchivo, int cantidadPaginas) {
        this.nombreArchivo = nombreArchivo;
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public String toString() {
        return "ArchivoPDF{" +
                "nombreArchivo='" + nombreArchivo + '\'' +
                ", cantidadPaginas=" + cantidadPaginas +
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
