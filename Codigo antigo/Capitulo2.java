package src;
import java.util.Scanner;

public class Capitulo2 {

int fragmentosTuring = 0;

String conteudoFragmento1 = "Alan Mathison Turing nasceu em 23 de junho de 1912, em Londres. Desde cedo demonstrou grande talento em matemática e lógica, apesar de ser considerado excêntrico por professores e colegas. Estudou no Kings College, na Universidade de Cambridge, onde se destacou por seu trabalho em matemática pura. Em 1936, Turing publicou o artigo On Computable Numbers, no qual propôs o conceito de uma máquina abstrata — hoje conhecida como Máquina de Turing. Essa ideia formou a base da computação moderna, ao definir matematicamente o que significa “calcular.";

String conteudoFragmento2 = "Com o início da Segunda Guerra Mundial, Turing foi recrutado para trabalhar em Bletchley Park, o centro de inteligência britânico. Lá, liderou a equipe responsável por quebrar o código da máquina Enigma, usada pelos nazistas para criptografar mensagens militares. Turing projetou uma máquina eletromecânica chamada Bombe, que acelerava a decodificação das mensagens criptografadas. Seu trabalho foi fundamental para o sucesso dos Aliados e estima-se que tenha encurtado a guerra em pelo menos dois anos, salvando milhões de vidas.";

String conteudoFragmento3 = "Após a guerra, Turing continuou seus estudos, contribuindo para o desenvolvimento da inteligência artificial e da biologia matemática. No entanto, em 1952, foi condenado por ser homossexual — considerado crime no Reino Unido na época. Como punição, foi submetido à castração química. Em 1954, foi encontrado morto, envenenado com cianeto, em um suposto suicídio. Tinha apenas 41 anos. Décadas depois, Turing foi reconhecido por sua genialidade e injustiça sofrida. Em 2009, o governo britânico pediu desculpas oficialmente e, em 2013, ele recebeu o perdão real.";

String jogador;

Scanner input = new Scanner(System.in);



public static void main(String[] args) {

Capitulo2 capitulo = new Capitulo2();

capitulo.iniciarCapitulo();

}


public void iniciarCapitulo() {

System.out.println("Escolha o um jogador:");

jogador = input.nextLine();


System.out.println("╔════════════════════════════╗");

System.out.println("║ CAPÍTULO 2: O CÓDEX ║");

System.out.println("╚════════════════════════════╝\n");


desenharMaquina();

introducao();

escolherCaminho();

conclusao();


if (!desafio1()) voltarInicio();

if (!desafio2()) voltarInicio();

if (!desafio3()) voltarInicio();


System.out.println("Parabéns, " + jogador + "! Você concluiu todos os desafios com " + fragmentosTuring + "/3 fragmentos de Turing!");

}


private void desenharMaquina() {

System.out.println("[ MÁQUINA DO TEMPO ]");

System.out.println(" [███] ");

System.out.println(" ┌────────┐ ");

System.out.println(" ( INVENTOR ) ");

System.out.println(" ┌──┤ CÁPSULA ├──┐ ");

System.out.println(" │ └────────┘ │ ");

System.out.println(" └──────────────┘\n");

}


private void introducao() {

System.out.println("Você acorda em um bunker militar em 1942. Tudo está em silêncio.");

System.out.println("Você se lembra da máquina do tempo e do caderno do seu avô.");

System.out.println("Um grupo de soldados te pede ajuda para decifrar uma mensagem secreta dos inimigos.\n");

}


private void escolherCaminho() {

System.out.println("Você vê uma porta e uma fresta escura ao lado.");

System.out.println("1 - Entrar pela porta");

System.out.println("2 - Passar pela fresta");

int escolha = input.nextInt();

if (escolha == 2) {

System.out.println("Você avança mais rapidamente pela fresta.\n");

} else {

System.out.println("A porta leva a um corredor com armadilhas. Você demora mais tempo.\n");

}

}


private boolean desafio1() {

System.out.println("Em determinado momento acompanhando pelos Aliados, uma mensagem codificada foi interceptada. Para decifrá-la, você precisa configurar os canais de rádio corretamente com base nas seguintes condições lógicas:");

System.out.println("Antena de Alta Frequência (A) deve estar ativada e Filtro de Ruído (B) deve estar ativado ou Canal de Comunicação C deve estar desligado ");


for (int i = 1; i <= 3; i++) {

System.out.print("Gerador A ligado? (true/false): ");

boolean a = input.nextBoolean();

System.out.print("Gerador B ligado? (true/false): ");

boolean b = input.nextBoolean();

System.out.print("Alarme C desligado? (true/false): ");

boolean c = input.nextBoolean();


if (((a && b) || !c) && (i == 1)) {

System.out.println("\n Mensagem decodificada com sucesso!");

System.out.println(" Os Aliados obtiveram informações valiosas!\n");

System.out.println("\n **** Fragmento de Turing desbloqueado! *** \n" + fragmentosTuring + "/3\n" + conteudoFragmento1 + "\n" );

return true;}

else if ((((a && b) || !c) && (i >= 2))){

System.out.println("\n Mensagem decodificada com sucesso!");

System.out.println(" Os Aliados obtiveram informações valiosas!\n");

return true;}

else if (i>=4){

}

else {

System.out.println(" Falha na configuração. A mensagem continua codificada.\n");

}


}

return false;

}


private boolean desafio2() {

System.out.println("Ao fim de incansáveis horas de caminhada, encontraram o bunker secreto dos Aliados. Porém, os aviões do eixo estão se aproximando e vão descobrir o bunker. O sistema depende de dois radares, mas para evitar falhas e interferências, apenas um dos radares pode estar ativo por vez. ");

for (int i = 1; i <= 3; i++) {

System.out.println("Tentativa " + i + " de 3:");


System.out.print("Radar 1 está ligado? (true/false): ");

boolean radar1 = input.nextBoolean();


System.out.print("Radar 2 está ligado? (true/false): ");

boolean radar2 = input.nextBoolean();


boolean sistemaAtivado = radar1 ^ radar2;


if ((sistemaAtivado) && (i == 1)) {

System.out.println("\n Sistema de Defesa Ativado com Sucesso!");

System.out.println(" Os céus estão protegidos!\n");

System.out.println("\n **** Fragmento de Turing desbloqueado! *** \n" + fragmentosTuring + "/3\n" + conteudoFragmento2 + "\n" );

return true;}

else if ((sistemaAtivado) && (i >= 2)){

System.out.println("\n Sistema de Defesa Ativado com Sucesso!");

System.out.println(" Os céus estão protegidos!\n");

return true;}

else {

System.out.println(" Falha: ou nenhum radar, ou ambos estão ligados. Tente novamente.\n");

}

}

return false;

}


private boolean desafio3() {

System.out.println("Você se infiltra em uma base nazista ocupada na França. No porão escuro, encontra um terminal da resistência que transmite mensagens codificadas para os Aliados. Mas há um problema: o terminal está travado, pois sistemas de bloqueio de sinal estão ativos.\n" + //

"\n" +

"Para desbloquear o terminal e ativar a transmissão, você precisa garantir que todos os bloqueadores de sinal estejam desligados. Se qualquer um deles estiver ligado, a operação falha. Para ativar o terminal e enviar a mensagem aos Aliados, você precisa desligar todos os bloqueadores de sinal.");


for (int i = 1; i <= 3; i++) {

System.out.print("Bloqueador de sinal 1 ativo? (true/false): ");

boolean bloqueador1 = input.nextBoolean();

System.out.print("Bloqueador de sinal 2 ativo? (true/false): ");

boolean bloqueador2 = input.nextBoolean();

System.out.print("Bloqueador de sinal 3 ativo? (true/false): ");

boolean bloqueador3 = input.nextBoolean();


if ((!bloqueador1 && !bloqueador2 && !bloqueador3) && (i == 1)) {

System.out.println(" Terminal desbloqueado! Mensagem enviada com sucesso à resistência.");

System.out.println("\n **** Fragmento de Turing desbloqueado! *** \n" + fragmentosTuring + "/3\n" + conteudoFragmento3 + "\n" );

return true;

} else if (((!bloqueador1 && !bloqueador2 && !bloqueador3) && (i >= 2))){

System.out.println(" Terminal desbloqueado! Mensagem enviada com sucesso à resistência.");

return true;

}

else {

System.out.println(" Sinais ainda estão bloqueados. Tente novamente.");

}

}

return false;

}

private void conclusao() {

System.out.println("Ao voltar para o bunker, você econtra sua máquina do tempo escondida atras de um pano. Os oficiais do exercito a econtraram e queriam estuda-lá, mas para não interferir no passado, você rapidamente inicía uma sequência numérica que começa a se alinhar no painel da cápsula.");

System.out.println("Você ativa o protocolo de retorno temporal.\n");


System.out.println("Você se despede silenciosamente dos ecos de uma guerra devastadora, carregando consigo");

System.out.println("não apenas códigos quebrados, mas a honra de mentes brilhantes apagadas pela história.\n");


System.out.println("A máquina do tempo se fecha com um estrondo metálico.");

System.out.println("Você sente seu corpo flutuar, e da mais um salto no tempo\n");

}

private void voltarInicio() {

System.out.println("\n⚠ Você falhou 3 vezes! Voltando ao iprimeiro desafio...\n");

introducao();

}

}
