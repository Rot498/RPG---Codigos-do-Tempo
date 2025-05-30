 import java.util.InputMismatchException;
import java.util.Scanner;

public class codigosdotempo {

    private Scanner scanner;
    private String nomeJogador;

    // Variáveis Capítulo 1 (Babbage)
    private int estrelasCap1;
    private String fragmentoBabbage1 = "Início: A Invenção da Máquina de Diferenças\n" +
            "Charles Babbage, um brilhante matemático do século XIX, ficou frustrado com os erros em tabelas matemáticas. Isso o levou a conceber a Máquina de Diferenças em 1822, um dispositivo mecânico para cálculos automáticos. Ele garantiu financiamento do governo britânico, marcando o começo de sua jornada na computação mecânica.";
    private String fragmentoBabbage2 = "Meio: A Inovação da Máquina Analítica e Desafios\n" +
            "Durante a construção da Máquina de Diferenças, Babbage idealizou a Máquina Analítica (1837), um projeto ainda mais ambicioso e o precursor do computador moderno, com memória e programação por cartões perfurados. No entanto, ele enfrentou enormes obstáculos financeiros e tecnológicos, nunca conseguindo construir uma versão completa de suas máquinas.";
    private String fragmentoBabbage3 = "Fim: O Legado Póstumo do \"Pai do Computador\"\n" +
            "Babbage morreu em 1871 sem ver suas invenções concretizadas e amplamente reconhecidas. Apesar disso, suas ideias e projetos detalhados foram redescobertas e se tornaram fundamentais para o desenvolvimento dos computadores eletrônicos no século XX. Hoje, Charles Babbage é celebrado como o \"Pai do Computador\", um visionário que lançou as bases da era digital.";

    // Variáveis Capítulo 2 (Turing)
    private int fragmentosTuringCap2; // Usado como contador de estrelas/fragmentos para o Cap 2
    private String conteudoFragmentoTuring1 = "Alan Mathison Turing nasceu em 23 de junho de 1912, em Londres. Desde cedo demonstrou grande talento em matemática e lógica, apesar de ser considerado excêntrico por professores e colegas. Estudou no Kings College, na Universidade de Cambridge, onde se destacou por seu trabalho em matemática pura. Em 1936, Turing publicou o artigo On Computable Numbers, no qual propôs o conceito de uma máquina abstrata — hoje conhecida como Máquina de Turing. Essa ideia formou a base da computação moderna, ao definir matematicamente o que significa “calcular.";
    private String conteudoFragmentoTuring2 = "Com o início da Segunda Guerra Mundial, Turing foi recrutado para trabalhar em Bletchley Park, o centro de inteligência britânico. Lá, liderou a equipe responsável por quebrar o código da máquina Enigma, usada pelos nazistas para criptografar mensagens militares. Turing projetou uma máquina eletromecânica chamada Bombe, que acelerava a decodificação das mensagens criptografadas. Seu trabalho foi fundamental para o sucesso dos Aliados e estima-se que tenha encurtado a guerra em pelo menos dois anos, salvando milhões de vidas.";
    private String conteudoFragmentoTuring3 = "Após a guerra, Turing continuou seus estudos, contribuindo para o desenvolvimento da inteligência artificial e da biologia matemática. No entanto, em 1952, foi condenado por ser homossexual — considerado crime no Reino Unido na época. Como punição, foi submetido à castração química. Em 1954, foi encontrado morto, envenenado com cianeto, em um suposto suicídio. Tinha apenas 41 anos. Décadas depois, Turing foi reconhecido por sua genialidade e injustiça sofrida. Em 2009, o governo britânico pediu desculpas oficialmente e, em 2013, ele recebeu o perdão real.";

    // Variáveis Capítulo 3 (Ada Lovelace / Futuro)
    private boolean fragmentoAda1Adquirido;
    private boolean fragmentoAda2Adquirido;
    private boolean fragmentoAda3Adquirido;
    // O Cap 3 tem uma lógica de "estrelas" diferente, baseada em tentativas, exibida diretamente.

    public codigosdotempo() {
        scanner = new Scanner(System.in);
        estrelasCap1 = 0;
        fragmentosTuringCap2 = 0;
        fragmentoAda1Adquirido = false;
        fragmentoAda2Adquirido = false;
        fragmentoAda3Adquirido = false;
    }

    public static void main(String[] args) {
        codigosdotempo game = new codigosdotempo();
        game.iniciarAventuraCompleta();
        game.scanner.close();
    }

