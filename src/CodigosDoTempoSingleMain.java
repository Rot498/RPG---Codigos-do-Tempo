package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CodigosDoTempoSingleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = "";
        int estrelasCap1 = 0;
        int fragmentosTuring = 0;

        // --- Historical fragments for Chapter 2 (now local to main) ---
        String conteudoFragmento1 = "Alan Mathison Turing nasceu em 23 de junho de 1912, em Londres. Desde cedo demonstrou grande talento em matemática e lógica, apesar de ser considerado excêntrico por professores e colegas. Estudou no Kings College, na Universidade de Cambridge, onde se destacou por seu trabalho em matemática pura. Em 1936, Turing publicou o artigo On Computable Numbers, no qual propôs o conceito de uma máquina abstrata — hoje conhecida como Máquina de Turing. Essa ideia formou a base da computação moderna, ao definir matematicamente o que significa “calcular.";
        String conteudoFragmento2 = "Com o início da Segunda Guerra Mundial, Turing foi recrutado para trabalhar em Bletchley Park, o centro de inteligência britânico. Lá, liderou a equipe responsável por quebrar o código da máquina Enigma, usada pelos nazistas para criptografar mensagens militares. Turing projetou uma máquina eletromecânica chamada Bombe, que acelerava a decodificação das mensagens criptografadas. Seu trabalho foi fundamental para o sucesso dos Aliados e estima-se que tenha encurtado a guerra em pelo menos dois anos, salvando milhões de vidas.";
        String conteudoFragmento3 = "Após a guerra, Turing continuou seus estudos, contribuindo para o desenvolvimento da inteligência artificial e da biologia matemática. No entanto, em 1952, foi condenado por ser homossexual — considerado crime no Reino Unido na época. Como punição, foi submetido à castração química. Em 1954, foi encontrado morto, envenenado com cianeto, em um suposto suicídio. Tinha apenas 41 anos. Décadas depois, Turing foi reconhecido por sua genialidade e injustiça sofrida. Em 2009, o governo britânico pediu desculpas oficialmente e, em 2013, ele recebeu o perdão real.";


        // --- Helper for boolean input (now local to main) ---
        // This helper method is defined within main for this single-method structure
        // In reality, you'd put it outside main or in a utility class.
        class InputHelper {
            public boolean getBoolean(String prompt) {
                while (true) {
                    System.out.print(prompt + " (true/false): ");
                    String userInput = scanner.nextLine().trim().toLowerCase();
                    if (userInput.equals("true")) {
                        return true;
                    } else if (userInput.equals("false")) {
                        return false;
                    } else {
                        System.out.println("Entrada inválida. Por favor, digite 'true' ou 'false'.");
                    }
                }
            }
        }
        InputHelper inputHelper = new InputHelper();


        // --- Game Introduction ---
        System.out.println("====================================================================");
        System.out.println("                     CÓDIGOS DO TEMPO                           ");
        System.out.println("====================================================================");
        System.out.println("       _____");
        System.out.println("      /     \\");
        System.out.println("     /       \\_____");
        System.out.println("    /              \\");
        System.out.println("   / /|        |\\  \\");
        System.out.println("  / / |        | \\  \\");
        System.out.println(" | |  |        |  | |");
        System.out.println(" | |  |________|  | |");
        System.out.println(" | |  /        \\  | |");
        System.out.println(" | | /          \\ | |");
        System.out.println(" |__|/            \\|__|");
        System.out.println("    |  X        X  |");
        System.out.println("    |    ___      |");
        System.out.println("    \\____/   \\____/");
        System.out.println("\nSeu avô, o Professor Almeida, sempre foi considerado um inventor excêntrico...");
        System.out.println("Pressione ENTER para começar sua aventura...");
        scanner.nextLine();

        // --- Player Name Input ---
        System.out.println("====================================================================");
        System.out.println("DIGITE SEU NOME PARA ESTA MISSÃO:");
        System.out.println("====================================================================");
        playerName = scanner.nextLine();

        System.out.println("\n" + playerName + ", você está diante da incrível máquina do tempo do seu avô...");
        System.out.println("Pressione ENTER para acessar o menu...");
        scanner.nextLine();

        // --- Main Menu Loop ---
        int option = 0;
        boolean exitGame = false;

        while (!exitGame) {
            System.out.println("====================================================================");
            System.out.println("CÓDIGOS DO TEMPO - MENU PRINCIPAL");
            System.out.println("====================================================================");
            System.out.println("Olá, " + playerName + "! O que deseja fazer?");
            System.out.println("1 - INICIAR JORNADA TEMPORAL");
            System.out.println("2 - COMO JOGAR");
            System.out.println("3 - REGRAS DO JOGO");
            System.out.println("4 - SAIR");
            System.out.println("====================================================================");
            System.out.print("Escolha uma opção: ");

            try {
                option = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Por favor, digite um número.");
                scanner.nextLine(); // consume the invalid input
                continue; // Restart the loop
            }

            switch (option) {
                case 1:
                    // --- CAPÍTULO 1: O SÉCULO DAS MÁQUINAS ---
                    estrelasCap1 = 0; // Reset stars for chapter 1 each time it's played
                    boolean chapter1Completed = true; // Flag to track if chapter 1 was failed critically

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
                    int choice1 = 0;
                    try {
                        choice1 = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                    } catch (InputMismatchException e) {
                        System.out.println("Opção inválida. Retornando ao menu principal.");
                        scanner.nextLine(); // consume invalid input
                        chapter1Completed = false; // Indicate failure to proceed
                    }

                    if (choice1 == 2 && chapter1Completed) {
                        System.out.println("\n\"Excelente pergunta!\" exclama Babbage animado...");
                        System.out.println("\"Babbage: talvez possa me ajudar com alguns problemas lógicos!\"");
                        System.out.println("Pressione ENTER para enfrentar o primeiro desafio...");
                        scanner.nextLine();
                    } else if (chapter1Completed) {
                        System.out.println("Sua escolha levou a um caminho menos produtivo. Pressione ENTER para continuar...");
                        scanner.nextLine();
                    }

                    if (chapter1Completed) { // Only proceed with challenges if initial choice was valid
                        // --- DESAFIO DAS LÂMPADAS ---
                        System.out.println("====================================================================");
                        System.out.println("DESAFIO DAS LÂMPADAS");
                        System.out.println("====================================================================");
                        System.out.println("\"Preciso que as lâmpadas A e C estejam acesas, mas a B apagada.\"");
                        System.out.println("Qual operação lógica devemos usar?");
                        System.out.println("1 - A AND C");
                        System.out.println("2 - A OR C");
                        System.out.println("3 - (A OR C) AND NOT B");

                        boolean correct1 = false;
                        int attempts1 = 0;
                        while (!correct1 && attempts1 < 3) {
                            System.out.print("Escolha: ");
                            int choice2 = 0;
                            try {
                                choice2 = scanner.nextInt();
                                scanner.nextLine(); // consume newline
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada inválida. Tente novamente com um número.");
                                scanner.nextLine(); // consume invalid input
                                attempts1++;
                                continue;
                            }
                            attempts1++;

                            if (choice2 == 3) {
                                System.out.println("\"Perfeito! Exatamente o que eu precisava!\"");
                                estrelasCap1 += 2;
                                correct1 = true;
                            } else {
                                System.out.println("\"Não parece estar funcionando... tente novamente!\"");
                            }
                        }
                        if (!correct1) {
                            System.out.println("Você não conseguiu completar o desafio das lâmpadas.");
                            chapter1Completed = false; // Mark chapter as not fully completed
                            System.out.println("Pressione ENTER para continuar (sem progresso para o próximo capítulo)...");
                            scanner.nextLine();
                        }
                    }

                    if (chapter1Completed) { // Only proceed if previous critical challenges passed
                        // --- DESAFIO BINÁRIO ---
                        System.out.println("\n====================================================================");
                        System.out.println("DESAFIO BINÁRIO");
                        System.out.println("====================================================================");
                        System.out.println("\"Como representamos o número 13 em binário?\"");
                        System.out.println("1 - 1101");
                        System.out.println("2 - 1011");
                        System.out.println("3 - 1110");
                        System.out.print("Escolha: ");
                        int choice3 = 0;
                        try {
                            choice3 = scanner.nextInt();
                            scanner.nextLine(); // consume newline
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Continuando sem estrelas neste desafio.");
                            scanner.nextLine(); // consume invalid input
                        }

                        if (choice3 == 1) {
                            System.out.println("\"Maravilhoso! Você tem uma mente analítica!\"");
                            estrelasCap1 += 3;
                        } else {
                            System.out.println("Resposta incorreta.");
                        }

                        System.out.println("\nFragmento Histórico: Charles Babbage nasceu em 1791 em Londres.");

                        // --- DESAFIO LÓGICO ---
                        System.out.println("\n====================================================================");
                        System.out.println("DESAFIO LÓGICO");
                        System.out.println("====================================================================");
                        System.out.println("\"Como expressamos 'A máquina está ligada mas o vapor não está fluindo'?\"");
                        System.out.println("1 - A AND B");
                        System.out.println("2 - A AND NOT B");
                        System.out.println("3 - NOT A AND B");

                        boolean correct2 = false;
                        int attempts2 = 0;
                        while (!correct2 && attempts2 < 3) {
                            System.out.print("Escolha: ");
                            int choice4 = 0;
                            try {
                                choice4 = scanner.nextInt();
                                scanner.nextLine(); // consume newline
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada inválida. Tente novamente com um número.");
                                scanner.nextLine(); // consume invalid input
                                attempts2++;
                                continue;
                            }
                            attempts2++;

                            if (choice4 == 2) {
                                System.out.println("\"Brilhante! Você dominou a lógica booleana!\"");
                                estrelasCap1 += 1;
                                correct2 = true;
                            } else {
                                System.out.println("\"A lógica parece incorreta... tente outra vez!\"");
                            }
                        }
                        if (!correct2) {
                            System.out.println("Você não conseguiu completar o desafio lógico.");
                            chapter1Completed = false; // Mark chapter as not fully completed
                            System.out.println("Pressione ENTER para continuar (sem progresso para o próximo capítulo)...");
                            scanner.nextLine();
                        }
                    }

                    if (chapter1Completed) { // Only show completion if all critical challenges passed
                        System.out.println("\nFragmento Histórico: Em 1822, Babbage propôs a Máquina Diferencial.");
                        System.out.println("\n====================================================================");
                        System.out.println("PARABÉNS, " + playerName + "! VOCÊ COMPLETOU O CAPÍTULO 1!");
                        System.out.println("TOTAL DE ESTRELAS: " + estrelasCap1 + "/6");
                        System.out.println("====================================================================");
                        System.out.println("\"Babbage: Você seria um excelente assistente!\"");
                        System.out.println("\"Uma força irresistível começa a te puxar...\"");
                        System.out.println("Pressione ENTER para continuar sua jornada temporal...");
                        scanner.nextLine();
                    } else {
                        System.out.println("\nVocê falhou em completar o Capítulo 1 satisfatoriamente.");
                        System.out.println("Pressione ENTER para retornar ao menu principal.");
                        scanner.nextLine();
                    }


                    // --- CAPÍTULO 2: O CÓDEX (Only if Chapter 1 was completed) ---
                    if (chapter1Completed) {
                        fragmentosTuring = 0; // Reset fragments for chapter 2
                        boolean chapter2Completed = true; // Flag to track if chapter 2 was failed critically

                        System.out.println("╔════════════════════════════╗");
                        System.out.println("║ CAPÍTULO 2: O CÓDEX        ║");
                        System.out.println("╚════════════════════════════╝\n");

                        // Draw Machine (repeated from method, now inline)
                        System.out.println("[ MÁQUINA DO TEMPO ]");
                        System.out.println(" [███] ");
                        System.out.println(" ┌────────┐ ");
                        System.out.println(" ( INVENTOR ) ");
                        System.out.println(" ┌──┤ CÁPSULA ├──┐ ");
                        System.out.println(" │ └────────┘ │ ");
                        System.out.println(" └──────────────┘\n");

                        // Introduction (repeated from method, now inline)
                        System.out.println("Você acorda em um bunker militar em 1942. Tudo está em silêncio.");
                        System.out.println("Você se lembra da máquina do tempo e do caderno do seu avô.");
                        System.out.println("Um grupo de soldados te pede ajuda para decifrar uma mensagem secreta dos inimigos.\n");

                        // Choose Path (repeated from method, now inline)
                        System.out.println("Você vê uma porta iluminada e uma fresta escura ao lado.");
                        System.out.println("1 - Entrar pela porta");
                        System.out.println("2 - Passar pela fresta");
                        int escolhaC2 = 0;
                        boolean validInputC2 = false;
                        while (!validInputC2) {
                            try {
                                System.out.print("Sua escolha: ");
                                escolhaC2 = scanner.nextInt();
                                scanner.nextLine(); // consume newline
                                if (escolhaC2 == 1 || escolhaC2 == 2) {
                                    validInputC2 = true;
                                } else {
                                    System.out.println("Opção inválida. Digite 1 ou 2.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada inválida. Digite um número (1 ou 2).");
                                scanner.nextLine(); // consume the invalid input
                            }
                        }

                        if (escolhaC2 == 2) {
                            System.out.println("Você avança mais rapidamente pela fresta.\n");
                        } else {
                            System.out.println("A porta leva a um corredor com armadilhas. Você demora mais tempo.\n");
                        }

                        // --- DESAFIO 1 (Capítulo 2) ---
                        System.out.println("\n====================================================================");
                        System.out.println("DESAFIO 1: LÓGICA DA MENSAGEM");
                        System.out.println("====================================================================");
                        System.out.println("Em determinado momento, uma mensagem codificada foi interceptada.");
                        System.out.println("Para decifrá-la, você precisa configurar os canais de rádio corretamente com base nas seguintes condições lógicas:");
                        System.out.println("Antena de Alta Frequência (A) deve estar ativada E Filtro de Ruído (B) deve estar ativado OU Canal de Comunicação C deve estar desligado.");

                        boolean desafio1C2Success = false;
                        for (int i = 1; i <= 3; i++) {
                            System.out.println("\nTentativa " + i + " de 3:");
                            boolean a = inputHelper.getBoolean("Gerador A ligado?");
                            boolean b = inputHelper.getBoolean("Gerador B ligado?");
                            boolean c = inputHelper.getBoolean("Alarme C desligado?");

                            if ((a && b) || !c) {
                                System.out.println("\n✔ Mensagem decodificada com sucesso! Os Aliados obtiveram informações valiosas!\n");
                                if (i == 1) { // Only award fragment on first attempt success
                                    fragmentosTuring++;
                                    System.out.println("\n**** Fragmento de Turing desbloqueado! (" + fragmentosTuring + "/3) ***\n" + conteudoFragmento1 + "\n");
                                }
                                desafio1C2Success = true;
                                break; // Exit loop on success
                            } else {
                                System.out.println("❌ Falha na configuração. A mensagem continua codificada.");
                                if (i == 3) {
                                    System.out.println("Você esgotou suas tentativas para este desafio.");
                                }
                            }
                        }
                        if (!desafio1C2Success) {
                            chapter2Completed = false;
                            System.out.println("\n⚠ Você falhou em um desafio três vezes! A linha do tempo foi comprometida.");
                        }

                        if (chapter2Completed) {
                            // --- DESAFIO 2 (Capítulo 2) ---
                            System.out.println("\n====================================================================");
                            System.out.println("DESAFIO 2: LÓGICA DO RADAR");
                            System.out.println("====================================================================");
                            System.out.println("Ao fim de incansáveis horas de caminhada, encontraram o bunker secreto dos Aliados.");
                            System.out.println("Porém, os aviões do eixo estão se aproximando e vão descobrir o bunker.");
                            System.out.println("O sistema de defesa depende de dois radares, mas para evitar falhas e interferências, APENAS UM DOS RADARES PODE ESTAR ATIVO POR VEZ.");

                            boolean desafio2C2Success = false;
                            for (int i = 1; i <= 3; i++) {
                                System.out.println("\nTentativa " + i + " de 3:");
                                boolean radar1 = inputHelper.getBoolean("Radar 1 está ligado?");
                                boolean radar2 = inputHelper.getBoolean("Radar 2 está ligado?");

                                boolean sistemaAtivado = radar1 ^ radar2; // XOR operation

                                if (sistemaAtivado) {
                                    System.out.println("\n✔ Sistema de Defesa Ativado com Sucesso! Os céus estão protegidos!\n");
                                    if (i == 1) { // Only award fragment on first attempt success
                                        fragmentosTuring++;
                                        System.out.println("\n**** Fragmento de Turing desbloqueado! (" + fragmentosTuring + "/3) ***\n" + conteudoFragmento2 + "\n");
                                    }
                                    desafio2C2Success = true;
                                    break; // Exit loop on success
                                } else {
                                    System.out.println("❌ Falha: ou nenhum radar, ou ambos estão ligados. Tente novamente.");
                                    if (i == 3) {
                                        System.out.println("Você esgotou suas tentativas para este desafio.");
                                    }
                                }
                            }
                            if (!desafio2C2Success) {
                                chapter2Completed = false;
                                System.out.println("\n⚠ Você falhou em um desafio três vezes! A linha do tempo foi comprometida.");
                            }
                        }

                        if (chapter2Completed) {
                            // --- DESAFIO 3 (Capítulo 2) ---
                            System.out.println("\n====================================================================");
                            System.out.println("DESAFIO 3: LÓGICA DO TERMINAL");
                            System.out.println("====================================================================");
                            System.out.println("Você se infiltra em uma base nazista ocupada na França.");
                            System.out.println("No porão escuro, encontra um terminal da resistência que transmite mensagens codificadas para os Aliados.");
                            System.out.println("Mas há um problema: o terminal está travado, pois sistemas de bloqueio de sinal estão ativos.");
                            System.out.println("Para desbloquear o terminal e ativar a transmissão, você precisa garantir que TODOS OS BLOQUEADORES DE SINAL ESTEJAM DESLIGADOS.");
                            System.out.println("Se qualquer um deles estiver ligado, a operação falha.");

                            boolean desafio3C2Success = false;
                            for (int i = 1; i <= 3; i++) {
                                System.out.println("\nTentativa " + i + " de 3:");
                                boolean bloqueador1 = inputHelper.getBoolean("Bloqueador de sinal 1 ativo?");
                                boolean bloqueador2 = inputHelper.getBoolean("Bloqueador de sinal 2 ativo?");
                                boolean bloqueador3 = inputHelper.getBoolean("Bloqueador de sinal 3 ativo?");

                                if (!bloqueador1 && !bloqueador2 && !bloqueador3) {
                                    System.out.println("\n✔ Terminal desbloqueado! Mensagem enviada com sucesso à resistência.\n");
                                    if (i == 1) { // Only award fragment on first attempt success
                                        fragmentosTuring++;
                                        System.out.println("\n**** Fragmento de Turing desbloqueado! (" + fragmentosTuring + "/3) ***\n" + conteudoFragmento3 + "\n");
                                    }
                                    desafio3C2Success = true;
                                    break; // Exit loop on success
                                } else {
                                    System.out.println("❌ Sinais ainda estão bloqueados. Tente novamente.");
                                    if (i == 3) {
                                        System.out.println("Você esgotou suas tentativas para este desafio.");
                                    }
                                }
                            }
                            if (!desafio3C2Success) {
                                chapter2Completed = false;
                                System.out.println("\n⚠ Você falhou em um desafio três vezes! A linha do tempo foi comprometida.");
                            }
                        }

                        // --- Capítulo 2 Conclusion ---
                        if (chapter2Completed) {
                            System.out.println("\n====================================================================");
                            System.out.println("FIM DO CAPÍTULO 2");
                            System.out.println("====================================================================");
                            System.out.println("Ao retornar ao bunker, você encontra sua máquina do tempo escondida atrás de um pano.");
                            System.out.println("Os oficiais do exército a encontraram e queriam estudá-la, mas para não interferir no passado,");
                            System.out.println("você rapidamente inicia uma sequência numérica que começa a se alinhar no painel da cápsula.");
                            System.out.println("Você ativa o protocolo de retorno temporal.\n");

                            System.out.println("Você se despede silenciosamente dos ecos de uma guerra devastadora, carregando consigo");
                            System.out.println("não apenas códigos quebrados, mas a honra de mentes brilhantes apagadas pela história.\n");

                            System.out.println("A máquina do tempo se fecha com um estrondo metálico.");
                            System.out.println("Você sente seu corpo flutuar, e dá mais um salto no tempo!\n");

                            System.out.println("Parabéns, " + playerName + "! Você concluiu todos os desafios com " + fragmentosTuring + "/3 fragmentos de Turing!");
                        } else {
                            System.out.println("\nInfelizmente, você não conseguiu completar todos os desafios do Capítulo 2. Tente novamente para desvendar os códigos do tempo!");
                        }
                    } // End if chapter1Completed
                    break;

                case 2:
                    System.out.println("\nComo Jogar: Escolha opções com números e resolva desafios lógicos.");
                    System.out.println("Pressione ENTER para voltar.");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("\nRegras do Jogo: Você terá até 3 tentativas por desafio.");
                    System.out.println("Ganha estrelas/fragmentos conforme acertos. Boa sorte!");
                    System.out.println("Pressione ENTER para voltar.");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("\nSaindo do jogo... até mais!");
                    exitGame = true; // Set flag to true to exit the main loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close(); // Close the scanner when the game exits
    }
}