import Modal.Album;
import Modal.Artista;
import Modal.Cancion;
import Enum.EGenero;
import Modal.ListaBasica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Artista artista1 = new Artista("Alguien",23,"Arg");
        Artista artista2 = new Artista("Alguien2",32,"Bra");
        Artista artista3 = new Artista("Alguien3",41,"Peru");

        Album album1 =new Album(1990,"Algo",artista1);
        Album album2 =new Album(1890,"Algo2",artista2);
        Album album3 =new Album(1790,"Algo3",artista3);

        Cancion cancion1 = new Cancion("Algo",20,EGenero.HIPHOP,album1,artista1);
        Cancion cancion2 = new Cancion("Algo2",120,EGenero.METAL,album2,artista2);
        Cancion cancion3 = new Cancion("Algo3",200,EGenero.JAZZ,album3);



        // =================================
        // Punto 1
        ArrayList<Cancion> canciones = new ArrayList<>();
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
        for (Cancion c : canciones)
        {
            System.out.println(c);
        }
        // =================================

        ListaBasica listaBasica = new ListaBasica()


    }
}