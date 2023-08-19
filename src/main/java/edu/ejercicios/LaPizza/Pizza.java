package edu.ejercicios.LaPizza;

import java.util.List;

public class Pizza {
    protected String nombre;
    protected double precio;
    public List<String> ingredientes;

    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public void preparar() {
        System.out.println("La pizza " + nombre + " está lista para ser servida.");
    }

    public void agregarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        return "Nombre de la pizza: " + nombre + ", su precio es de: " + precio + " e ingredientes Utilizados: "+ ingredientes;
    }
}