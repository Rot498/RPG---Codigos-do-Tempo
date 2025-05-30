package src;

import java.util.Scanner;

public class Capitulo3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome de Usuario: ");
        String nomeJogador = input.nextLine();

        mostrarPainelFuturista();
        System.out.println("====================================================================");
        System.out.println(" CAPÍTULO 3: DE VOLTA PARA 2025");
        System.out.println("====================================================================");
        System.out.println("Você chega a um laboratório altamente tecnológico, repleto de luzes LED e hologramas.");
        System.out.println("Um painel digital exibe: \"PARA RETORNAR, RESOLVA OS CÓDIGOS DO FUTURO\"");
        System.out.println();

        System.out.println("Enquanto observa, um robô aparece:");
        mostrarRobo();

        System.out.println("\nPressione ENTER para continuar...");
        input.nextLine();

        System.out.println("A Máquina do Tempo está ativando:");
        mostrarMaquinaTempoDetalhada();

        System.out.println("\nPressione ENTER para iniciar os desafios finais...");
        input.nextLine();

        desafioBinarioFuturo(input);

        System.out.println("\nVocê acessa o painel de controle:");
        mostrarPainelControle();

        System.out.println("\nPressione ENTER para continuar...");
        input.nextLine();

        desafioLogicoFuturo(input);

        System.out.println("\nUm portal futurista se abre para seu retorno:");
        mostrarPortalFuturista();

        mostrarRetornoFuturo();

        System.out.println("====================================================================");
        System.out.println(" PARABÉNS, " + nomeJogador + "! VOCÊ RETORNOU PARA O ANO DE 2025!");
        System.out.println("====================================================================");
        System.out.println("Você viajou por momentos marcantes da história da tecnologia.");
        System.out.println("Agora está de volta ao ano de 2025 com muito mais conhecimento.");
        
        menuFinal();
    }

    // === DESENHOS ASCII ===
    private static void mostrarPainelFuturista() {
        System.out.println("      .----------------.  .----------------. ");
        System.out.println("     | .--------------. || .--------------. |");
        System.out.println("     | |   ______     | || |  ____  ____  | |");
        System.out.println("     | |  |_   __ \\   | || | |_  _||_  _| | |");
        System.out.println("     | |    | |__) |  | || |   \\ \\  / /   | |");
        System.out.println("     | |    |  ___/   | || |    > `' <    | |");
        System.out.println("     | |   _| |_      | || |  _/ /'`\\ \\_  | |");
        System.out.println("     | |  |_____|     | || | |____||____| | |");
        System.out.println("     | |              | || |              | |");
        System.out.println("     | '--------------' || '--------------' |");
        System.out.println("      '----------------'  '----------------' ");
    }

    private static void mostrarRobo() {
        System.out.println("       [¬º-°]¬");
        System.out.println("       /|_|\\");
        System.out.println("       /_|_\\");
        System.out.println("      //   \\\\");
        System.out.println("     (|     |)");
        System.out.println("      \\_   _/");
        System.out.println("       | | |");
        System.out.println("       |_|_|");
        System.out.println("      /_| |_\\");
    }

    private static void mostrarMaquinaTempoDetalhada() {
        System.out.println("      _____________");
        System.out.println("     |  _______    |");
        System.out.println("     | |       |   |");
        System.out.println("     | | TIME  |   |");
        System.out.println("     | | TRAVEL|   |");
        System.out.println("     | |_______|   |");
        System.out.println("     |  _______    |");
        System.out.println("     | |  ____ |   |");
        System.out.println("     | | |    ||   |");
        System.out.println("     | | |____||   |");
        System.out.println("     | |_______|   |");
        System.out.println("     |_____________|");
        System.out.println("     || ||  || ||");
        System.out.println("     || ||  || ||");
        System.out.println("    (__)    (__)");
    }

    private static void mostrarPainelControle() {
        System.out.println("  __________________________");
        System.out.println(" |  [|||]   [|||]   [|||]   |");
        System.out.println(" |  [|||]   [|||]   [|||]   |");
        System.out.println(" |  ----------------------  |");
        System.out.println(" |  |  [====]   [----]  |   |");
        System.out.println(" |  |  [====]   [----]  |   |");
        System.out.println(" |  ----------------------  |");
        System.out.println(" |  |   ________           |");
        System.out.println(" |  |  |  ON  |  OFF       |");
        System.out.println(" |  |  |______|            |");
        System.out.println(" |_________________________|");
    }

    private static void mostrarPortalFuturista() {
        System.out.println("        .-------.");
        System.out.println("       /         \\");
        System.out.println("      /  .---.    \\");
        System.out.println("     |  /     \\   |");
        System.out.println("     | |  0 0 |   |");
        System.out.println("     | |   ^  |   |");
        System.out.println("     |  \\ '-' /   |");
        System.out.println("      \\  '---'   /");
        System.out.println("       \\_______ /");
        System.out.println("        |     |");
        System.out.println("        |     |");
        System.out.println("        |     |");
        System.out.println("       /       \\");
        System.out.println("      /_________\\");
    }

    private static void mostrarComputadorBinario() {
        System.out.println("       ____________________");
        System.out.println("      |                    |");
        System.out.println("      |   >_ BINÁRIO...    |");
        System.out.println("      |____________________|");
        System.out.println("         ||            ||");
        System.out.println("         ||            ||");
        System.out.println("      __||__        __||__");
        System.out.println("     |     |       |     |");
        System.out.println("     |_____|       |_____|");
    }

    private static void mostrarEngrenagensLogica() {
        System.out.println("         o O @ @ O o");
        System.out.println("        /|\\ /|\\ /|\\ /|\\");
        System.out.println("       ( | ) ( | ) ( | )");
        System.out.println("        \\|/ \\|/ \\|/ \\|/");
        System.out.println("       DECISÃO LÓGICA EM PROCESSAMENTO...");
    }

    private static void mostrarRetornoFuturo() {
        System.out.println("       _____");
        System.out.println("     /      \\\\");
        System.out.println("    |  O  O  |");
        System.out.println("    |   __   |  <-- Máquina do Tempo Ativa");
        System.out.println("     \\______//");
        System.out.println("     /|____|\\\\");
        System.out.println("    (________)");
        System.out.println("  ~~~~~~~~~~~~~~~~");
    }

    // === DESAFIOS ===

    private static void desafioBinarioFuturo(Scanner scanner) {
        mostrarComputadorBinario();
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("====================================================================");
        System.out.println(" DESAFIO BINÁRIO DO FUTURO");
        System.out.println("====================================================================");
        System.out.println("Um holograma mostra o número 42 e pergunta: Qual sua forma binária?");
        System.out.println("1 - 101010");
        System.out.println("2 - 110101");
        System.out.println("3 - 100110");
        System.out.print("R:");

        while (tentativas < 3 && !acertou) {
            int resposta = scanner.nextInt();
            scanner.nextLine();
            tentativas++;

            if (resposta == 1) {
                acertou = true;
                System.out.println("\"Exato! 42 em binário é 101010.\"");
                calcularEstrelas(tentativas);
            } else {
                System.out.println("\"Resposta incorreta, tente novamente.\"");
                if (tentativas < 3) {
                    System.out.println("Tentativa " + (tentativas + 1) + " de 3");
                }
            }
        }

        if (!acertou) {
            reiniciarCapitulo();
        }
    }

    private static void desafioLogicoFuturo(Scanner scanner) {
        mostrarEngrenagensLogica();
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
        System.out.print("R:");

        while (tentativas < 3 && !acertou) {
            int resposta = scanner.nextInt();
            scanner.nextLine();
            tentativas++;

            if (resposta == 2) {
                acertou = true;
                System.out.println("\"Perfeito! Essa é a condição correta.\"");
                calcularEstrelas(tentativas);
            } else {
                System.out.println("\"Hmm... não é isso ainda. Tente novamente.\"");
                if (tentativas < 3) {
                    System.out.println("Tentativa " + (tentativas + 1) + " de 3");
                }
            }
        }

        if (!acertou) {
            reiniciarCapitulo();
        }
    }

    // === FUNÇÕES AUXILIARES ===

    private static void calcularEstrelas(int tentativas) {
        System.out.print("Você ganhou: ");
        switch (tentativas) {
            case 1:
                System.out.println("⭐⭐⭐ - Excelente! De primeira!");
                break;
            case 2:
                System.out.println("⭐⭐ - Muito bom! Quase perfeito.");
                break;
            case 3:
                System.out.println("⭐ - Conseguiu! Mas foi por pouco...");
                break;
            default:
                System.out.println("Sem estrelas.");
        }
    }

    private static void reiniciarCapitulo() {
        System.out.println("====================================================================");
        System.out.println("Você falhou em resolver o desafio...");
        System.out.println("O painel reinicia. Tente novamente desde o começo!");
        System.out.println("====================================================================");
        System.exit(0);  // Encerra o programa. Pode ajustar se quiser reiniciar.
    }
    private static void menuFinal() {
        Scanner input = new Scanner(System.in);
        System.out.println("====================================================================");
        System.out.println(" MENU FINAL");
        System.out.println("====================================================================");
        System.out.println("1 - Reiniciar o Jogo");
        System.out.println("2 - Sair do Jogo");
        System.out.print("Escolha uma opção: ");

        int escolha = input.nextInt();
        input.nextLine();  // Limpa buffer

        switch (escolha) {
            case 1:
                System.out.println("Reiniciando o jogo...\n\n");
                main(null);  // Reinicia o jogo
                break;
            case 2:
                System.out.println("Saindo do jogo. Até mais!");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                menuFinal();  // Mostra o menu novamente
                break;
        }
    }
}
