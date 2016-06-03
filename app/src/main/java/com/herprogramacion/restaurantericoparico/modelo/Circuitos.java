package com.herprogramacion.restaurantericoparico.modelo;

import com.herprogramacion.restaurantericoparico.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class Circuitos {
    private float precio;
    private String nombre;
    private int idDrawable;

    public Circuitos(float precio, String nombre, int idDrawable) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Circuitos> COMIDAS_POPULARES = new ArrayList<Circuitos>();
    public static final List<Circuitos> BEBIDAS = new ArrayList<>();
    public static final List<Circuitos> POSTRES = new ArrayList<>();
    public static final List<Circuitos> PLATILLOS = new ArrayList<>();

    static {
        COMIDAS_POPULARES.add(new Circuitos(5, "Camarones Tismados", R.drawable.camarones));
        COMIDAS_POPULARES.add(new Circuitos(3.2f, "Rosca Herbárea", R.drawable.rosca));
        COMIDAS_POPULARES.add(new Circuitos(12f, "Sushi Extremo", R.drawable.sushi));
        COMIDAS_POPULARES.add(new Circuitos(9, "Sandwich Deli", R.drawable.sandwich));
        COMIDAS_POPULARES.add(new Circuitos(34f, "Lomo De Cerdo Austral", R.drawable.lomo_cerdo));

        PLATILLOS.add(new Circuitos(5, "Camarones Tismados", R.drawable.camarones));
        PLATILLOS.add(new Circuitos(3.2f, "Rosca Herbárea", R.drawable.rosca));
        PLATILLOS.add(new Circuitos(12f, "Sushi Extremo", R.drawable.sushi));
        PLATILLOS.add(new Circuitos(9, "Sandwich Deli", R.drawable.sandwich));
        PLATILLOS.add(new Circuitos(34f, "Lomo De Cerdo Austral", R.drawable.lomo_cerdo));

        BEBIDAS.add(new Circuitos(3, "Taza de Café", R.drawable.cafe));
        BEBIDAS.add(new Circuitos(12, "Coctel Tronchatoro", R.drawable.coctel));
        BEBIDAS.add(new Circuitos(5, "Jugo Natural", R.drawable.jugo_natural));
        BEBIDAS.add(new Circuitos(24, "Coctel Jordano", R.drawable.coctel_jordano));
        BEBIDAS.add(new Circuitos(30, "Botella Vino Tinto Darius", R.drawable.vino_tinto));

        POSTRES.add(new Circuitos(2, "Postre De Vainilla", R.drawable.postre_vainilla));
        POSTRES.add(new Circuitos(3, "Flan Celestial", R.drawable.flan_celestial));
        POSTRES.add(new Circuitos(2.5f, "Cupcake Festival", R.drawable.cupcakes_festival));
        POSTRES.add(new Circuitos(4, "Pastel De Fresa", R.drawable.pastel_fresa));
        POSTRES.add(new Circuitos(5, "Muffin Amoroso", R.drawable.muffin_amoroso));
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}