    public void iniciarAventuraCompleta() {
        // Introdução geral e nome do jogador (uma vez)
        System.out.println("====================================================================");
        System.out.println("                     CÓDIGOS DO TEMPO                               ");
        System.out.println("====================================================================");
        System.out.println("        ___");
        System.out.println("       /     \\");
        System.out.println("      /       \\___");
        System.out.println("     /               \\");
        System.out.println("    /  /|       |\\   \\");
        System.out.println("   /  / |       | \\   \\");
        System.out.println("  |  |  |       |  |  |");
        System.out.println("  |  |  |___|  |  |");
        System.out.println("  |  |  /       \\  |  |");
        System.out.println("  |  | /         \\ |  |");
        System.out.println("  |_|/           \\|_|");
        System.out.println("     |  X       X  |");
        System.out.println("     |    _      |");
        System.out.println("     \\_/   \\_/");
        System.out.println("\nSeu avô, o Professor Almeida, sempre foi considerado um inventor excêntrico...");
        System.out.println("Pressione ENTER para começar sua aventura...");
        scanner.nextLine();

        System.out.println("\n====================================================================");
        System.out.println("DIGITE SEU NOME PARA ESTA MISSÃO:");
        System.out.println("====================================================================");
        nomeJogador = scanner.nextLine();

        System.out.println("\n" + nomeJogador + ", você está diante da incrível máquina do tempo do seu avô...");
        System.out.println("Pressione ENTER para acessar o menu...");
        scanner.nextLine();

        // Menu principal do jogo
        int opcaoMenuPrincipal = 0;
        while (opcaoMenuPrincipal != 4) {
            System.out.println("\n====================================================================");
            System.out.println("CÓDIGOS DO TEMPO - MENU PRINCIPAL");
            System.out.println("====================================================================");
            System.out.println("Olá, " + nomeJogador + "! O que deseja fazer?");
            System.out.println("1 - INICIAR JORNADA TEMPORAL");
            System.out.println("2 - COMO JOGAR");
            System.out.println("3 - REGRAS DO JOGO");
            System.out.println("4 - SAIR");
            System.out.println("====================================================================");
            opcaoMenuPrincipal = lerInteiro("Escolha uma opção: ");

            switch (opcaoMenuPrincipal) {
                case 1:
                    // Resetar progresso dos capítulos antes de iniciar uma nova jornada
                    estrelasCap1 = 0;
                    fragmentosTuringCap2 = 0;
                    fragmentoAda1Adquirido = false;
                    fragmentoAda2Adquirido = false;
                    fragmentoAda3Adquirido = false;

                    boolean cap1Concluido = iniciarCapitulo1();
                    if (cap1Concluido) {
                        System.out.println("\nParabéns por completar o Capítulo 1!");
                        System.out.println("Pressione ENTER para seguir para o Capítulo 2...");
                        scanner.nextLine();
                        boolean cap2Concluido = iniciarCapitulo2();
                        if (cap2Concluido) {
                            System.out.println("\nParabéns por completar o Capítulo 2!");
                            System.out.println("Pressione ENTER para seguir para o Capítulo 3...");
                            scanner.nextLine();
                            boolean cap3Concluido = iniciarCapitulo3();
                            if (cap3Concluido) {
                                System.out.println("\nJornada temporal completa! Você desvendou os Códigos do Tempo!");
                                // O menu final do Cap3 já oferece opções de reiniciar ou sair.
                            } else {
                                System.out.println("Você não conseguiu completar o Capítulo 3. Retornando ao Menu Principal.");
                            }
                        } else {
                            System.out.println("Você não conseguiu completar o Capítulo 2. Retornando ao Menu Principal.");
                        }
                    } else {
                        System.out.println("Você não conseguiu completar o Capítulo 1. Retornando ao Menu Principal.");
                    }
                    opcaoMenuPrincipal = 0; // Para exibir o menu principal novamente após a jornada
                    break;
                case 2:
                    mostrarComoJogar();
                    break;
                case 3:
                    mostrarRegras();
                    break;
                case 4:
                    System.out.println("\nSaindo do jogo... Até mais, " + nomeJogador + "!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 4.");
            }
        }
    }

    // --- CAPÍTULO 1: O SÉCULO DAS MÁQUINAS (CHARLES BABBAGE) ---
    private boolean iniciarCapitulo1() {
        boolean capituloConcluido = false;
        estrelasCap1 = 0; // Reinicia estrelas do capítulo 1 a cada tentativa de jogar o capítulo

        while (!capituloConcluido) {
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
            int escolha1 = lerInteiro("Escolha: ");

            if (escolha1 == 2) {
                System.out.println("\n\"Excelente pergunta!\" exclama Babbage animado...");
                System.out.println("\"Babbage: talvez possa me ajudar com alguns problemas lógicos!\"");
            } else {
                System.out.println("\nBabbage parece um pouco desapontado com sua falta de interesse imediato na máquina...");
                System.out.println("Mesmo assim, ele decide te dar uma chance.");
            }
            System.out.println("Pressione ENTER para enfrentar o primeiro desafio...");
            scanner.nextLine();

            // DESAFIO DAS LÂMPADAS
            boolean passouDesafio1 = desafioLampadasCap1();
            if (!passouDesafio1) {
                System.out.println("\nVocê não conseguiu resolver o Desafio das Lâmpadas após 3 tentativas.");
                System.out.println("Retornando ao início do capítulo 1 para tentar novamente...");
                estrelasCap1 = 0; // Zera estrelas do cap1 antes de reiniciar
                continue; // Volta para o início do loop do capítulo 1
            }

            // DESAFIO BINÁRIO
            boolean passouDesafio2 = desafioBinarioCap1();
            if (!passouDesafio2) {
                System.out.println("\nVocê não conseguiu resolver o Desafio Binário após 3 tentativas.");
                System.out.println("Retornando ao início do capítulo 1 para tentar novamente...");
                estrelasCap1 = 0;
                continue;
            }

            // DESAFIO LÓGICO
            boolean passouDesafio3 = desafioLogicoCap1();
            if (!passouDesafio3) {
                System.out.println("\nVocê não conseguiu resolver o Desafio Lógico após 3 tentativas.");
                System.out.println("Retornando ao início do capítulo 1 para tentar novamente...");
                estrelasCap1 = 0;
                continue;
            }

            // Se chegou até aqui, todos os desafios do capítulo 1 foram superados
            System.out.println("\n====================================================================");
            System.out.println("PARABÉNS, " + nomeJogador + "! VOCÊ COMPLETOU O CAPÍTULO 1!");
            System.out.println("TOTAL DE ESTRELAS (Cap. 1): " + estrelasCap1 + "/6");
            System.out.println("====================================================================");
            System.out.println("\"Babbage: Você seria um excelente assistente!\"");
            System.out.println("\"Uma força irresistível começa a te puxar...\"");
            capituloConcluido = true; // Marca o capítulo como concluído para sair do loop
        }
        return capituloConcluido; // Retorna true se o capítulo foi concluído
    }

