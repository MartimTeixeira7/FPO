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
public class Funcionario extends Pessoa {

    private String codigoFuncionario;
    private TipoContrato tipoContrato;

    public Funcionario(String nome, LocalDate dataNascimento,
            String morada, String cartaoCidadao, String nif,
            String codigoFuncionario, TipoContrato tipoContrato) {

        super(nome, dataNascimento, morada, cartaoCidadao, nif);

        this.codigoFuncionario = codigoFuncionario;
        this.tipoContrato = tipoContrato;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public void imprimirDados() {

        super.imprimirDados();

        System.out.println("Codigo funcionario: " + codigoFuncionario);
        System.out.println("Tipo de contrato: " + tipoContrato);
    }
}
