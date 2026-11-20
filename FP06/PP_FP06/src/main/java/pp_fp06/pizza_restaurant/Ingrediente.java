/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;

import pp_fp06.pizza_restaurant.enums.Origem;

/**
 *
 * @author Utilizador
 */
public class Ingrediente {

    private String codigo;
    private String nome;
    private Origem origem;
    private int totalCalorias;

  
    public Ingrediente(String codigo, String nome, Origem origem, int totalCalorias) {
        this.codigo = codigo;
        this.nome = nome;
        this.origem = origem;
        this.totalCalorias = totalCalorias;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Origem getOrigem() {
        return this.origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public int getTotalCalorias() {
        return this.totalCalorias;
    }

    public void setTotalCalorias(int totalCalorias) {
        this.totalCalorias = totalCalorias;
    }

    @Override
    public String toString() {
        return this.codigo + " - " + this.nome + " (" + this.origem + ", "
                + this.totalCalorias + " kcal)";
    }
}