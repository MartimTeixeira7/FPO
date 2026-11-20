/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp07.publicSchool;

/**
 *
 * @author Utilizador
 */

public class UnidadeCurricular {

    private String nome;
    private String sigla;
    private String nomeCurso;
    private String anoLetivo;
    private Semestre semestre;

    public UnidadeCurricular(String nome, String sigla,
            String nomeCurso, String anoLetivo, Semestre semestre) {

        this.nome = nome;
        this.sigla = sigla;
        this.nomeCurso = nomeCurso;
        this.anoLetivo = anoLetivo;
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sigla: " + sigla);
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Ano letivo: " + anoLetivo);
        System.out.println("Semestre: " + semestre);
    }
}
