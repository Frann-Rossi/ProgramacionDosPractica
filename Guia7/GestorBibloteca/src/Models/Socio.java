package Models;

import org.json.JSONObject;

import java.time.LocalDate;
import java.util.Objects;

public class Socio {
    private int id;
    private String nombre;
    private String email;
    private LocalDate fechaDeAlta;

    public Socio(int id, String nombre, String email, LocalDate fechaDeAlta) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.fechaDeAlta = fechaDeAlta;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Socio socio)) return false;
        return id == socio.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", fechaDeAlta=" + fechaDeAlta +
                '}';
    }

    public JSONObject toJSON()
    {
        JSONObject socioJSON = new JSONObject();

        socioJSON.put("id",id);
        socioJSON.put("nombre",nombre);
        socioJSON.put("email",email);
        socioJSON.put("fechaDeAlta",fechaDeAlta.toString());

        return socioJSON;
    }
}
