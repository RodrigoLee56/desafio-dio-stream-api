package desafio_stream_api_methods.app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class AppTestsApiStream {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

//		 Desafio 1 - Mostre a lista na ordem numérica:
//		 Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
//		numeros.stream().sorted().forEach(System.out::println);

//		Desafio 2 - Imprima a soma dos números pares da lista:
//		Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
//		int somaPares = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
//		System.out.println("Soma dos números pares: " + somaPares);

//		Desafio 3 - Verifique se todos os números da lista são positivos:
//		Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
//		System.out.println(numeros.stream().map(n -> n > 0).collect(Collectors.toList()));
//
//		boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);
//		System.out.println("Todos os números são positivos? " + todosPositivos);

//		Desafio 4 - Remova todos os valores ímpares:

//		Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
//		numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

//		Desafio 5 - Calcule a média dos números maiores que 5:
//		Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
//		System.out.println("Média dos números maiores que 5: "
//				+ numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().orElse(0.0));

//	    Desafio 6 - Verificar se a lista contém algum número maior que 10:
//		Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
//		System.out.println("Existe algum número maior que 10? " + numeros.stream().anyMatch(n -> n > 10));

//	    Desafio 7 - Encontrar o segundo número maior da lista:
//		Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
//		Integer segundoNumero = numeros.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
//				.orElseThrow(() -> new NoSuchElementException("Não existe segundo maior número."));
//		System.out.println(segundoNumero);

//	    Desafio 8 - Somar os dígitos de todos os números da lista:
//	   	Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
		int somaDosDigitos = numeros.stream()
				.mapToInt(numero -> Integer.toString(numero).chars().map(Character::getNumericValue).sum()).sum();

		System.out.println("Soma dos dígitos de todos os números: " + somaDosDigitos);
	}
}
