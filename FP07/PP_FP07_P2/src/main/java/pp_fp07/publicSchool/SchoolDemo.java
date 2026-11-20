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
public class SchoolDemo {

    public static void main(String[] args) {

        

        UnidadeCurricular uc1 = new UnidadeCurricular(
                "Programacoo Orientada a Objetos",
                "POO",
                "CTESP TPSI",
                "2026/2027",
                Semestre.PRIMEIRO
        );

        UnidadeCurricular uc2 = new UnidadeCurricular(
                "Bases de Dados",
                "BD",
                "CTESP TPSI",
                "2026/2027",
                Semestre.PRIMEIRO
        );

        UnidadeCurricular uc3 = new UnidadeCurricular(
                "Programaçao Web",
                "PW",
                "CTESP TPSI",
                "2026/2027",
                Semestre.SEGUNDO
        );

        

        Professor professor1 = new Professor(
                "Joao Silva",
                LocalDate.of(1980, 5, 10),
                "Porto",
                "12345678",
                "123456789",
                "PROF01",
                TipoContrato.INTEGRAL,
                10
        );

        professor1.adicionarUnidadeCurricular(uc1);
        professor1.adicionarUnidadeCurricular(uc2);

        

        Aluno aluno1 = new Aluno(
                "Maria Santos",
                LocalDate.of(2005, 3, 15),
                "Matosinhos",
                "87654321",
                "987654321",
                "ALUNO01",
                10
        );

        aluno1.adicionarUnidadeCurricular(uc1);
        aluno1.adicionarUnidadeCurricular(uc2);
        aluno1.adicionarUnidadeCurricular(uc3);

        

        Funcionario funcionario1 = new Funcionario(
                "Ana Costa",
                LocalDate.of(1990, 7, 20),
                "Maia",
                "11223344",
                "111222333",
                "FUNC01",
                TipoContrato.PARCIAL
        );

        

        SchoolManagement escola = new SchoolManagement(20);


        escola.adicionarProfessor(professor1);
        escola.adicionarAluno(aluno1);
        escola.adicionarFuncionario(funcionario1);


        escola.listarProfessores();
        escola.listarAlunos();
        escola.listarFuncionarios();


        System.out.println("\n");

        aluno1.removerUnidadeCurricular("BD");

        aluno1.listarUnidadesCurriculares();


        System.out.println("\n");

        UnidadeCurricular novaUC = new UnidadeCurricular(
                "Bases de Dados II",
                "BD",
                "CTESP TPSI",
                "2026/2027",
                Semestre.SEGUNDO
        );

        professor1.editarUnidadeCurricular("BD", novaUC);

        professor1.listarUnidadesCurriculares();
    }
}
