package academia;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		var entrada = new Scanner(System.in);

		System.out.println("Informe o seu sexo [Mulher] / [Homem]: ");
		String sexo = entrada.next();
		System.out.println("Informe a sua idade: ");

		if (sexo.equals("Mulher")) {
			Pessoa mulher = new Mulher();
			mulher.setIdade(entrada.nextInt());
			System.out.println("Valor mensalidade " + mulher.setValorMensalidade(mulher));
		} else {

			Pessoa homem = new Homem();
			homem.setIdade(entrada.nextInt());
			System.out.println("Valor mensalidade " + homem.setValorMensalidade(homem));
		}

		entrada.close();
	}
}
