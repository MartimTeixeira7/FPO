/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;

import pp_fp06.pizza_restaurant.enums.Origem;
import pp_fp06.pizza_restaurant.enums.Tamanho;

/**
 *
 * @author Utilizador
 */
public class PizzaDemo {

    public static void main(String[] args) {
        Ingrediente queijo = new Ingrediente("I01", "Queijo", Origem.ANIMAL, 300);
        Ingrediente tomate = new Ingrediente("I02", "Tomate", Origem.VEGETAL, 20);
        Ingrediente fiambre = new Ingrediente("I03", "Fiambre", Origem.ANIMAL, 150);
        Ingrediente cogumelos = new Ingrediente("I04", "Cogumelos", Origem.VEGETAL, 25);
        Ingrediente sal = new Ingrediente("I05", "Sal", Origem.MINERAL, 0);
        Ingrediente ananas = new Ingrediente("I06", "Ananás", Origem.VEGETAL, 50);

        Pizza margherita = new Pizza("P01", "Margherita", "Clássica italiana", 8.50, Tamanho.MEDIA);
        margherita.adicionarIngrediente(queijo);
        margherita.adicionarIngrediente(tomate);
        margherita.adicionarIngrediente(sal);

        Pizza prosciutto = new Pizza("P02", "Prosciutto", "Com fiambre e cogumelos", 10.00, Tamanho.FAMILIAR);
        prosciutto.adicionarIngrediente(queijo);
        prosciutto.adicionarIngrediente(tomate);
        prosciutto.adicionarIngrediente(fiambre);
        prosciutto.adicionarIngrediente(cogumelos);

        System.out.println(margherita.getDescricaoDetalhada());
        System.out.println();
        System.out.println(prosciutto.getDescricaoDetalhada());

        System.out.println("\n--- Testes de ingredientes ---");
        System.out.println("Encontrar I03 na Prosciutto: " + prosciutto.encontrarIngrediente("I03"));
        System.out.println("Encontrar I03 na Margherita: " + margherita.encontrarIngrediente("I03"));
        System.out.println("Remover I04 da Prosciutto: " + prosciutto.removerIngrediente("I04"));
        System.out.println("Calorias Prosciutto: " + prosciutto.calcularCalorias() + " kcal");

        prosciutto.adicionarIngrediente(cogumelos);
        prosciutto.adicionarIngrediente(sal);
        System.out.println("Adicionar 6.º ingrediente: " + prosciutto.adicionarIngrediente(ananas));

        System.out.println("\n--- Enumerações ---");
        System.out.println(Tamanho.tamanhoParaString(Tamanho.PEQUENA));
        System.out.println(Origem.origemParaString(Origem.MINERAL));

        System.out.println("\n--- Ementas ---");
        GestorEmentas ementas = new GestorEmentas();
        Ementa e1 = new Ementa("E01", "Verão", "Ementa de verão");
        Ementa e2 = new Ementa("E02", "Inverno", "Ementa de inverno");
        e1.adicionarPizza(margherita);
        e2.adicionarPizza(prosciutto);
        ementas.adicionarEmenta(e1);
        ementas.adicionarEmenta(e2);
        ementas.ativarEmenta("E01");
        ementas.ativarEmenta("E02");
        System.out.println(ementas.listar());
        System.out.println("Ementa ativa: " + ementas.getEmentaAtiva());
    }
}