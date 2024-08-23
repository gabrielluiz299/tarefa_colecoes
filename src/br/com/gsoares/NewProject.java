package br.com.gsoares;

import java.util.Arrays;
import java.util.Scanner;

public class NewProject {

	public static void main(String[] args) {
		private static Scanner() {
			Scanner s = new Scanner(System.in);
		}
		System.out.print("Digite o nome e o sexo de cada pessoa separada por uma ',' ");
		
		String resposta = s.next();
		String[] vetStr = resposta.split(",");
		Arrays.sort(vetStr);
		System.out.print(vetStr);
	}
}
