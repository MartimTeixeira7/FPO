/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp07.publicSchool;
import java.time.LocalDate;
/**
 *
 * @author Utilizador
 */
public class Aluno extends Pessoa {

    private String codigoAluno;
    private ColecaoUnidadesCurriculares unidadesCurriculares;

    public Aluno(String nome, LocalDate dataNascimento,
            String morada, String cartaoCidadao, String nif,
            String codigoAluno, int capacidade) {

        super(nome, dataNascimento, morada, cartaoCidadao, nif);

        this.codigoAluno = codigoAluno;

        this.unidadesCurriculares =
                new ColecaoUnidadesCurriculares(capacidade);
    }

    public String getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(String codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public ColecaoUnidadesCurriculares getUnidadesCurriculares() {
        return unidadesCurriculares;
    }

    public void adicionarUnidadeCurricular(UnidadeCurricular uc) {
        unidadesCurriculares.adicionar(uc);
    }

    public void removerUnidadeCurricular(String sigla) {
        unidadesCurriculares.remover(sigla);
    }

    public void editarUnidadeCurricular(
            String sigla, UnidadeCurricular novaUC) {

        unidadesCurriculares.editar(sigla, novaUC);
    }

    public void listarUnidadesCurriculares() {
        unidadesCurriculares.listar();
    }

    @Override
    public void imprimirDados() {

        super.imprimirDados();

        System.out.println("Código de aluno: " + codigoAluno);

        System.out.println("Unidades curriculares:");
        listarUnidadesCurriculares();
    }
}