    private boolean desafioLampadasCap1() {
        System.out.println("\n====================================================================");
        System.out.println("DESAFIO DAS LÂMPADAS");
        System.out.println("====================================================================");
        System.out.println("\"Preciso que as lâmpadas A e C estejam acesas, mas a B apagada.\"");
        System.out.println("Qual operação lógica devemos usar?");
        System.out.println("1 - A AND C");
        System.out.println("2 - A OR C");
        System.out.println("3 - (A OR C) AND NOT B");

        int tentativas = 0;
        while (tentativas < 3) {
            int escolha = lerInteiro("Escolha: ");
            tentativas++;
            if (escolha == 3) {
                System.out.println("\"Perfeito! Exatamente o que eu precisava!\"");
                if (tentativas == 1) {
                    estrelasCap1 += 2;
                    System.out.println("\n*Fragmento Histórico Desbloqueado:*\n" + fragmentoBabbage1);
                } else {
                    System.out.println("Você passou no desafio, mas não ganhou o fragmento por não acertar de primeira.");
                }
                return true;
            } else {
                System.out.println("\"Não parece estar funcionando... tente novamente!\"");
                if (tentativas < 3) {
                    System.out.println("Tentativas restantes: " + (3 - tentativas));
                }
            }
        }
        return false;
    }

    private boolean desafioBinarioCap1() {
        System.out.println("\n====================================================================");
        System.out.println("DESAFIO BINÁRIO");
        System.out.println("====================================================================");
        System.out.println("\"Como representamos o número 13 em binário?\"");
        System.out.println("1 - 1101");
        System.out.println("2 - 1011");
        System.out.println("3 - 1110");

        int tentativas = 0;
        while (tentativas < 3) {
            int escolha = lerInteiro("Escolha: ");
            tentativas++;
            if (escolha == 1) {
                System.out.println("\"Maravilhoso! Você tem uma mente analítica!\"");
                if (tentativas == 1) {
                    estrelasCap1 += 3;
                    System.out.println("\n*Fragmento Histórico Desbloqueado:*\n" + fragmentoBabbage2);
                } else {
                    System.out.println("Você passou no desafio, mas não ganhou o fragmento por não acertar de primeira.");
                }
                return true;
            } else {
                System.out.println("\"Hmm, essa não é a resposta correta. Mas continue tentando!\"");
                if (tentativas < 3) {
                    System.out.println("Tentativas restantes: " + (3 - tentativas));
                }
            }
        }
        return false;
    }

    private boolean desafioLogicoCap1() {
        System.out.println("\n====================================================================");
        System.out.println("DESAFIO LÓGICO");
        System.out.println("====================================================================");
        System.out.println("\"Como expressamos 'A máquina está ligada mas o vapor não está fluindo'?\"");
        System.out.println("1 - A AND B");
        System.out.println("2 - A AND NOT B");
        System.out.println("3 - NOT A AND B");

        int tentativas = 0;
        while (tentativas < 3) {
            int escolha = lerInteiro("Escolha: ");
            tentativas++;
            if (escolha == 2) {
                System.out.println("\"Brilhante! Você dominou a lógica booleana!\"");
                if (tentativas == 1) {
                    estrelasCap1 += 1;
                    System.out.println("\n*Fragmento Histórico Desbloqueado:*\n" + fragmentoBabbage3);
                } else {
                    System.out.println("Você passou no desafio, mas não ganhou o fragmento por não acertar de primeira.");
                }
                return true;
            } else {
                System.out.println("\"A lógica parece incorreta... tente outra vez!\"");
                if (tentativas < 3) {
                    System.out.println("Tentativas restantes: " + (3 - tentativas));
                }
            }
        }
        return false;
    }

