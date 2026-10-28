package Gestora;

import org.json.JSONArray;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GestoraJSON {
    private String ruta;

    public GestoraJSON(String ruta) {
        this.ruta = ruta;
    }

    public boolean guardarJSON(JSONArray jsonArray)
    {
        try {
            FileWriter fw = new FileWriter(ruta);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(jsonArray.toString(2));
            bw.close();
            System.out.println("Archivo guardado exitosamente.");
            return true;
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


//    RepositorioSocio rs = new RepositorioSocio();
//    try {
//        FileWriter fw = new FileWriter("archivo.json");
//        BufferedWriter bw = new BufferedWriter(fw);
//
//        bw.write(rs.toJson().toString()); // 2 es el nivel de indentación
//        System.out.println("Archivo guardado exitosamente.");
//    }
//    catch (IOException e) {
//        e.printStackTrace();
//    }
}
