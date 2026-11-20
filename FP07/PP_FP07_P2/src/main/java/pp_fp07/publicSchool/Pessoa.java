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


public abstract class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private String morada;
    private String cartaoCidadao;
    private String nif;

    public Pessoa(String nome, LocalDate dataNascimento,
                  String morada, String cartaoCidadao, String nif) {

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.cartaoCidadao = cartaoCidadao;
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getCartaoCidadao() {
        return cartaoCidadao;
    }

    public void setCartaoCidadao(String cartaoCidadao) {
        this.cartaoCidadao = cartaoCidadao;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Morada: " + morada);
        System.out.println("Cartao de cidadao: " + cartaoCidadao);
        System.out.println("NIF: " + nif);
    }
}