package br.com.gsoares;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NewProject {

	public static void main(String[] args) {
		List<String> masculino = new ArrayList<>();
		List<String> feminino = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o nome e sexo de cada pessoa separada por uma virgula: ");
		
		String entrada = s.nextLine();
		String[] pessoas = entrada.split(",");
		Arrays.sort(pessoas);
		for (String separarPorVirgula : pessoas) {
		String[] partes = separarPorVirgula.split("-");
		String nome = partes[0].trim();
		String sexo = partes[1].trim().toUpperCase();
		if (sexo.equals("M")) {
			masculino.add(nome);
		} else if (sexo.equals("F")) {
			feminino.add(nome);
		}
		}
		s.close();
		System.out.println(Arrays.toString(pessoas));
		System.out.println("Grupo Masculino:");
		for (String nomeMasculino : masculino) {
			System.out.println(nomeMasculino);
		}
		System.out.println("Grupo Feminino:");
		for (String nomeFeminino : feminino) {
			System.out.println(nomeFeminino);
		}
	}
}
