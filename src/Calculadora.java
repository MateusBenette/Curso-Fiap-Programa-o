import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa calculadora");
		Scanner leitor = new Scanner(System.in);
		int valor1, valor2;
		int soma, subtracao, multiplicacao;
		double divisao;
		
		System.out.println("Por favor, digite o primeiro valor");
		valor1 = leitor.nextInt(); //nextInt() é para números inteiros e || next é para string;
		System.out.println("Por favor, digite o segundo valor");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		System.out.println("A soma dos valores é " + soma);
		
		subtracao = valor1 -valor2;
		System.out.println("A subtração dos valores é " + subtracao);
		
		multiplicacao = valor1 * valor2;
		System.out.println("A Multiplicacao dos valores é " + multiplicacao);
		
		divisao = valor1 / (double)valor2; //quest: converter Valor 2 em double: (double)valor2
		System.out.println("A divisão dos valores é " + divisao);
		
		leitor.close();
		
		

	}

}