    // --- CAPÍTULO 2: O CÓDEX (ALAN TURING) ---
    private boolean iniciarCapitulo2() {
        boolean capituloConcluido = false;
        fragmentosTuringCap2 = 0; // Zera fragmentos para o capítulo 2 a cada tentativa

        while (!capituloConcluido) {
            System.out.println("╔════════════════════════════╗");
            System.out.println("║     CAPÍTULO 2: O CÓDEX    ║");
            System.out.println("╚════════════════════════════╝\n");

            desenharMaquinaCap2();
            introducaoCap2();
            escolherCaminhoCap2();

            if (!desafioTuring1()) {
                voltarInicioCap2();
                continue; // Reinicia o loop do capítulo 2
            }

            if (!desafioTuring2()) {
                voltarInicioCap2();
                continue; // Reinicia o loop do capítulo 2
            }

            if (!desafioTuring3()) {
                voltarInicioCap2();
                continue; // Reinicia o loop do capítulo 2
            }

            conclusaoCap2();
            System.out.println("Parabéns, você concluiu todos os desafios com " + fragmentosTuringCap2 + "/3 fragmentos de Turing!");
            capituloConcluido = true; // Marca o capítulo como concluído
        }
        return capituloConcluido; // Retorna true se o capítulo foi concluído
    }

    private void desenharMaquinaCap2() {
        System.out.println("[ MÁQUINA DO TEMPO ]");
        System.out.println("        [███]      ");
        System.out.println("     ┌────────┐    ");
        System.out.println("    ( INVENTOR )   ");
        System.out.println(" ┌──┤ CÁPSULA ├──┐ ");
        System.out.println(" │  └────────┘  │ ");
        System.out.println(" └──────────────┘\n");
    }

    private void introducaoCap2() {
        System.out.println("Você acorda em um bunker militar em 1942. Tudo está em silêncio.");
        System.out.println("Você se lembra da máquina do tempo e do caderno do seu avô.");
        System.out.println("Um grupo de soldados te pede ajuda para decifrar uma mensagem secreta dos inimigos.\n");
    }

    private void escolherCaminhoCap2() {
        System.out.println("Você vê uma porta iluminada e uma fresta escura ao lado.");
        System.out.println("1 - Entrar pela porta");
        System.out.println("2 - Passar pela fresta");
        int escolha = lerInteiro("Escolha: ");
        if (escolha == 2) {
            System.out.println("Você avança mais rapidamente pela fresta.\n");
        } else {
            System.out.println("A porta leva a um corredor com armadilhas. Você demora mais tempo.\n");
        }
    }

