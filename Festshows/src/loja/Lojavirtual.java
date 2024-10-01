package loja;

import java.util.Scanner;

/*Na linha 3 foi importado a classe Scanner, para que possamos usar durante o coding e capturar o que o usuario digitar, gerando um input*/
public class Lojavirtual {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/* Na linha 9 atribuimos um nome para invocarmos a classe Scanner */
		   System.out.println( "Olá, bem vindo(a),O Festshows, é uma ferramenta para auxiliar você a escolher de forma rapida e prático Shows e Combos(Comidas/Bebidas).  ");

	        System.out.print("Primeiramente, digite seu nome: ");
	        String nomeCliente = scanner.nextLine();

	        System.out.println("Bem-vindo(a), " + nomeCliente + "!");
		System.out.println("Caso queira continuar em nossa ferramenta digite(1):");
		int resposta = scanner.nextInt();
		/*
		 * Nas linhas 14 Criamos uma variavel que que ira ser criada ao ser inserido um
		 * valor, apartir da classe que criamos(Scanner)
		 */
		if (resposta == 1) {
			System.out.println("Podemos prosseguir, nos vemos no show ! ");
		} else {
			System.out.println("Obrigado por acessar Festshows, nos vemos na proxima.");
			scanner.close();
			System.exit(0);
		}

		int escolhaShow = 0;
		int escolhaComida = 0;
		int escolhaBebida = 0;
		int nota = 0;
		double total = 0;
		

		/*
		 * Nas linhas 44 à 48 nós declaramos variaveis e atribuimos valores igual a zero
		 * para que pudessemos preencher esses valores mais tarde com valores inteiros
		 */

		System.out.println("Escolha um show: ");
		System.out.println("(1)Show de Rock - R$:45,00");
		System.out.println("(2)Show de Samba - R$:50,00");
		System.out.println("(3)Show de Brega - R$:30,00");

		escolhaShow = scanner.nextInt();
		/*
		 * Na linha 60 evocamos a variavel escolhaShow e iremos atribuir um valor
		 * digitado a partir da classe scanner que criamos, atribuindo assim um valor
		 * digitado pelo usuario
		 */
		if (escolhaShow == 1) {
			System.out.println("Você escolheu Show de Rock R$:45,00!");
			total += 45.00;
		} else if (escolhaShow == 2) {
			System.out.println("Você escolheu Show de Samba - R$:50,00!");
			total += 50.00;
		} else if (escolhaShow == 3) {
			System.out.println("Você escolheu Show de Brega - R$:30,00!");
			total += 30.00;
		} else {
			System.out.println("Opção inválida! Por favor, escolha um número de 1 a 3.");
		}
		/*
		 * Nas linhas 66 a 77 foi criado uma condição if/else/if/else para que possamos
		 * trabalhar com mais opções de condição e ao final evocamos a variavel "total"
		 * para que seja acrescentada a ela "valor" atribuido
		 */

		System.out.println("Escolha qual comida: ");
		System.out.println("(1)Coxinha - R$:6,00 ");
		System.out.println("(2)Pastel - R$:5,25 ");
		System.out.println("(3)Não Quero - R$:0,00 ");
		escolhaComida = scanner.nextInt();
		/*
		 * Na linha 88 evocamos a variavel escolhaComida para que possamos a partir da
		 * classe scanner, possamos atribuir um valor a essa variavel
		 */

		if (escolhaComida == 1) {
			System.out.println("Você escolheu Coxinha - R$:6,00");
			total += 6.00;
		} else if (escolhaComida == 2) {
			System.out.println("Você escolheu Pastel R$:5,25");
			total += 5.25;
		} else if (escolhaComida == 3) {
			System.out.println("Você não quer comer.");
			total += 0.0;
		} else {
			System.out.println("Opção inválida! Por favor, escolha um número de 1 a 3.");
		}
		/*
		 * Nas linhas 94 a 105 foi criado uma condição if/else/if/else para que possamos
		 * trabalhar com mais opções de condição e ao final evocamos a variavel "total"
		 * para que seja acrescentada a ela "valor" atribuido
		 */
		System.out.println("Escolha qual Bebida: ");
		System.out.println("(1)Whisky e Redbull - R$:12,00 ");
		System.out.println("(2)Cerverja latão - R$:7,00 ");
		System.out.println("(3)Coca-cola Lata - R$:5,00 ");
		System.out.println("(4)Agua 250ml - R$:3,25 ");
		System.out.println("(5)Não Quero - R$:0,00 ");

		escolhaBebida = scanner.nextInt();
		/*
		 * Na linha 118 evocamos a variavel escolhaBebida para que possamos a partir da
		 * classe scanner, possamos atribuir um valor a essa variavel
		 */
		if (escolhaBebida == 1) {
			System.out.println("Você escolheu Whisky e Redbull - R$:12,00");
			total += 12.00;
		} else if (escolhaBebida == 2) {
			System.out.println("Você escolheu Cerveja Latão R$:7,00");
			total += 7.00;
		} else if (escolhaBebida == 3) {
			System.out.println("Você escolheu Coca-cola Lata - R$:5,00");
			total += 5.00;
		}else if (escolhaBebida == 4) {
			System.out.println("Você escolheu Agua 250ml R$:3,25");
			 
			total += 3.25;
		} 
		else if (escolhaBebida == 5) {
			System.out.println("Você não quer beber.");
			total += 0.0;
		} else {
			System.out.println("Opção inválida! Por favor, escolha um número de 1 a 5.");
		}
		System.out.println(nomeCliente + " - " + "O seu repertorio é = " +"Show:" +  escolhaShow + " "  +"Comida:" +  escolhaComida + " " +"Bebida:" + escolhaBebida + " " + " e " + "Você gastou R$:" + total);
		/*
		 * Nas linhas 123 a 141 foi criado uma condição if/else/if/else para que possamos
		 * trabalhar com mais opções de condição e ao final evocamos a variavel "total"
		 * para que seja acrescentada a ela "valor" atribuido
		 */
		System.out.println("Dê uma nota para nosso sistema:");
		System.out.println("(1) Péssimo ");
		System.out.println("(2) Precisa melhorar ");
		System.out.println("(3) Bom ");
		System.out.println("(4) Excelente ");
		
		nota = scanner.nextInt();
		/*
		 * Na linha 149 evocamos a variavel nota para que possamos a partir da classe
		 * scanner, possamos atribuir um valor a essa variavel
		 */
		switch (nota) {
		case 1:
			System.out.println("Que pena, nos tentaremos fazer melhor");
			break;
		case 2:
			System.out.println("Obrigado, tentaremos melhorar");
			break;
		case 3:
			System.out.println("Que bom, que gostou !");
			break;
		case 4:
			System.out.println("Ficamos felizes que tenha gostado !");
			break;
		default:
			System.out.println("Erro: Opção inválida.");
			return;
		/*
		 * Nas linhas 159 a 174 criamos a condicional switch, que possibilita a criação de
		 * infinitos "casos" de maneira mais para que o sistema imprima as notas de
		 * acordo com o caso escolhido pelo cliente
		 */
		}
		System.exit(0);
		
	}

}
