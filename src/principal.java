import java.util.Scanner;

public class principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opc = 0;
        System.out.println("�Que operaci�n quisiera realizar?");
		System.out.println("\n1. Suma:" + "\n2. Resta:" + "\n3. Multiplicaci�n:" + "\n4. Divisi�n:");
		opc = entrada.nextInt();
			while (opc != 5) {	
			if (opc<1 || opc >=5) {
				System.out.println("Digite una opci�n valida");
				break;
			}
			System.out.println("Digite dos n�meros a continuaci�n:");
			System.out.println("Digite el primer n�mero: ");
			int num1 = entrada.nextInt();
			System.out.println("Digite el segundo n�mero: ");
			int num2 = entrada.nextInt();

			if (opc == 1 && num1 >= 0 && num2 >=0) {
				Operaciones suma = new Operaciones();
				int result = suma.suma(num1, num2);
				System.out.println("El resultado de la suma es: " + result);
				System.out.println("Finaliz� el programa");	
				break;
			}
			if (opc == 2 && num1 >= 0 && num2 >=0) {
				Operaciones resta = new Operaciones();
				int result = resta.resta(num1, num2);
				System.out.println("El resultado de la resta es: " + result);
				System.out.println("Finaliz� el programa");
				break;
			}
			if (opc == 3 && num1 >= 0 && num2 >=0) {
				Operaciones multiplicar = new Operaciones();
				int result = multiplicar.multiplicar(num1, num2);
				System.out.println("El resultado de la multiplicaci�n es: " + result);
				System.out.println("Finaliz� el programa");
				break;
			}
			if (opc == 4 && num1 >= 0 && num2 >=0) {
				Operaciones dividir = new Operaciones();
				int result = dividir.dividir(num1, num2);
				System.out.println("El resultado de la divisi�n es: " + result);
				System.out.println("Finaliz� el programa");
				break;
			}
			else {
				System.out.println("Digite un n�mero entero positivo");
				break;
			}			
		}
		System.out.println("Sali� del programa");
	}

}
