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

public class Professor extends Pessoa {

    private String sigla;
    private TipoContrato tipoContrato;
    private ColecaoUnidadesCurriculares unidadesCurriculares;

    public Professor(String nome, LocalDate dataNascimento,
            String morada, String cartaoCidadao, String nif,
            String sigla, TipoContrato tipoContrato, int capacidade) {

        super(nome, dataNascimento, morada, cartaoCidadao, nif);

        this.sigla = sigla;
        this.tipoContrato = tipoContrato;

        this.unidadesCurriculares =
                new ColecaoUnidadesCurriculares(capacidade);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
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

        System.out.println("Sigla do professor: " + sigla);
        System.out.println("Tipo de contrato: " + tipoContrato);

        System.out.println("Unidades curriculares:");
        listarUnidadesCurriculares();
    }
}
