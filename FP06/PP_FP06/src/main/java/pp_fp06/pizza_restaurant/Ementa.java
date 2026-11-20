/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;

/**
 *
 * @author Utilizador
 */
public class Ementa {

    public static final int MAX_PIZZAS = 10;

    private String codigo;
    private String nome;
    private String descricao;
    private Pizza[] pizzas;
    private int numPizzas;
    private boolean ativo;

    public Ementa(String codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.pizzas = new Pizza[MAX_PIZZAS];
        this.numPizzas = 0;
        this.ativo = false;
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

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getNumPizzas() {
        return this.numPizzas;
    }

    public boolean adicionarPizza(Pizza pizza) {
        if (pizza == null || this.numPizzas >= MAX_PIZZAS) {
            return false;
        }
        if (this.encontrarPizza(pizza.getCodigo()) != null) {
            return false;
        }
        this.pizzas[this.numPizzas] = pizza;
        this.numPizzas++;
        return true;
    }

    public Pizza encontrarPizza(String codigo) {
        for (int i = 0; i < this.numPizzas; i++) {
            if (this.pizzas[i].getCodigo().equals(codigo)) {
                return this.pizzas[i];
            }
        }
        return null;
    }

    public boolean removerPizza(String codigo) {
        for (int i = 0; i < this.numPizzas; i++) {
            if (this.pizzas[i].getCodigo().equals(codigo)) {
                for (int j = i; j < this.numPizzas - 1; j++) {
                    this.pizzas[j] = this.pizzas[j + 1];
                }
                this.numPizzas--;
                this.pizzas[this.numPizzas] = null;
                return true;
            }
        }
        return false;
    }

    public String getDescricaoDetalhada() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ementa ").append(this.codigo).append(" - ").append(this.nome)
          .append(this.ativo ? " [ATIVA]" : " [INATIVA]").append("\n");
        sb.append("  Descrição: ").append(this.descricao).append("\n");
        sb.append("  Pizzas:");
        if (this.numPizzas == 0) {
            sb.append(" (nenhuma)");
        } else {
            for (int i = 0; i < this.numPizzas; i++) {
                sb.append("\n    - ").append(this.pizzas[i]);
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return this.codigo + " - " + this.nome + " (" + this.numPizzas + " pizzas)"
                + (this.ativo ? " [ATIVA]" : "");
    }
}