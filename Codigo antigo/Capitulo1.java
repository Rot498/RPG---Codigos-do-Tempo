/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src;

import java.util.Scanner;

public class Capitulo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estrelas = 0;

        // Introdução
        System.out.println("====================================================================");
        System.out.println("                   CÓDIGOS DO TEMPO                                 ");
        System.out.println("====================================================================");
        System.out.println("       _____");
        System.out.println("      /     \\");
        System.out.println("     /       \\_____");
        System.out.println("    /              \\");
        System.out.println("   /  /|       |\\   \\");
        System.out.println("  /  / |       | \\   \\");
        System.out.println(" |  |  |       |  |  |");
        System.out.println(" |  |  |_______|  |  |");
        System.out.println(" |  |  /       \\  |  |");
        System.out.println(" |  | /         \\ |  |");
        System.out.println(" |__|/           \\|__|");
        System.out.println("    |  X       X  |");
        System.out.println("    |     ___     |");
        System.out.println("    \\____/   \\____/");
        System.out.println("\nSeu avô, o Professor Almeida, sempre foi considerado um inventor excêntrico...");
        System.out.println("Pressione ENTER para começar sua aventura...");
        scanner.nextLine();

        
        System.out.println("====================================================================");
        System.out.println("DIGITE SEU NOME PARA ESTA MISSÃO:");
        System.out.println("====================================================================");
        String nome = scanner.nextLine();

        System.out.println("\n" + nome + ", você está diante da incrível máquina do tempo do seu avô...");
        System.out.println("Pressione ENTER para acessar o menu...");
        scanner.nextLine();

       
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("====================================================================");
            System.out.println("CÓDIGOS DO TEMPO - MENU PRINCIPAL");
            System.out.println("====================================================================");
            System.out.println("Olá, " + nome + "! O que deseja fazer?");
            System.out.println("1 - INICIAR JORNADA TEMPORAL");
            System.out.println("2 - COMO JOGAR");
            System.out.println("3 - REGRAS DO JOGO");
            System.out.println("4 - SAIR");
            System.out.println("====================================================================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\n====================================================================");
                    System.out.println("CAPÍTULO 1: O SÉCULO DAS MÁQUINAS");
                    System.out.println("====================================================================");
                    System.out.println("A máquina começa a vibrar...");
                    System.out.println("Você está em Londres, 1832...");
                    System.out.println("\n\"Charles Babbage, prazer. E esta é a Minha Máquina Diferencial!\"");
                    System.out.println("O que você faz?");
                    System.out.println("1 - Examinar a Máquina Diferencial mais de perto");
                    System.out.println("2 - Perguntar sobre o funcionamento da máquina");
                    System.out.println("3 - Procurar uma saída discreta do local");
                    System.out.print("Escolha: ");
                    int escolha1 = scanner.nextInt();
                    scanner.nextLine();

                    if (escolha1 == 2) {
                        System.out.println("\n\"Excelente pergunta!\" exclama Babbage animado...");
                        System.out.println("\"Babbage: talvez possa me ajudar com alguns problemas lógicos!\"");
                        System.out.println("Pressione ENTER para enfrentar o primeiro desafio...");
                        scanner.nextLine();
                    }

                    // DESAFIO DAS LÂMPADAS
                    System.out.println("====================================================================");
                    System.out.println("DESAFIO DAS LÂMPADAS");
                    System.out.println("====================================================================");
                    System.out.println("\"Preciso que as lâmpadas A e C estejam acesas, mas a B apagada.\"");
                    System.out.println("Qual operação lógica devemos usar?");
                    System.out.println("1 - A AND C");
                    System.out.println("2 - A OR C");
                    System.out.println("3 - (A OR C) AND NOT B");

                    boolean acertou = false;
                    int tentativas = 0;
                    while (!acertou && tentativas < 3) {
                        System.out.print("Escolha: ");
                        int escolha2 = scanner.nextInt();
                        scanner.nextLine();
                        tentativas++;

                        if (escolha2 == 3) {
                            System.out.println("\"Perfeito! Exatamente o que eu precisava!\"");
                            estrelas += 2;
                            acertou = true;
                        } else {
                            System.out.println("\"Não parece estar funcionando... tente novamente!\"");
                        }
                    }

                    // DESAFIO BINÁRIO
                    System.out.println("\n====================================================================");
                    System.out.println("DESAFIO BINÁRIO");
                    System.out.println("====================================================================");
                    System.out.println("\"Como representamos o número 13 em binário?\"");
                    System.out.println("1 - 1101");
                    System.out.println("2 - 1011");
                    System.out.println("3 - 1110");
                    System.out.print("Escolha: ");
                    int escolha3 = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha3 == 1) {
                        System.out.println("\"Maravilhoso! Você tem uma mente analítica!\"");
                        estrelas += 3;
                    }

                    System.out.println("\nFragmento Histórico: Charles Babbage nasceu em 1791 em Londres.");

                    // DESAFIO LÓGICO
                    System.out.println("\n====================================================================");
                    System.out.println("DESAFIO LÓGICO");
                    System.out.println("====================================================================");
                    System.out.println("\"Como expressamos 'A máquina está ligada mas o vapor não está fluindo'?\"");
                    System.out.println("1 - A AND B");
                    System.out.println("2 - A AND NOT B");
                    System.out.println("3 - NOT A AND B");

                    tentativas = 0;
                    acertou = false;
                    while (!acertou && tentativas < 3) {
                        System.out.print("Escolha: ");
                        int escolha4 = scanner.nextInt();
                        scanner.nextLine();
                        tentativas++;

                        if (escolha4 == 2) {
                            System.out.println("\"Brilhante! Você dominou a lógica booleana!\"");
                            estrelas += 1;
                            acertou = true;
                        } else {
                            System.out.println("\"A lógica parece incorreta... tente outra vez!\"");
                        }
                    }

                    System.out.println("\nFragmento Histórico: Em 1822, Babbage propôs a Máquina Diferencial.");
                    System.out.println("\n====================================================================");
                    System.out.println("PARABÉNS, " + nome + "! VOCÊ COMPLETOU O CAPÍTULO 1!");
                    System.out.println("TOTAL DE ESTRELAS: " + estrelas + "/9");
                    System.out.println("====================================================================");
                    System.out.println("\"Babbage: Você seria um excelente assistente!\"");
                    System.out.println("\"Uma força irresistível começa a te puxar...\"");
                    System.out.println("Pressione ENTER para continuar sua jornada temporal...");
                    scanner.nextLine();
                    break;

                case 2:
                    System.out.println("\nComo Jogar: Escolha opções com números e resolva desafios lógicos.");
                    System.out.println("Pressione ENTER para voltar.");
                    scanner.nextLine();
                    break;

                case 3:
                    System.out.println("\nRegras do Jogo: Você terá até 3 tentativas por desafio.");
                    System.out.println("Ganha estrelas conforme acertos. Boa sorte!");
                    System.out.println("Pressione ENTER para voltar.");
                    scanner.nextLine();
                    break;

                case 4:
                    System.out.println("\nSaindo do jogo... até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
