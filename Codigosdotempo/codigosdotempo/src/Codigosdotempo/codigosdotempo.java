package codigosdotempo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class codigosdotempo {

    private Scanner scanner;
    private String nomeJogador;

    // Variáveis Capítulo 1 (Babbage)
    private int estrelasCap1;
    private String fragmentoBabbage1 = "Inicio: A Invenção da Máquina de Diferenças\n" +
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
        fragmentosTuringCap2 = 0; // Reinicia fragmentos do capítulo 2

        while (!capituloConcluido) {
            System.out.println("\n╔════════════════════════════╗");
            System.out.println("║ CAPÍTULO 2: O CÓDEX        ║");
            System.out.println("╚════════════════════════════╝\n");

            desenharMaquinaTuring();
            introducaoCap2();
            escolherCaminhoCap2();

            if (!desafio1Cap2()) {
                System.out.println("Você falhou no Desafio 1 do Capítulo 2. O capítulo será reiniciado.");
                fragmentosTuringCap2 = 0;
                continue; // Reinicia o Capítulo 2
            }

            if (!desafio2Cap2()) {
                System.out.println("Você falhou no Desafio 2 do Capítulo 2. O capítulo será reiniciado.");
                fragmentosTuringCap2 = 0;
                continue;
            }

            if (!desafio3Cap2()) {
                System.out.println("Você falhou no Desafio 3 do Capítulo 2. O capítulo será reiniciado.");
                fragmentosTuringCap2 = 0;
                continue;
            }

            conclusaoCap2();
            System.out.println("Parabéns, " + nomeJogador + "! Você concluiu o Capítulo 2 com " + fragmentosTuringCap2 + "/3 fragmentos de Turing!");
            capituloConcluido = true;
        }
        return capituloConcluido;
    }

    private void desenharMaquinaTuring() {
        System.out.println("[ MÁQUINA DO TEMPO ]");
        System.out.println(" [███] ");
        System.out.println(" ┌────────┐ ");
        System.out.println(" ( INVENTOR ) ");
        System.out.println(" ┌──┤ CÁPSULA ├──┐ ");
        System.out.println(" │ └────────┘ │ ");
        System.out.println(" └──────────────┘\n");
    }

    private void introducaoCap2() {
        System.out.println("Você acorda em um bunker militar em 1942. Tudo está em silêncio.");
        System.out.println("Você se lembra da máquina do tempo e do caderno do seu avô.");
        System.out.println("Um grupo de soldados te pede ajuda para decifrar uma mensagem secreta dos inimigos.\n");
    }

    private void escolherCaminhoCap2() {
        System.out.println("Você vê uma porta e uma fresta escura ao lado.");
        System.out.println("1 - Entrar pela porta");
        System.out.println("2 - Passar pela fresta");
        int escolha = lerInteiro("Escolha (1 ou 2): ");

        if (escolha == 2) {
            System.out.println("Você avança mais rapidamente pela fresta.\n");
        } else {
            System.out.println("A porta leva a um corredor com armadilhas. Você demora mais tempo.\n");
        }
    }

    private boolean desafio1Cap2() {
        System.out.println("\n--- Desafio 1: Configuração dos Canais de Rádio ---");
        System.out.println("Em determinado momento acompanhando pelos Aliados, uma mensagem codificada foi interceptada. Para decifrá-la, você precisa configurar os canais de rádio corretamente com base nas seguintes condições lógicas:");
        System.out.println("Antena de Alta Frequência (A) deve estar ativada E Filtro de Ruído (B) deve estar ativado OU Canal de Comunicação C deve estar desligado.");
        System.out.println("Lembre-se: Condição de sucesso é (A E B) OU (NÃO C)");

        final int MAX_ATTEMPTS = 3;
        for (int i = 1; i <= MAX_ATTEMPTS; i++) {
            System.out.println("\nTentativa " + i + "/" + MAX_ATTEMPTS + ":");
            boolean a = lerBooleano("Antena A ativada? (true/false): ");
            boolean b = lerBooleano("Filtro B ativado? (true/false): ");
            boolean cLigado = lerBooleano("Canal C LIGADO? (true/false): "); // Pergunta se C está LIGADO
            boolean cDesligado = !cLigado; // Inverte para obter se C está DESLIGADO

            // Condição para sucesso: (A AND B) OR (NOT C_LIGADO) que é (A AND B) OR C_DESLIGADO
            if ((a && b) || cDesligado) {
                System.out.println("\nMensagem decodificada com sucesso!");
                System.out.println("Os Aliados obtiveram informações valiosas!\n");
                if (i == 1) { // Ganha fragmento apenas na primeira tentativa
                    fragmentosTuringCap2++;
                    System.out.println("** Fragmento de Turing desbloqueado! * ");
                    System.out.println(fragmentosTuringCap2 + "/3 fragmentos\n" + conteudoFragmentoTuring1 + "\n");
                } else {
                     System.out.println("Você passou no desafio, mas não ganhou o fragmento por não acertar de primeira.\n");
                }
                return true;
            } else {
                System.out.println("Falha na configuração. A mensagem continua codificada.");
                 if (i < MAX_ATTEMPTS) {
                    System.out.println("Tente novamente.");
                }
            }
        }
        System.out.println("Você esgotou suas tentativas para o Desafio 1. A mensagem permanece codificada.");
        return false;
    }

    private boolean desafio2Cap2() {
        // Placeholder - Simula um desafio que o jogador sempre passa para fins de fluxo
        System.out.println("\n--- Iniciando Desafio 2: Quebra-Cabeça Lógico de Turing ---");
        System.out.println("Turing apresenta um novo quebra-cabeça envolvendo sequências e padrões.");
        System.out.println("Após alguma deliberação, você encontra a solução!");
        // Simula que o jogador acertou de primeira para obter o fragmento
        fragmentosTuringCap2++;
        System.out.println("** Fragmento de Turing desbloqueado! * ");
        System.out.println(fragmentosTuringCap2 + "/3 fragmentos\n" + conteudoFragmentoTuring2 + "\n");
        return true;
    }

    private boolean desafio3Cap2() {
        // Placeholder - Simula um desafio que o jogador sempre passa para fins de fluxo
        System.out.println("\n--- Iniciando Desafio 3: A Máquina Enigma ---");
        System.out.println("O último desafio de Turing envolve a lógica por trás da decodificação da Enigma.");
        System.out.println("Com sua ajuda, uma configuração crucial é descoberta!");
        // Simula que o jogador acertou de primeira para obter o fragmento
        fragmentosTuringCap2++;
        System.out.println("** Fragmento de Turing desbloqueado! * ");
        System.out.println(fragmentosTuringCap2 + "/3 fragmentos\n" + conteudoFragmentoTuring3 + "\n");
        return true;
    }

    private void conclusaoCap2() {
        System.out.println("\nCom as mensagens decifradas, os Aliados planejam um contra-ataque decisivo.");
        System.out.println("Sua contribuição foi inestimável para o esforço de guerra.");
        System.out.println("Você sente que cumpriu sua missão neste tempo.\n");
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
        menuFinalCap3(); // Este menu tem opções de reiniciar o JOGO TODO ou SAIR.
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
        System.out.println("     | |  |_____|     | || | |____||____| | |");
        System.out.println("     | |              | || |              | |");
        System.out.println("     | '--------------' || '--------------' |");
        System.out.println("      '----------------'  '----------------' ");
    }

    private void mostrarRoboCap3() {
        System.out.println("        [¬º-°]¬");
        System.out.println("       /|_|\\");
        System.out.println("       /|\\");
        System.out.println("     //    \\\\");
        System.out.println("    (|      |)");
        System.out.println("     \\_  _/");
        System.out.println("        | | |");
        System.out.println("       |||");
        System.out.println("      /| |\\");
    }

    private void mostrarMaquinaTempoDetalhadaCap3() {
        System.out.println("     _____");
        System.out.println("     | ___   |");
        System.out.println("     | |       |   |");
        System.out.println("     | | TIME  |  |");
        System.out.println("     | | TRAVEL|   |");
        System.out.println("     | |___|   |");
        System.out.println("     | ___   |");
        System.out.println("     | | __ |   |");
        System.out.println("     | | |    ||  |");
        System.out.println("     | | |__||   |");
        System.out.println("     | |___|   |");
        System.out.println("    |_____|");
        System.out.println("     || ||  || ||");
        System.out.println("     || ||  || ||");
        System.out.println("   (_)    (_)");
    }

    private void mostrarPainelControleCap3() {
        System.out.println(" __________");
        System.out.println(" | [|||]   [|||]   [|||] |");
        System.out.println(" | [|||]   [|||]   [|||] |");
        System.out.println(" | ----------------------  |");
        System.out.println(" | |  [====]   [----] |   |");
        System.out.println(" | |  [====]   [----] |   |");
        System.out.println(" | ----------------------  |");
        System.out.println(" | |    ____          |");
        System.out.println(" | |  |  ON  |  OFF     |");
        System.out.println(" | |  |__|          |");
        System.out.println(" |_________|");
    }

    private void mostrarPortalFuturistaCap3() {
        System.out.println("       .-------.");
        System.out.println("      /         \\");
        System.out.println("     /  .---.   \\");
        System.out.println("    |  /     \\  |");
        System.out.println("     | |  0 0 |  |");
        System.out.println("     | |    ^ |   |");
        System.out.println("    |  \\ '-' /   |");
        System.out.println("     \\  '---'   /");
        System.out.println("      \\___ /");
        System.out.println("       |     |");
        System.out.println("       |     |");
        System.out.println("       |     |");
        System.out.println("      /         \\");
        System.out.println("     /___\\");
    }
    
    private void mostrarComputadorBinarioCap3() {
        System.out.println("       ________");
        System.out.println("     |                    |");
        System.out.println("     |  >_ BINÁRIO...    |");
        System.out.println("     |________|");
        System.out.println("       ||          ||");
        System.out.println("       ||          ||");
        System.out.println("     _||_        _||_");
        System.out.println("    |      |      |     |");
        System.out.println("    |__|      |__|");
    }

    private void mostrarEngrenagensLogicaCap3() {
        System.out.println("         o O @ @ O o");
        System.out.println("        /|\\ /|\\ /|\\ /|\\");
        System.out.println("        ( | ) ( | ) ( | )");
        System.out.println("        \\|/ \\|/ \\|/ \\|/");
        System.out.println("       DECISÃO LÓGICA EM PROCESSAMENTO...");
    }

    private void mostrarRetornoFuturoCap3() {
        System.out.println("       ___");
        System.out.println("     /      \\\\");
        System.out.println("   |  O  O |");
        System.out.println("   |    __    | <-- Máquina do Tempo Ativa");
        System.out.println("     \\__//");
        System.out.println("     /|__|\\\\");
        System.out.println("   (____)");
        System.out.println(" ~~~~~");
    }

    private boolean desafioAdaLovelaceCap3() {
        System.out.println("====================================================================");
        System.out.println(" DESAFIO: A MENTE POR TRÁS DA MÁQUINA (ADA LOVELACE)");
        System.out.println("====================================================================");

        // Desafio 1: Fragmento 1
        System.out.println("\nUm holograma da Máquina Analítica de Babbage aparece. Uma voz robótica pergunta:");
        System.out.println("Qual era a visão mais abrangente de Ada Lovelace sobre o potencial da Máquina Analítica, indo além de simples cálculos?");
        System.out.println("1 - A máquina poderia apenas somar e subtrair números muito grandes.");
        System.out.println("2 - A máquina poderia manipular qualquer tipo de símbolo, criando música e gráficos.");
        System.out.println("3 - A máquina era apenas um brinquedo caro para matemáticos.");
        
        int tentativas1 = 0;
        boolean acertou1 = false;
        while (tentativas1 < 3 && !acertou1) {
            int resposta = lerInteiro("Sua resposta: ");
            tentativas1++;
            if (resposta == 2) {
                acertou1 = true;
                System.out.println("CORRETO! Ada previu o potencial da máquina para manipular símbolos.");
                if (tentativas1 == 1) {
                    fragmentoAda1Adquirido = true;
                    System.out.println("Você acertou de primeira e ganhou o Fragmento 1: A Visão Pioneira!");
                } else {
                    System.out.println("Você acertou, mas não ganhou o fragmento por não ter sido de primeira.");
                }
            } else {
                System.out.println("Resposta incorreta.");
                if (tentativas1 < 3) System.out.println("Tente novamente. Tentativa " + (tentativas1 + 1) + " de 3.");
            }
        }
        if (!acertou1) {
            System.out.println("Você não conseguiu desvendar o enigma do Fragmento 1.");
            return false; // Falhou no desafio de Ada
        }

        // Desafio 2: Fragmento 2
        System.out.println("\n--- Próximo Desafio de Ada ---");
        System.out.println("Ada Lovelace chamou a manipulação de símbolos pela Máquina Analítica de 'ciência das operações'. Como conhecemos isso hoje?");
        System.out.println("1 - Criptografia");
        System.out.println("2 - Robótica");
        System.out.println("3 - Programação");

        int tentativas2 = 0;
        boolean acertou2 = false;
        while (tentativas2 < 3 && !acertou2) {
            int resposta = lerInteiro("Sua resposta: ");
            tentativas2++;
            if (resposta == 3) {
                acertou2 = true;
                System.out.println("EXATO! Essa é a base da programação moderna.");
                if (tentativas2 == 1) {
                    fragmentoAda2Adquirido = true;
                    System.out.println("Você acertou de primeira e ganhou o Fragmento 2: A Colaboração com Babbage!");
                } else {
                    System.out.println("Você acertou, mas não ganhou o fragmento por não ter sido de primeira.");
                }
            } else {
                System.out.println("Resposta incorreta.");
                 if (tentativas2 < 3) System.out.println("Tente novamente. Tentativa " + (tentativas2 + 1) + " de 3.");
            }
        }
        if (!acertou2) {
            System.out.println("Você não conseguiu desvendar o enigma do Fragmento 2.");
            return false;
        }

        // Desafio 3: Fragmento 3
        System.out.println("\n--- Último Desafio de Ada ---");
        System.out.println("Em qual famoso trabalho Ada Lovelace publicou seu método detalhado para a Máquina Analítica calcular números de Bernoulli, considerado o primeiro algoritmo?");
        System.out.println("1 - Um diário pessoal.");
        System.out.println("2 - Suas notas sobre a tradução de um artigo de Charles Babbage.");
        System.out.println("3 - Um livro de poesia dedicado ao pai.");

        int tentativas3 = 0;
        boolean acertou3 = false;
        while (tentativas3 < 3 && !acertou3) {
            int resposta = lerInteiro("Sua resposta: ");
            tentativas3++;
            if (resposta == 2) {
                acertou3 = true;
                System.out.println("ACERTOU! As notas de Ada são um marco na história da computação.");
                if (tentativas3 == 1) {
                    fragmentoAda3Adquirido = true;
                    System.out.println("Você acertou de primeira e ganhou o Fragmento 3: Os Primeiros Algoritmos!");
                } else {
                    System.out.println("Você acertou, mas não ganhou o fragmento por não ter sido de primeira.");
                }
            } else {
                System.out.println("Resposta incorreta.");
                if (tentativas3 < 3) System.out.println("Tente novamente. Tentativa " + (tentativas3 + 1) + " de 3.");
            }
        }
        if (!acertou3) {
            System.out.println("Você não conseguiu desvendar o enigma do Fragmento 3.");
            return false;
        }
        return true; // Passou todos os desafios de Ada
    }

    private boolean desafioBinarioFuturoCap3() {
        mostrarComputadorBinarioCap3();
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("====================================================================");
        System.out.println(" DESAFIO BINÁRIO DO FUTURO");
        System.out.println("====================================================================");
        System.out.println("Um holograma mostra o número 42 e pergunta: Qual sua forma binária?");
        System.out.println("1 - 101010");
        System.out.println("2 - 110101");
        System.out.println("3 - 100110");

        while (tentativas < 3 && !acertou) {
            int resposta = lerInteiro("R: ");
            tentativas++;
            if (resposta == 1) {
                acertou = true;
                System.out.println("\"Exato! 42 em binário é 101010.\"");
                calcularEstrelasCap3(tentativas);
            } else {
                System.out.println("\"Resposta incorreta.\"");
                if (tentativas < 3) System.out.println("Tente novamente. Tentativa " + (tentativas + 1) + " de 3");
            }
        }
        return acertou;
    }

    // Este desafio não estava sendo chamado no fluxo original do Capitulo3.java main
    // Mas está aqui caso queira integrá-lo.
    private boolean desafioLogicoFuturoCap3() {
        mostrarEngrenagensLogicaCap3();
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("====================================================================");
        System.out.println(" DESAFIO LÓGICO FUTURISTA");
        System.out.println("====================================================================");
        System.out.println("Você precisa ativar o protocolo final:");
        System.out.println("Condição: O sistema A está online, e o sistema B está offline.");
        System.out.println("Qual expressão representa isso?");
        System.out.println("1 - A AND B");
        System.out.println("2 - A AND NOT B");
        System.out.println("3 - NOT A AND NOT B");
        
        while (tentativas < 3 && !acertou) {
            int resposta = lerInteiro("R: ");
            tentativas++;
            if (resposta == 2) {
                acertou = true;
                System.out.println("\"Perfeito! Essa é a condição correta.\"");
                calcularEstrelasCap3(tentativas);
            } else {
                System.out.println("\"Hmm... não é isso ainda.\"");
                 if (tentativas < 3) System.out.println("Tente novamente. Tentativa " + (tentativas + 1) + " de 3");
            }
        }
        return acertou;
    }
    
    private void exibirFragmentosAdaLovelace() {
        System.out.println("\n--- Fragmentos de Conhecimento Adquiridos (Ada Lovelace) ---");
        if (fragmentoAda1Adquirido) {
            System.out.println("FRAGMENTO 1 (Ada Lovelace - Visão Pioneira):");
            System.out.println("   " + "Em um mundo dominado pela matemática e pela invenção a vapor, surge Ada Lovelace, filha do poeta Lord Byron. Desde cedo, ela demonstra um intelecto afiado, especialmente em lógica e números. Sua mãe, Anne Isabella Milbanke, uma matemática notável, a incentiva a seguir um caminho de estudos rigorosos, longe da inclinação poética do pai. Ada se aprofunda nos estudos da matemática, uma disciplina pouco comum para mulheres de sua época, e desenvolve uma visão singular sobre o potencial das máquinas, que vai muito além dos simples cálculos.");
        }
        if (fragmentoAda2Adquirido) {
            System.out.println("FRAGMENTO 2 (Ada Lovelace - Colaboração com Babbage):");
            System.out.println("   " + "O destino de Ada se cruza com o do visionário Charles Babbage, criador da Máquina Analítica. Enquanto muitos viam a máquina como um mero calculador mecânico, Ada percebeu seu verdadeiro poder. Ela enxergou que a Máquina Analítica poderia manipular não apenas números, mas qualquer tipo de símbolo, abrindo portas para a criação de música, gráficos e muito mais. Ela chamou essa manipulação de 'ciência das operações', um conceito que hoje conhecemos como programação.");
        }
        if (fragmentoAda3Adquirido) {
            System.out.println("FRAGMENTO 3 (Ada Lovelace - Os Primeiros Algoritmos):");
            System.out.println("   " + "Foi em suas notas sobre a tradução de um artigo de Babbage que Ada Lovelace deixou seu maior legado. Ela não apenas traduziu o artigo, mas o expandiu com suas próprias ideias, incluindo um método detalhado para a Máquina Analítica calcular números de Bernoulli. Este é amplamente considerado o primeiro algoritmo especificamente destinado a ser executado por uma máquina, tornando-a a precursora da programação de computadores. Sua mente brilhou ao prever um futuro onde máquinas poderiam criar arte e ciência, muito antes da própria tecnologia existir.");
        }
        if (!fragmentoAda1Adquirido && !fragmentoAda2Adquirido && !fragmentoAda3Adquirido) {
            System.out.println("Você não adquiriu nenhum fragmento sobre Ada Lovelace neste capítulo. Continue tentando!");
        }
        System.out.println("----------------------------------------------");
    }

    private void calcularEstrelasCap3(int tentativas) {
        System.out.print("Você ganhou: ");
        switch (tentativas) {
            case 1: System.out.println("⭐⭐⭐ - Excelente! De primeira!"); break;
            case 2: System.out.println("⭐⭐ - Muito bom! Quase perfeito."); break;
            case 3: System.out.println("⭐ - Conseguiu! Mas foi por pouco..."); break;
            default: System.out.println("Sem estrelas.");
        }
    }

    private void menuFinalCap3() {
        System.out.println("====================================================================");
        System.out.println(" MENU FINAL");
        System.out.println("====================================================================");
        System.out.println("1 - Reiniciar o Jogo Completo");
        System.out.println("2 - Sair do Jogo");
        
        int escolha = lerInteiro("Escolha uma opção: ");
        switch (escolha) {
            case 1:
                System.out.println("Reiniciando o jogo...\n\n");
                // Para reiniciar o jogo completo, o controle voltará ao loop do menu principal
                // em iniciarAventuraCompleta(), onde as variáveis de capítulo serão resetadas.
                // Não precisamos chamar iniciarAventuraCompleta() daqui, pois o fluxo natural
                // do loop while em iniciarAventuraCompleta() fará o menu aparecer novamente.
                break;
            case 2:
                System.out.println("Saindo do jogo. Até mais, " + nomeJogador + "!");
                System.exit(0); // Encerra o programa
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                menuFinalCap3();
                break;
        }
    }

    // --- MÉTODOS UTILITÁRIOS GERAIS ---
    private int lerInteiro(String prompt) {
        int valor = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(prompt);
            try {
                valor = scanner.nextInt();
                scanner.nextLine(); // Consumir nova linha
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpar buffer
            }
        }
        return valor;
    }
    
    private boolean lerBooleano(String prompt) {
        boolean valor = false;
        boolean valido = false;
        while(!valido) {
            System.out.print(prompt);
            String entrada = scanner.nextLine().trim().toLowerCase();
            if (entrada.equals("true")) {
                valor = true;
                valido = true;
            } else if (entrada.equals("false")) {
                valor = false;
                valido = true;
            } else {
                System.out.println("Entrada inválida. Por favor, digite 'true' ou 'false'.");
            }
        }
        return valor;
    }

    private void mostrarComoJogar() {
        System.out.println("\n---");
        System.out.println("### COMO JOGAR");
        System.out.println("Neste jogo, você viajará no tempo para diferentes épocas e encontrará figuras históricas importantes para a computação. Cada encontro apresentará desafios lógicos e de raciocínio.");
        System.out.println("Sua tarefa é *escolher a opção correta* que resolva o problema apresentado, utilizando seus conhecimentos de lógica e computação.");
        System.out.println("Suas escolhas são feitas digitando o número correspondente à opção desejada e pressionando ENTER.");
        System.out.println("Pressione ENTER para voltar.");
        scanner.nextLine();
    }

    private void mostrarRegras() {
        System.out.println("\n---");
        System.out.println("### REGRAS DO JOGO");
        System.out.println("1. *Objetivo*: Acumular o máximo de estrelas/fragmentos resolvendo os desafios propostos.");
        System.out.println("2. *Fragmentos Históricos/Estrelas: Você ganhará um fragmento histórico valioso ou estrelas **somente se acertar o desafio na primeira tentativa* (na maioria dos casos, verifique as instruções de cada desafio).");
        System.out.println("3. *Tentativas: Você terá até **3 tentativas* para acertar cada desafio. Se esgotar as tentativas em um desafio, geralmente você *retornará ao início do capítulo atual* para tentar novamente.");
        System.out.println("4. *Pontuação*: A pontuação é específica de cada capítulo. O progresso será exibido.");
        System.out.println("5. *Navegação*: Use os números para selecionar as opções nos menus e pressione ENTER para confirmar ou avançar.");
        System.out.println("Pressione ENTER para voltar.");
        scanner.nextLine();
    }
}
