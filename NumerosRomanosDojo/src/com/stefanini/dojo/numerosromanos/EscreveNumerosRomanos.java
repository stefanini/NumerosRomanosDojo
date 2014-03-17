package com.stefanini.dojo.numerosromanos;

public class EscreveNumerosRomanos {

	public static boolean valida(String entrada) {
		try {
			NumerosRomanos.valueOf(entrada);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static int imprimirValor(String entrada) {
		if (valida(entrada)) {
			return NumerosRomanos.valueOf(entrada).getValue();
		}

		return 0;
	}

	public static int imprimirValorRomano(String entrada) {

		int retorno = 0;
		for (int i = 0; i < entrada.length(); i++) {
			retorno += imprimirValor(String.valueOf(entrada.charAt(i)));
		}
		return retorno;
	}

}
