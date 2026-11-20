/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp07.publicSchool;

/**
 *
 * @author Utilizador
 */
public class SchoolManagement {

    private Professor[] professores;
    private Aluno[] alunos;
    private Funcionario[] funcionarios;

    private int quantidadeProfessores;
    private int quantidadeAlunos;
    private int quantidadeFuncionarios;

    public SchoolManagement(int capacidade) {

        professores = new Professor[capacidade];
        alunos = new Aluno[capacidade];
        funcionarios = new Funcionario[capacidade];

        quantidadeProfessores = 0;
        quantidadeAlunos = 0;
        quantidadeFuncionarios = 0;
    }

    

    public void adicionarProfessor(Professor p) {

        if (quantidadeProfessores < professores.length) {

            professores[quantidadeProfessores] = p;
            quantidadeProfessores++;

            System.out.println("Professor adicionado!");

        } else {
            System.out.println("Não existe espaço para mais professores!");
        }
    }

    public void removerProfessor(String sigla) {

        for (int i = 0; i < quantidadeProfessores; i++) {

            if (professores[i].getSigla().equals(sigla)) {

                for (int j = i; j < quantidadeProfessores - 1; j++) {
                    professores[j] = professores[j + 1];
                }

                professores[quantidadeProfessores - 1] = null;
                quantidadeProfessores--;

                System.out.println("Professor removido!");
                return;
            }
        }

        System.out.println("Professor nao encontrado!");
    }

    public void editarProfessor(String sigla, Professor novoProfessor) {

        for (int i = 0; i < quantidadeProfessores; i++) {

            if (professores[i].getSigla().equals(sigla)) {

                professores[i] = novoProfessor;

                System.out.println("Professor editado!");
                return;
            }
        }

        System.out.println("Professor não encontrado!");
    }

    public void listarProfessores() {

        System.out.println("\n===== PROFESSORES =====");

        for (int i = 0; i < quantidadeProfessores; i++) {

            professores[i].imprimirDados();
            System.out.println("----------------------");
        }
    }

    
    public void adicionarAluno(Aluno a) {

        if (quantidadeAlunos < alunos.length) {

            alunos[quantidadeAlunos] = a;
            quantidadeAlunos++;

            System.out.println("Aluno adicionado!");

        } else {
            System.out.println("Não existe espaço para mais alunos!");
        }
    }

    public void removerAluno(String codigo) {

        for (int i = 0; i < quantidadeAlunos; i++) {

            if (alunos[i].getCodigoAluno().equals(codigo)) {

                for (int j = i; j < quantidadeAlunos - 1; j++) {
                    alunos[j] = alunos[j + 1];
                }

                alunos[quantidadeAlunos - 1] = null;
                quantidadeAlunos--;

                System.out.println("Aluno removido!");
                return;
            }
        }

        System.out.println("Aluno não encontrado!");
    }

    public void editarAluno(String codigo, Aluno novoAluno) {

        for (int i = 0; i < quantidadeAlunos; i++) {

            if (alunos[i].getCodigoAluno().equals(codigo)) {

                alunos[i] = novoAluno;

                System.out.println("Aluno editado!");
                return;
            }
        }

        System.out.println("Aluno não encontrado!");
    }

    public void listarAlunos() {

        System.out.println("\n===== ALUNOS =====");

        for (int i = 0; i < quantidadeAlunos; i++) {

            alunos[i].imprimirDados();
            System.out.println("----------------------");
        }
    }

    
    public void adicionarFuncionario(Funcionario f) {

        if (quantidadeFuncionarios < funcionarios.length) {

            funcionarios[quantidadeFuncionarios] = f;
            quantidadeFuncionarios++;

            System.out.println("Funcionário adicionado!");

        } else {
            System.out.println("Não existe espaço para mais funcionários!");
        }
    }

    public void removerFuncionario(String codigo) {

        for (int i = 0; i < quantidadeFuncionarios; i++) {

            if (funcionarios[i].getCodigoFuncionario().equals(codigo)) {

                for (int j = i; j < quantidadeFuncionarios - 1; j++) {
                    funcionarios[j] = funcionarios[j + 1];
                }

                funcionarios[quantidadeFuncionarios - 1] = null;
                quantidadeFuncionarios--;

                System.out.println("Funcionário removido!");
                return;
            }
        }

        System.out.println("Funcionário não encontrado!");
    }

    public void editarFuncionario(String codigo, Funcionario novoFuncionario) {

        for (int i = 0; i < quantidadeFuncionarios; i++) {

            if (funcionarios[i].getCodigoFuncionario().equals(codigo)) {

                funcionarios[i] = novoFuncionario;

                System.out.println("Funcionário editado!");
                return;
            }
        }

        System.out.println("Funcionário não encontrado!");
    }

    public void listarFuncionarios() {

        System.out.println("\n===== FUNCIONÁRIOS =====");

        for (int i = 0; i < quantidadeFuncionarios; i++) {

            funcionarios[i].imprimirDados();
            System.out.println("----------------------");
        }
    }
}