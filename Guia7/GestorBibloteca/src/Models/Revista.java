package Models;

import Enums.EPeriodicidad;
import org.json.JSONObject;

public class Revista extends Publicacion{
    private String issn;
    private int numero;
    private EPeriodicidad periodicidad;

    public Revista(int id, String titulo, int anio, String issn, int numero, EPeriodicidad periodicidad) {
        super(id, titulo, anio);
        this.issn = issn;
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public String getIssn() {
        return issn;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public EPeriodicidad getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(EPeriodicidad periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "issn='" + issn + '\'' +
                ", numero=" + numero +
                ", periodicidad=" + periodicidad +
                "} " + super.toString();
    }

    public JSONObject toJSON(){
        JSONObject revistaJSON = super.toJSON();
        revistaJSON.put("issn",issn);
        revistaJSON.put("numero",numero);
        revistaJSON.put("periodicidad",periodicidad.name());
        return  revistaJSON;
    }
}
