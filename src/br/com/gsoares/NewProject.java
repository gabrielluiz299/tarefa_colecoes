package br.com.gsoares;

import java.util.Arrays;
import java.util.Scanner;

public class NewProject {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o nome e sexo de cada pessoa separada por uma virgula: ");
		
		String resposta = s.nextLine();
		String[] vetStr = resposta.split(",");
		Arrays.sort(vetStr);
		System.out.print(vetStr);
		s.close();
	}
}
