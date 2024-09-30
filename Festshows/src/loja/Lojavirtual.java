package loja;

import java.util.Scanner;

/*Na linha 3 foi importado a classe Scanner, para que possamos usar durante o coding e capturar o que o usuario digitar, gerando um input*/
public class Lojavirtual {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/* Na linha 9 atribuimos um nome para invocarmos a classe Scanner */
		System.out.println(" Olá, bem vindo(a) ao Festshows. ");

		System.out.println("Digite caso queira prosseguir digite (1):");
		String resposta = scanner.nextLine();
		/*
		 * Nas linhas 14 Criamos uma variavel que que ira ser criada ao ser inserido um
		 * valor, apartir da classe que criamos(Scanner)
		 */
		if (resposta.equals("1")) {
			System.out.println("Podemos prosseguir, nos vemos no show ! ");
		} else {
			System.out.println("Obrigado por acessar Festshows, nos vemos na proxima.");
			scanner.close();
			System.exit(0);
		}
		/*
		 * Nas linhas 19 a 25 criamos um condição se/senão para escolher uma resposta do usuario, criando a
		 * condição de se o usuario quiser acessar ele vai digitar um valor valido(1),
		 * qualquer valor diferente o sistema reconhecera como invalido e ira sair.
		 * OBS:Ao usar o Equals nos fazemos uma comparação vamos comparar uma variavel
		 * declarada e "comparar" a um valor inserido
		 */
		System.out.print("Primeiramente digite seu nome:");
		String nomeCliente = scanner.nextLine();
		/*
		 * na linha 34 nós atribuimos o um valor que foi inserido pelo usuario ao
		 * invocarmos o nome criado para a classe Scanner, atribuindo um valor variavel
		 * string
		 */
		System.out.println("Bem vindo(a), " + nomeCliente + "!");

		System.out.println(" Nos lhe auxiliaremos a escolhe o show, a comida e a sua bebida ! ");

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
		System.out.println("(3)Agua 250ml - R$:3,25 ");
		System.out.println("(4)Não Quero - R$:0,00 ");

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
			System.out.println("Você escolheu Agua 250ml R$:3,25");
			total += 3.25;
		} else if (escolhaBebida == 4) {
			System.out.println("Você não quer beber.");
			total += 0.0;
		} else {
			System.out.println("Opção inválida! Por favor, escolha um número de 1 a 4.");
		}
		/*
		 * Nas linhas 123 a 137 foi criado uma condição if/else/if/else para que possamos
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
		 * Nas linhas 154 a 169 criamos a condicional switch, que possibilita a criação de
		 * infinitos "casos" de maneira mais para que o sistema imprima as notas de
		 * acordo com o caso escolhido pelo cliente
		 */
		}

		System.out.println(nomeCliente + " - " + "Você gastou R$:" + total);
		System.exit(0);
		/*
		 * Finalizamos o codigo mostrando o "nomeCliente" e "total" que foi somado
		 * durante o processo de inserção
		 */
	}
	
}
