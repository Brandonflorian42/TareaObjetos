package edu.ejercicios;

import edu.ejercicios.Ingredientes.PizzaItaliana;
import edu.ejercicios.Queso.Topping;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PizzaItaliana pizzaItaliana1 = new PizzaItaliana("Italiana", 90, new ArrayList<>(), "de tomate", 8 );
        pizzaItaliana1.agregarIngrediente("pepperoni");
        pizzaItaliana1.agregarIngrediente("mozzarella");
        pizzaItaliana1.preparar();
        System.out.println(pizzaItaliana1);

        PizzaItaliana pizzaItaliana2 = new PizzaItaliana("Italiana", 100, new ArrayList<>(), "de tomate", 12);
        pizzaItaliana2.agregarIngrediente("pepperoni");
        pizzaItaliana2.agregarIngrediente("mozzarella");

        Topping queso = new Topping("Queso, Jamon, Pizza");
        queso.agregar(pizzaItaliana2);
        System.out.println(pizzaItaliana2);

    }
}