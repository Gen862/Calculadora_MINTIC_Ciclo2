import java.util.Scanner;

public class principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opc = 0;
        System.out.println("¿Que operación quisiera realizar?");
		System.out.println("\n1. Suma:" + "\n2. Resta:" + "\n3. Multiplicación:" + "\n4. División:");
		opc = entrada.nextInt();
			while (opc != 5) {	
			if (opc<1 || opc >=5) {
				System.out.println("Digite una opción valida");
				break;
			}
			System.out.println("Digite dos números a continuación:");
			System.out.println("Digite el primer número: ");
			int num1 = entrada.nextInt();
			System.out.println("Digite el segundo número: ");
			int num2 = entrada.nextInt();

			if (opc == 1 && num1 >= 0 && num2 >=0) {
				Operaciones suma = new Operaciones();
				int result = suma.suma(num1, num2);
				System.out.println("El resultado de la suma es: " + result);
				System.out.println("Finalizó el programa");	
				break;
			}
			if (opc == 2 && num1 >= 0 && num2 >=0) {
				Operaciones resta = new Operaciones();
				int result = resta.resta(num1, num2);
				System.out.println("El resultado de la resta es: " + result);
				System.out.println("Finalizó el programa");
				break;
			}
			if (opc == 3 && num1 >= 0 && num2 >=0) {
				Operaciones multiplicar = new Operaciones();
				int result = multiplicar.multiplicar(num1, num2);
				System.out.println("El resultado de la multiplicación es: " + result);
				System.out.println("Finalizó el programa");
				break;
			}
			if (opc == 4 && num1 >= 0 && num2 >=0) {
				Operaciones dividir = new Operaciones();
				int result = dividir.dividir(num1, num2);
				System.out.println("El resultado de la división es: " + result);
				System.out.println("Finalizó el programa");
				break;
			}
			else {
				System.out.println("Digite un número entero positivo");
				break;
			}			
		}
		System.out.println("Salió del programa");
	}

}
