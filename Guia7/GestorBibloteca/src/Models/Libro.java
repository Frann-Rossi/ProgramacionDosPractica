package Models;

import org.json.JSONObject;

public class Libro extends  Publicacion{
    private String isbn;
    private String autor;
    private int numPaginas;

    public Libro(int id, String titulo, int anio, String isbn, String autor, int numPaginas) {
        super(id, titulo, anio);
        this.isbn = isbn;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                super.toString() +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                "} ";
    }

    public JSONObject toJSON()
    {
        JSONObject libroJSON = super.toJSON();

        libroJSON.put("isbn",isbn);
        libroJSON.put("autor",autor);
        libroJSON.put("numPaginas",numPaginas);

        return libroJSON;

    }
}
