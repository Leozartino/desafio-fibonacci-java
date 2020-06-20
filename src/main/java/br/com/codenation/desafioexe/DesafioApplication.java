package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> listaSequenciaNumeros = new ArrayList<>();

		final Integer LIMITE = 378;

		Integer termo01 = 0;
		Integer termo02 = 1;
		Integer proximoTermo = termo01 + termo02;

		listaSequenciaNumeros.add(termo01);
		listaSequenciaNumeros.add(termo02);

		while (proximoTermo <= LIMITE) {
			listaSequenciaNumeros.add(proximoTermo);
			termo01 = termo02;
			termo02 = proximoTermo;
			proximoTermo = termo01 + termo02;
		}
		return listaSequenciaNumeros;
	}

	public static Boolean isFibonacci(Integer numero) {
		return fibonacci().contains(numero);

	}
}