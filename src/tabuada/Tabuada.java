package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		int multiplicando;
		int multiplicadorMaximo;
		int multiplicador = 0;
		int produto;

		Scanner leitor = new Scanner(System.in);

		System.out.println("**********TABUADA**********\n");

		System.out.println("Qual é o multiplicando? (Não é permitido uso de números decimais!)");
		multiplicando = leitor.nextInt();

		System.out.println("Qual é multiplicador máximo? (Não é permitido uso de números decimais!)");
		multiplicadorMaximo = leitor.nextInt();

		leitor.close();

		System.out.println();
		System.out.println("TABUADA DO " + multiplicando);
		System.out.println("--------------------");

		while (multiplicador <= multiplicadorMaximo) {
			produto = multiplicando * multiplicador;
			System.out.println(+multiplicando + "x" + multiplicador + "=" + produto);
			System.out.println();
			
			multiplicador++;
		}

	}

}
