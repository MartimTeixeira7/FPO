/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp07.publicSchool;

/**
 *
 * @author Utilizador
 */
public class ColecaoUnidadesCurriculares {

    private UnidadeCurricular[] unidades;
    private int quantidade;

    public ColecaoUnidadesCurriculares(int capacidade) {

        unidades = new UnidadeCurricular[capacidade];
        quantidade = 0;
    }

    
    public void adicionar(UnidadeCurricular uc) {

        if (quantidade < unidades.length) {

            unidades[quantidade] = uc;
            quantidade++;

        } else {
            System.out.println("Colecao cheia!");
        }
    }

    
    public void remover(String sigla) {

        for (int i = 0; i < quantidade; i++) {

            if (unidades[i].getSigla().equals(sigla)) {

                for (int j = i; j < quantidade - 1; j++) {
                    unidades[j] = unidades[j + 1];
                }

                unidades[quantidade - 1] = null;
                quantidade--;

                System.out.println("Unidade curricular removida!");
                return;
            }
        }

        System.out.println("Unidade curricular nao encontrada!");
    }

    
    public void editar(String sigla, UnidadeCurricular novaUC) {

        for (int i = 0; i < quantidade; i++) {

            if (unidades[i].getSigla().equals(sigla)) {

                unidades[i] = novaUC;

                System.out.println("Unidade curricular editada!");
                return;
            }
        }

        System.out.println("Unidade curricular não encontrada!");
    }

    
    public void listar() {

        if (quantidade == 0) {
            System.out.println("Nao existem unidades curriculares.");
        }

        for (int i = 0; i < quantidade; i++) {

            unidades[i].imprimirDados();
            System.out.println("------------------");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public UnidadeCurricular obter(int indice) {

        if (indice >= 0 && indice < quantidade) {
            return unidades[indice];
        }

        return null;
    }
}
