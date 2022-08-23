package scr.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Progama {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Izar");
		list.add("Duro");
		list.add("Magu");
		list.add("Izaru");

		System.out.println(list.size());

		for (String lista : list) {
			System.out.println(lista);
		}
		System.out.println("---------------------");

		list.removeIf(lista -> lista.charAt(0) == 'M');
		// exclui ojetos com essa caracteristica da lista
		
		
		System.out.println("---------------------");
		System.out.println("A posição de Izar e:" + list.indexOf("Izar"));
		// acha a posicao do objeto naa lista, se nao tiver 
		
		
		System.out.println("---------------------");
		List<String> resultado = list.stream().filter(lista -> lista.charAt(0) == 'I').collect(Collectors.toList());
		// deixa apenas os objestos cm essa caracteristicas
		System.out.println(resultado);
		
		
		System.out.println("---------------------");
		String nome = list.stream().filter(lista-> lista.charAt(0) == 'I').findFirst().orElse(null);
		// procura o primeiro objeto q condiz cm a caracteristica, se n achar retorna null
		System.out.println(nome);
		

	}

}
