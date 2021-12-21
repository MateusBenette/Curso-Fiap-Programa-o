import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PROGRAMA EDUCADO!");
		System.out.println("Por favor, digite o seu nome: ");
		//As duas linhas abaixo exibem mensagens na tela
		Scanner leitor = new Scanner(System.in);
		//Para guardar dados de texto, a linha abaixo cria uma variável
		String nome;
		//Para ler dados, a linha abaixo CRIA um scanner
		nome = leitor.next();
		System.out.println("Boa noite, " + nome);
		leitor.close();

	}
	
}
