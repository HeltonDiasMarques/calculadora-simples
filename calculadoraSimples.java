import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
        // Criando um objeto Scanner para leitura de entrada do usu�rio
		Scanner leia = new Scanner (System.in);
		
		// "Bem vindo" inicial ao usu�rio
		System.out.println("Bem vindo!!!");
		
		// Declarando vari�veis para os valores, resultado e operados
		int valor1;
		int valor2;
		int resultado;
		char operador;
			
		try {
            // Solicitando e lendo o primeiro n�mero inteiro
			System.out.println("Digite o primeiro n�mero inteiro: ");
			valor1 = leia.nextInt();
			
            // Solicitando e lendo o segundo n�mero inteiro
			System.out.println("Digite o segundo n�mero inteiro: ");
			valor2 = leia.nextInt();
			
            // Solicitando e lendo o operador desejado
			System.out.println("Insira o operador que voc� deseja: ");
			operador = leia.next().charAt(0);
				
           	// Realizando a opera��o com base no operador escolhido
			switch(operador) {
				case '+':
					resultado = valor1 + valor2;
					System.out.println("O resultado da opera��o "+valor1+" + "+valor2+" � "+resultado);
					break;
				case '-':
					resultado = valor1 - valor2;
					System.out.println("O resultado da opera��o "+valor1+" - "+valor2+" � "+resultado);
					break;
				case '*':
					resultado = valor1 * valor2;
					System.out.println("O resultado da opera��o "+valor1+" * "+valor2+" � "+resultado);
					break;
				case '/':
					resultado = valor1 / valor2;
					System.out.println("O resultado da opera��o "+valor1+" / "+valor2+" � "+resultado);
					break;	
				}
				
			} catch (InputMismatchException e) {
	            // Capturando exce��o se o usu�rio inserir algo que n�o � um n�mero inteiro
				System.out.println("Erro: Entrada inv�lida. Certifique-se de inserir n�meros inteiros.");
			} catch (ArithmeticException e) {
	            // Capturando exce��o se ocorrer uma divis�o por zero
				System.out.println("Erro: "+ e.getMessage());
			} finally {
	            // Garantindo que o Scanner seja fechado, independentemente de exce��es
				leia.close();
			}
		}
	}