import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
        // Criando um objeto Scanner para leitura de entrada do usuário
		Scanner leia = new Scanner (System.in);
		
		// "Bem vindo" inicial ao usuário
		System.out.println("Bem vindo!!!");
		
		// Declarando variáveis para os valores, resultado e operados
		int valor1;
		int valor2;
		int resultado;
		char operador;
			
		try {
            // Solicitando e lendo o primeiro número inteiro
			System.out.println("Digite o primeiro número inteiro: ");
			valor1 = leia.nextInt();
			
            // Solicitando e lendo o segundo número inteiro
			System.out.println("Digite o segundo número inteiro: ");
			valor2 = leia.nextInt();
			
            // Solicitando e lendo o operador desejado
			System.out.println("Insira o operador que você deseja: ");
			operador = leia.next().charAt(0);
				
           	// Realizando a operação com base no operador escolhido
			switch(operador) {
				case '+':
					resultado = valor1 + valor2;
					System.out.println("O resultado da operação "+valor1+" + "+valor2+" é "+resultado);
					break;
				case '-':
					resultado = valor1 - valor2;
					System.out.println("O resultado da operação "+valor1+" - "+valor2+" é "+resultado);
					break;
				case '*':
					resultado = valor1 * valor2;
					System.out.println("O resultado da operação "+valor1+" * "+valor2+" é "+resultado);
					break;
				case '/':
					resultado = valor1 / valor2;
					System.out.println("O resultado da operação "+valor1+" / "+valor2+" é "+resultado);
					break;	
				}
				
			} catch (InputMismatchException e) {
	            // Capturando exceção se o usuário inserir algo que não é um número inteiro
				System.out.println("Erro: Entrada inválida. Certifique-se de inserir números inteiros.");
			} catch (ArithmeticException e) {
	            // Capturando exceção se ocorrer uma divisão por zero
				System.out.println("Erro: "+ e.getMessage());
			} finally {
	            // Garantindo que o Scanner seja fechado, independentemente de exceções
				leia.close();
			}
		}
	}