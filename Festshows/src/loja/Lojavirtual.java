package loja;
import java.util.Scanner;
/*Na linha 2 foi importado a classe Scanner, para que possamos capturar o que o usuario digitar, gerando um input*/
public class Lojavirtual {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*Na linha 7 atribuimos um nome para invocarmos a classe Scanner */
		System.out.println(" Olá, bem vindo(a) ao Festshows. ");
	
		System.out.print("Digite seu nome:");
		String nomeCliente = scanner.nextLine();
		/* na linha 12 nós atribuimos o um valor que foi inserido pelo usuario ao invocarmos o nome criado para a classe Scanner, atribuindo um valor variavel string  */
		System.out.println("Bem vindo(a), " + nomeCliente + "!");

		System.out.println(" Nos lhe auxiliaremos a escolhe o show, a comida e a sua bebida ! ");
	
		int escolhaShow = 0;
		int escolhaComida = 0;
		int escolhaBebida = 0;
		double total = 0;
		
		double precoShow = 0;
		double precoComida = 0;
		double precoBebida = 0;
		/* Nas linhas 17 à 24 nós declaramos variaveis e atribuimos valores igual a zero para que pudessemos preencher esses valores mais tarde com valores inteiros */
		
		System.out.println("Escolha um show: ");
		System.out.println("(1)Show de Rock - R$:45,00");
		System.out.println("(2)Show de Samba - R$:50,00");
		System.out.println("(3)Show de Brega - R$:30,00");
		
	    escolhaShow = scanner.nextInt();
		
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
		
	    System.out.println("Escolha qual comida: ");
	    System.out.println("(1)Coxinha - R$:6,00 ");
	    System.out.println("(2)Pastel - R$:5,25 ");
	    System.out.println("(3)Não Quero - R$:0,00 ");
	    
	    escolhaComida = scanner.nextInt();
	    
	    if (escolhaComida == 1) {
	    	System.out.println("Você escolheu Coxinha - R$:6,00");
	    	total += 6.00;
	    }else if (escolhaComida == 2){
	    	System.out.println("Você escolheu Pastel R$:5,25");
	    	total += 5.25;
	    }else {
	    	System.out.println("Você não quer comer nada");
	    }
	    
	    
        System.out.println("Você gastou R$: " + total);
	}

}
