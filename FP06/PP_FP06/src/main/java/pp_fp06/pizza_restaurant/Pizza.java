/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;
import pp_fp06.pizza_restaurant.enums.Tamanho;
/**
 *
 * @author Utilizador
 */
public class Pizza {

    public static final int MAX_INGREDIENTES = 5;

    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    private Tamanho tamanho;
    private Ingrediente[] ingredientes;
    private int numIngredientes;

 
    public Pizza(String codigo, String nome, String descricao, double preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new Ingrediente[MAX_INGREDIENTES];
        this.numIngredientes = 0;
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

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public int getNumIngredientes() {
        return this.numIngredientes;
    }

    public boolean adicionarIngrediente(Ingrediente ingrediente) {
        if (ingrediente == null || this.numIngredientes >= MAX_INGREDIENTES) {
            return false;
        }
        if (this.encontrarIngrediente(ingrediente.getCodigo()) != null) {
            return false;
        }
        this.ingredientes[this.numIngredientes] = ingrediente;
        this.numIngredientes++;
        return true;
    }

    public Ingrediente encontrarIngrediente(String codigo) {
        for (int i = 0; i < this.numIngredientes; i++) {
            if (this.ingredientes[i].getCodigo().equals(codigo)) {
                return this.ingredientes[i];
            }
        }
        return null;
    }

    public boolean removerIngrediente(String codigo) {
        Ingrediente alvo = this.encontrarIngrediente(codigo);
        if (alvo == null) {
            return false;
        }
        int pos = 0;
        while (this.ingredientes[pos] != alvo) {
            pos++;
        }
        for (int i = pos; i < this.numIngredientes - 1; i++) {
            this.ingredientes[i] = this.ingredientes[i + 1];
        }
        this.numIngredientes--;
        this.ingredientes[this.numIngredientes] = null;
        return true;
    }

    public int calcularCalorias() {
        int total = 0;
        for (int i = 0; i < this.numIngredientes; i++) {
            total += this.ingredientes[i].getTotalCalorias();
        }
        return total;
    }

    public String getDescricaoDetalhada() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza ").append(this.codigo).append(" - ").append(this.nome).append("\n");
        sb.append("  Descrição: ").append(this.descricao).append("\n");
        sb.append("  Tamanho: ").append(this.tamanho).append(" (")
          .append(Tamanho.tamanhoParaString(this.tamanho)).append(")\n");
        sb.append(String.format("  Preço: %.2f €%n", this.preco));
        sb.append("  Ingredientes:");
        if (this.numIngredientes == 0) {
            sb.append(" (nenhum)\n");
        } else {
            sb.append("\n");
            for (int i = 0; i < this.numIngredientes; i++) {
                sb.append("    - ").append(this.ingredientes[i]).append("\n");
            }
        }
        sb.append("  Total de calorias: ").append(this.calcularCalorias()).append(" kcal");
        return sb.toString();
    }

    @Override
    public String toString() {
        return this.codigo + " - " + this.nome + " (" + this.tamanho + ", "
                + String.format("%.2f", this.preco) + " €)";
    }
}