    private boolean desafioTuring1() {
        System.out.println("\n====================================================================");
        System.out.println("DESAFIO DE DECODIFICAÇÃO");
        System.out.println("====================================================================");
        System.out.println("Em determinado momento, uma mensagem codificada foi interceptada. Para decifrá-la, você precisa configurar os canais de rádio corretamente com base nas seguintes condições lógicas:");
        System.out.println("Antena de Alta Frequência (A) deve estar ativada E Filtro de Ruído (B) deve estar ativado OU Canal de Comunicação C deve estar desligado.");
        System.out.println("Ou seja: (A AND B) OR (NOT C)");

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nTentativa " + i + " de 3:");
            System.out.print("Antena de Alta Frequência (A) ativada? (true/false): ");
            boolean a = lerBooleano();
            System.out.print("Filtro de Ruído (B) ativado? (true/false): ");
            boolean b = lerBooleano();
            System.out.print("Canal de Comunicação C desligado? (true/false): ");
            boolean c = lerBooleano();

            boolean condicaoCorreta = (a && b) || c;

            if (condicaoCorreta) {
                System.out.println("\nMensagem decodificada com sucesso!");
                System.out.println("Os Aliados obtiveram informações valiosas!\n");
                if (i == 1) {
                    fragmentosTuringCap2++;
                    System.out.println("\n**** Fragmento de Turing desbloqueado! (" + fragmentosTuringCap2 + "/3) ***\n" + conteudoFragmentoTuring1 + "\n");
                } else {
                    System.out.println("Você passou no desafio, mas não ganhou o fragmento por não acertar de primeira.");
                }
                return true;
            } else {
                System.out.println("Falha na configuração. A mensagem continua codificada.\n");
            }
        }
        return false;
    }

    private boolean desafioTuring2() {
        System.out.println("\n====================================================================");
        System.out.println("DESAFIO DO SISTEMA DE RADARES");
        System.out.println("====================================================================");
        System.out.println("O sistema de defesa depende de dois radares, mas para evitar falhas e interferências, apenas um dos radares pode estar ativo por vez. (Lógica XOR)");

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nTentativa " + i + " de 3:");
            System.out.print("Radar 1 está ligado? (true/false): ");
            boolean radar1 = lerBooleano();
            System.out.print("Radar 2 está ligado? (true/false): ");
            boolean radar2 = lerBooleano();

            boolean sistemaAtivado = radar1 ^ radar2; // XOR lógico

            if (sistemaAtivado) {
                System.out.println("\nSistema de Defesa Ativado com Sucesso!");
                System.out.println("Os céus estão protegidos!\n");
                if (i == 1) {
                    fragmentosTuringCap2++;
                    System.out.println("\n**** Fragmento de Turing desbloqueado! (" + fragmentosTuringCap2 + "/3) ***\n" + conteudoFragmentoTuring2 + "\n");
                } else {
                    System.out.println("Você passou no desafio, mas não ganhou o fragmento por não acertar de primeira.");
                }
                return true;
            } else {
                System.out.println("Falha: ou nenhum radar, ou ambos estão ligados. Tente novamente.\n");
            }
        }
        return false;
    }

    private boolean desafioTuring3() {
        System.out.println("\n====================================================================");
        System.out.println("DESAFIO DE INFILTRAÇÃO");
        System.out.println("====================================================================");
        System.out.println("Você se infiltra em uma base nazista. Para desbloquear o terminal e ativar a transmissão, você precisa garantir que todos os bloqueadores de sinal estejam desligados. (Lógica AND com NOT)");

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nTentativa " + i + " de 3:");
            System.out.print("Bloqueador de sinal 1 ativo? (true/false): ");
            boolean bloqueador1 = lerBooleano();
            System.out.print("Bloqueador de sinal 2 ativo? (true/false): ");
            boolean bloqueador2 = lerBooleano();
            System.out.print("Bloqueador de sinal 3 ativo? (true/false): ");
            boolean bloqueador3 = lerBooleano();

            // Para que todos estejam desligados, a condição é NOT bloqueador1 AND NOT bloqueador2 AND NOT bloqueador3
            boolean terminalDesbloqueado = !bloqueador1 && !bloqueador2 && !bloqueador3;

            if (terminalDesbloqueado) {
                System.out.println("Terminal desbloqueado! Mensagem enviada com sucesso à resistência.");
                if (i == 1) {
                    fragmentosTuringCap2++;
                    System.out.println("\n**** Fragmento de Turing desbloqueado! (" + fragmentosTuringCap2 + "/3) ***\n" + conteudoFragmentoTuring3 + "\n");
                } else {
                    System.out.println("Você passou no desafio, mas não ganhou o fragmento por não acertar de primeira.");
                }
                return true;
            } else {
                System.out.println("Sinais ainda estão bloqueados. Tente novamente.");
            }
        }
        return false;
    }

    private void conclusaoCap2() {
        System.out.println("\n====================================================================");
        System.out.println("CONCLUÍDO: CAPÍTULO 2");
        System.out.println("====================================================================");
        System.out.println("Ao voltar para o bunker, você encontra sua máquina do tempo escondida atrás de um pano.");
        System.out.println("Você ativa o protocolo de retorno temporal.\n");

        System.out.println("Você se despede silenciosamente dos ecos de uma guerra devastadora.");
        System.out.println("A máquina do tempo se fecha com um estrondo metálico.");
        System.out.println("Você sente seu corpo flutuar, e dá mais um salto no tempo.\n");
    }

    private void voltarInicioCap2() {
        System.out.println("\n⚠ Você falhou 3 vezes neste desafio! Retornando ao início do Capítulo 2 para tentar novamente...\n");
    }

    // --- CAPÍTULO 3: DE VOLTA PARA 2025 (ADA LOVELACE / FUTURO) ---
    private boolean iniciarCapitulo3() {
        boolean capituloConcluido = false;
        // Resetar fragmentos do capítulo 3
        fragmentoAda1Adquirido = false;
        fragmentoAda2Adquirido = false;
        fragmentoAda3Adquirido = false;

        // Loop para permitir reiniciar o capítulo 3 em caso de falha
        while(!capituloConcluido) {
            mostrarPainelFuturista();
            System.out.println("====================================================================");
            System.out.println(" CAPÍTULO 3: DE VOLTA PARA 2025");
            System.out.println("====================================================================");
            System.out.println("Você chega a um laboratório altamente tecnológico, repleto de luzes LED e hologramas.");
            System.out.println("Um painel digital exibe: \"PARA RETORNAR, RESOLVA OS CÓDIGOS DO FUTURO\"");
            System.out.println();

            System.out.println("Enquanto observa, um robô aparece:");
            mostrarRoboCap3();

            System.out.println("\nPressione ENTER para continuar...");
            scanner.nextLine();

            System.out.println("A Máquina do Tempo está ativando:");
            mostrarMaquinaTempoDetalhadaCap3();

            System.out.println("\nPressione ENTER para iniciar os desafios finais...");
            scanner.nextLine();

            // Desafio de Ada Lovelace
            boolean passouAda = desafioAdaLovelaceCap3();
            if (!passouAda) {
                System.out.println("Você não conseguiu completar os desafios de Ada Lovelace. Reiniciando Capítulo 3...");
                // Resetar fragmentos do Ada se for reiniciar o capítulo
                fragmentoAda1Adquirido = false;
                fragmentoAda2Adquirido = false;
                fragmentoAda3Adquirido = false;
                continue; // Reinicia o loop do Capítulo 3
            }

            System.out.println("\nVocê acessa o painel de controle:");
            mostrarPainelControleCap3();

            System.out.println("\nPressione ENTER para continuar...");
            scanner.nextLine();

            // Desafio Binário do Futuro
            boolean passouBinarioFuturo = desafioBinarioFuturoCap3();
            if (!passouBinarioFuturo) {
                System.out.println("Você não conseguiu completar o Desafio Binário do Futuro. Reiniciando Capítulo 3...");
                fragmentoAda1Adquirido = false;
                fragmentoAda2Adquirido = false;
                fragmentoAda3Adquirido = false;
                continue;
            }

            // O desafioLogicoFuturo não estava sendo chamado no original, mas pode ser adicionado aqui se necessário.
            // boolean passouLogicoFuturo = desafioLogicoFuturoCap3();
            // if (!passouLogicoFuturo) { ... continue; }


            System.out.println("\nUm portal futurista se abre para seu retorno:");
            mostrarPortalFuturistaCap3();
            mostrarRetornoFuturoCap3();

            System.out.println("====================================================================");
            System.out.println(" PARABÉNS, " + nomeJogador + "! VOCÊ RETORNOU PARA O ANO DE 2025!");
            System.out.println("====================================================================");
            System.out.println("Você viajou por momentos marcantes da história da tecnologia.");
            System.out.println("Agora está de volta ao ano de 2025 com muito mais conhecimento.");

            exibirFragmentosAdaLovelace();

            capituloConcluido = true; // Marca o capítulo como concluído
        }

        // Após o capítulo 3 ser concluído com sucesso, mostrar o menu final do jogo.
        menuFinalCap3(); // Este menu tem opções de reiniciar o JOGO ou SAIR.
        return true; // Indica que o capítulo (e potencialmente o jogo) foi concluído.
    }

    private void mostrarPainelFuturista() {
        System.out.println("      .----------------.  .----------------. ");
        System.out.println("     | .--------------. || .--------------. |");
        System.out.println("     | |   ______     | || |  ____  ____  | |");
        System.out.println("     | |  |_   __ \\  | || | |_  _||_  _| | |");
        System.out.println("     | |    | |__) |  | || |   \\ \\  / / | |");
        System.out.println("     | |    |  ___/   | || |    > `' <    | |");
        System.out.println("     | |   _| |_      | || |  _/ /'`\\ \\_| |");
        System.out.println("     | |  |_______|   | || | |______|____| |");
        System.out.println("     | |              | || |              | |");
        System.out.println("     | '--------------' || '--------------' |");
        System.out.println("      '----------------'  '----------------' ");
    }

    private void mostrarRoboCap3() {
        System.out.println("     _.-^^---....,,--       ");
        System.out.println(" _--                  --_  ");
        System.out.println("<       🤖 Olá!          >");
        System.out.println("|_..._           __...--   ");
        System.out.println("   /  .-'\\     /-.         ");
        System.out.println("  |   \\    /   /           ");
        System.out.println("   \\  '--'  `--'           ");
        System.out.println("    `-.____.-'            ");
    }

    private void mostrarMaquinaTempoDetalhadaCap3() {
        System.out.println("       ___________");
        System.out.println("      /           \\");
        System.out.println("     /   [ O O ]   \\");
        System.out.println("    |    _______    |");
        System.out.println("    |   | M.T.  |   |"); // M.T. = Máquina do Tempo
        System.out.println("    |   |_______|   |");
        System.out.println("    |  /         \\  |");
        System.out.println("    | /           \\ |");
        System.out.println("    ||-------------||");
        System.out.println("    ||   CONTROLES ||");
        System.out.println("    ||-------------||");
        System.out.println("    |'--_______--' |");
        System.out.println("    \\_____________/ ");
    }

    private void mostrarPainelControleCap3() {
        System.out.println("   .--------------------------.");
        System.out.println("  |   [ CÓDIGOS DE ATIVAÇÃO ]  |");
        System.out.println("  |  ------------------------  |");
        System.out.println("  | | [  0 1 0 1 1 0 1 0  ] |  |");
        System.out.println("  | | [  1 1 0 0 1 1 0 1  ] |  |");
        System.out.println("  | | [  0 0 1 1 0 0 1 1  ] |  |");
        System.out.println("  |  ------------------------  |");
        System.out.println("  |  [ ATIVAR ]  [ RESETAR ]   |");
        System.out.println("   '--------------------------'");
    }

    private void mostrarPortalFuturistaCap3() {
        System.out.println("           .  * .");
        System.out.println("         .     |     .");
        System.out.println("       * |       *");
        System.out.println("     .         |         .");
        System.out.println("    ---========|========---");
        System.out.println("     '         |         '");
        System.out.println("       * |       *");
        System.out.println("         .     |     .");
        System.out.println("           .  * .");
    }

    private void mostrarRetornoFuturoCap3() {
        System.out.println("====================================================================");
        System.out.println("     Bem-vindo de volta ao futuro, " + nomeJogador + "!");
        System.out.println("====================================================================");
    }

    private boolean desafioAdaLovelaceCap3() {
        System.out.println("\n====================================================================");
        System.out.println("DESAFIO DE ADA LOVELACE: O ALGORITMO");
        System.out.println("====================================================================");
        System.out.println("Um holograma de Ada Lovelace aparece. Ela diz:");
        System.out.println("\"Para ativar o próximo módulo, você deve compreender o algoritmo de multiplicação simples.");
        System.out.println("Se A=5 e B=3, qual o resultado de A * B ?\"");

        int tentativas = 0;
        while (tentativas < 3) {
            int resposta = lerInteiro("Sua resposta: ");
            tentativas++;

            if (resposta == 15) {
                System.out.println("\"Excelente! Você entendeu a base do processamento!\"");
                if (tentativas == 1) {
                    fragmentoAda1Adquirido = true;
                    System.out.println("\n*Fragmento de Ada Lovelace Desbloqueado (1/3)*");
                }
                return true;
            } else {
                System.out.println("\"Não é a resposta correta. Pense como uma máquina de cálculo.\"\n");
                if (tentativas < 3) {
                    System.out.println("Tentativas restantes: " + (3 - tentativas));
                }
            }
        }
        System.out.println("\nVocê falhou em entender o algoritmo. O módulo não ativou.");
        return false;
    }

    private boolean desafioBinarioFuturoCap3() {
        System.out.println("\n====================================================================");
        System.out.println("DESAFIO BINÁRIO FUTURISTA");
        System.out.println("====================================================================");
        System.out.println("O sistema de navegação da máquina do tempo precisa de um ajuste final.");
        System.out.println("Converta o número binário **10110** para decimal.");

        int tentativas = 0;
        while (tentativas < 3) {
            int resposta = lerInteiro("Sua resposta decimal: ");
            tentativas++;

            // 10110 em binário é: (1*16) + (0*8) + (1*4) + (1*2) + (0*1) = 16 + 0 + 4 + 2 + 0 = 22
            if (resposta == 22) {
                System.out.println("\"Conectado! O ajuste foi um sucesso!\"");
                if (tentativas == 1) {
                    fragmentoAda2Adquirido = true;
                    System.out.println("\n*Fragmento de Ada Lovelace Desbloqueado (2/3)*");
                }
                return true;
            } else {
                System.out.println("\"Não parece ser a conversão correta. Reveja os bits.\"\n");
                if (tentativas < 3) {
                    System.out.println("Tentativas restantes: " + (3 - tentativas));
                }
            }
        }
        System.out.println("\nVocê não conseguiu ajustar a navegação. O retorno está comprometido.");
        return false;
    }

    // Este desafio não estava sendo chamado, mas está aqui caso queira ativá-lo
    private boolean desafioLogicoFuturoCap3() {
        System.out.println("\n====================================================================");
        System.out.println("DESAFIO LÓGICO: SEGURANÇA QUÂNTICA");
        System.out.println("====================================================================");
        System.out.println("Um sistema de segurança quântico tem duas chaves: A e B.");
        System.out.println("Para desbloquear, A deve estar presente OU B deve estar presente, MAS NÃO AMBAS.");
        System.out.println("Qual operação lógica representa isso?");
        System.out.println("1 - A AND B");
        System.out.println("2 - A OR B");
        System.out.println("3 - A XOR B"); // XOR: ou um, ou outro, mas não ambos

        int tentativas = 0;
        while (tentativas < 3) {
            int escolha = lerInteiro("Escolha: ");
            tentativas++;

            if (escolha == 3) {
                System.out.println("\"Acesso concedido! A segurança quântica é sua!\"");
                if (tentativas == 1) {
                    fragmentoAda3Adquirido = true;
                    System.out.println("\n*Fragmento de Ada Lovelace Desbloqueado (3/3)*");
                }
                return true;
            } else {
                System.out.println("\"Combinação incorreta. Pense na exclusividade.\"\n");
                if (tentativas < 3) {
                    System.out.println("Tentativas restantes: " + (3 - tentativas));
                }
            }
        }
        System.out.println("\nFalha na segurança quântica. O caminho está bloqueado.");
        return false;
    }


    private void exibirFragmentosAdaLovelace() {
        System.out.println("\n====================================================================");
        System.out.println("FRAGMENTOS DE ADA LOVELACE COLETADOS:");
        System.out.println("====================================================================");
        if (fragmentoAda1Adquirido) {
            System.out.println("Fragmento 1: Entendimento do Algoritmo.");
            System.out.println("Ada Lovelace, filha do poeta Lord Byron, é considerada a primeira programadora da história. Ela trabalhou com Charles Babbage na Máquina Analítica, percebendo que ela poderia ir além de meros cálculos, criando um algoritmo para a máquina processar números Bernoulli, o que é reconhecido como o primeiro programa de computador.");
        } else {
            System.out.println("Fragmento 1: Não adquirido.");
        }

        System.out.println("---");

        if (fragmentoAda2Adquirido) {
            System.out.println("Fragmento 2: Visão do Potencial da Máquina.");
            System.out.println("Enquanto Babbage focava na máquina como um dispositivo de cálculo, Ada Lovelace enxergou seu potencial para manipular símbolos, criar música e arte, e processar informações de forma mais ampla. Essa visão abstrata e futurista foi crucial para o desenvolvimento da computação teórica.");
        } else {
            System.out.println("Fragmento 2: Não adquirido.");
        }

        System.out.println("---");

        if (fragmentoAda3Adquirido) { // Este fragmento só é adquirido se o desafioLogicoFuturoCap3 for ativado e vencido
            System.out.println("Fragmento 3: O Legado de Ada.");
            System.out.println("Ada Lovelace morreu jovem, aos 36 anos, mas suas notas detalhadas sobre a Máquina Analítica foram redescobertas no século XX e se tornaram fundamentais. Ela é um ícone para as mulheres na ciência e tecnologia, e sua contribuição é celebrada anualmente no Ada Lovelace Day.");
        } else {
            System.out.println("Fragmento 3: Não adquirido (ou desafio correspondente não ativado/vencido).");
        }
        System.out.println("====================================================================");
    }

    private void menuFinalCap3() {
        int opcaoFinal = 0;
        while (opcaoFinal != 2) {
            System.out.println("\n====================================================================");
            System.out.println("CÓDIGOS DO TEMPO - FIM DA JORNADA");
            System.out.println("====================================================================");
            System.out.println("O que você deseja fazer agora, " + nomeJogador + "?");
            System.out.println("1 - INICIAR NOVA JORNADA TEMPORAL (Recomeçar o jogo)");
            System.out.println("2 - SAIR DO JOGO");
            System.out.println("====================================================================");
            opcaoFinal = lerInteiro("Escolha uma opção: ");

            switch (opcaoFinal) {
                case 1:
                    System.out.println("\nReiniciando a jornada do tempo...");
                    iniciarAventuraCompleta(); // Reinicia o jogo inteiro
                    break; // Sai do switch e o loop `while` se mantém ativo até que a aventura completa seja concluída ou o jogador saia.
                case 2:
                    System.out.println("\nObrigado por jogar Códigos do Tempo! Até a próxima aventura!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
            }
            if (opcaoFinal == 1) break; // Se o jogador escolheu reiniciar, sai do loop do menu final para permitir o `iniciarAventuraCompleta` rodar.
        }
    }


    // Métodos de utilidade
    private int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
            } finally {
                // Adicionado um scanner.nextLine() aqui para consumir a nova linha após nextInt()
                // Isso evita problemas com nextLine() subsequentes que poderiam consumir uma linha vazia.
                // No entanto, é melhor adicionar o nextLine() logo após cada nextInt() ou nextBoolean()
                // se você sabe que uma chamada a nextLine() virá em seguida.
                // Para este caso, o scanner.next() já limpa, mas em outras situações é vital.
                // Para o código atual, o nextLine() após lerInteiro em 'escolha' já resolve.
            }
        }
    }

    private boolean lerBooleano() {
        while (true) {
            System.out.print("Digite 'true' ou 'false': ");
            try {
                String input = scanner.next().toLowerCase();
                if (input.equals("true")) {
                    return true;
                } else if (input.equals("false")) {
                    return false;
                } else {
                    System.out.println("Entrada inválida. Por favor, digite 'true' ou 'false'.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite 'true' ou 'false'.");
                scanner.next(); // Limpa o buffer do scanner
            } finally {
                 // Consome o restante da linha após ler o booleano
                 scanner.nextLine();
            }
        }
    }


    private void mostrarComoJogar() {
        System.out.println("\n====================================================================");
        System.out.println("COMO JOGAR CÓDIGOS DO TEMPO");
        System.out.println("====================================================================");
        System.out.println("Bem-vindo, " + nomeJogador + "!");
        System.out.println("Sua missão é viajar no tempo para desvendar os 'Códigos do Tempo' e restaurar fragmentos perdidos da história da computação.");
        System.out.println("Você passará por 3 capítulos, cada um focado em um inventor ou conceito fundamental.");
        System.out.println("\nOBJETIVO:");
        System.out.println("- Em cada capítulo, você enfrentará desafios lógicos e de conhecimento.");
        System.out.println("- Responda corretamente às perguntas para avançar.");
        System.out.println("- Acertar na primeira tentativa em um desafio desbloqueia 'Fragmentos Históricos', que contam a história dos pioneiros da computação.");
        System.out.println("- Se você falhar em um desafio após 3 tentativas, o capítulo será reiniciado, e você terá que tentar novamente para seguir em frente.");
        System.out.println("- Colete o máximo de fragmentos possível para ter uma compreensão completa da jornada.");
        System.out.println("\nBOA SORTE, VIAJANTE DO TEMPO!");
        System.out.println("Pressione ENTER para retornar ao Menu Principal...");
        scanner.nextLine(); // Consome a linha pendente e espera por ENTER
    }

    private void mostrarRegras() {
        System.out.println("\n====================================================================");
        System.out.println("REGRAS DO JOGO");
        System.out.println("====================================================================");
        System.out.println("1. **Escolhas:** Sempre que solicitado, digite o número correspondente à sua escolha e pressione ENTER.");
        System.out.println("2. **Tentativas:** A maioria dos desafios permite 3 tentativas. Se você esgotar as tentativas, o capítulo será reiniciado.");
        System.out.println("3. **Fragmentos Históricos:** Para desbloquear os fragmentos (bônus de história), você deve responder corretamente ao desafio na PRIMEIRA tentativa.");
        System.out.println("4. **Variáveis Lógicas:** Para perguntas com 'true/false', digite 'true' para verdadeiro e 'false' para falso.");
        System.out.println("5. **Progresso:** A conclusão de um capítulo é obrigatória para avançar ao próximo. Se você falhar em um capítulo, precisará reiniciá-lo até ter sucesso.");
        System.out.println("6. **Saída:** Você pode sair do jogo a qualquer momento através do Menu Principal.");
        System.out.println("\nO sucesso depende da sua lógica e atenção aos detalhes!");
        System.out.println("Pressione ENTER para retornar ao Menu Principal...");
        scanner.nextLine(); // Consome a linha pendente e espera por ENTER
    }
}
