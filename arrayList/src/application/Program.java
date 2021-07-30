package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {

		// Instanciando e adicionando elementos em um ArrayList:
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");

		// Imprimindo o n�mero correspondente a quantidade de elementos da lista:
		System.out.println(list.size());

		// Imprimindo os dados dicionados em cada posi��o da lista:
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");

		// Removendo todas as posi��es onde se encontra uma String cuja primeira letra
		// comece com "M":
		list.removeIf(x -> x.charAt(0) == 'M');
		// Imprimindo a lista atualizada:
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		// Encontrando e imprimindo o index onde o "Bob" est� localizado na lista:
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// Encontrando e imprimindo o index onde o "Marco" est� na lista(como ele foi
		// removido, o retorno do console ser� "-1"):
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		//Filtrando a lista com todas as Strings que come�am com "A":
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// Imprimindo a lista atualizada:
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		//Encontrando e imprimindo o primeiro String da lista que comece com "A", caso n�o encontre, ser� retornado o valor null no console:
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}