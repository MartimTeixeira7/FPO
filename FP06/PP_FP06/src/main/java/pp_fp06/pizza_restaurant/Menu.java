/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;
import java.util.Scanner;
/**
 *
 * @author Utilizador
 */
public class Menu {

    private static final Scanner LEITOR = new Scanner(System.in);

    public static void main(String[] args) {
        GestorEmentas ementas = new GestorEmentas();
        int opcao;
        do {
            System.out.println("\n===== GESTAO DE EMENTAS =====");
            System.out.println("1 - Criar ementa");
            System.out.println("2 - Listar ementas");
            System.out.println("3 - Consultar ementa");
            System.out.println("4 - Ativar ementa");
            System.out.println("5 - Desativar ementa");
            System.out.println("6 - Ver ementa ativa");
            System.out.println("0 - Sair");
            opcao = lerInt("Opcao: ");
            switch (opcao) {
                case 1:
                    criar(ementas);
                    break;
                case 2:
                    System.out.println(ementas.listar());
                    break;
                case 3:
                    consultar(ementas);
                    break;
                case 4:
                    if (ementas.ativarEmenta(lerTexto("Codigo da ementa: "))) {
                        System.out.println("Ementa ativada (as restantes ficaram inativas).");
                    } else {
                        System.out.println("Ementa não encontrada.");
                    }
                    break;
                case 5:
                    if (ementas.desativarEmenta(lerTexto("Codigo da ementa: "))) {
                        System.out.println("Ementa desativada.");
                    } else {
                        System.out.println("Ementa nao encontrada.");
                    }
                    break;
                case 6:
                    Ementa ativa = ementas.getEmentaAtiva();
                    System.out.println(ativa == null ? "Nao existe ementa ativa."
                            : ativa.getDescricaoDetalhada());
                    break;
                case 0:
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("Opcao inválida.");
            }
        } while (opcao != 0);
    }

    private static void criar(GestorEmentas ementas) {
        String codigo = lerTexto("Codigo: ");
        String nome = lerTexto("Nome: ");
        String descricao = lerTexto("Descricao: ");
        if (ementas.adicionarEmenta(new Ementa(codigo, nome, descricao))) {
            System.out.println("Ementa criada.");
        } else {
            System.out.println("Nao foi possível criar (código repetido ou limite atingido).");
        }
    }

    private static void consultar(GestorEmentas ementas) {
        Ementa e = ementas.encontrarEmenta(lerTexto("Codigo da ementa: "));
        System.out.println(e == null ? "Ementa nao encontrada." : e.getDescricaoDetalhada());
    }

    private static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return LEITOR.nextLine().trim();
    }

    private static int lerInt(String mensagem) {
        while (true) {
            try {
                return Integer.parseInt(lerTexto(mensagem));
            } catch (NumberFormatException ex) {
                System.out.println("Introduza um numero válido.");
            }
        }
    }
}