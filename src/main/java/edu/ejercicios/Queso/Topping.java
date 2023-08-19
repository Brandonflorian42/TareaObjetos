package edu.ejercicios.Queso;
import edu.ejercicios.LaPizza.Pizza;

public class Topping {
    private String nombre;

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Pizza pizza) {
        pizza.ingredientes.add(nombre);
    }
}