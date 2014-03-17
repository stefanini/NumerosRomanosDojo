package com.stefanini.dojo.numerosromanos;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosRomanosTest {

	@Test
	public void letraInvalida() {
		String entrada = "A";
		
		boolean valido = EscreveNumerosRomanos.valida(entrada);
		
		assertFalse(valido);
	}
	
	@Test
	public void letraValida() {
		String entrada = "M";
		boolean valido = EscreveNumerosRomanos.valida(entrada);
		assertTrue(valido);
	}
	
	@Test 
	public void imprimir1000comValorM() {
		String entrada = "M";
		int retorno = EscreveNumerosRomanos.imprimirValor(entrada);
		assertEquals(1000, retorno); 
	}
	
	@Test
	public void imprimir500comValorD(){
		String entrada = "D";
		int retorno = EscreveNumerosRomanos.imprimirValor(entrada);
		assertEquals(500, retorno);
	}
	
	@Test
	public void imprimirValorRomano(){
		String entrada = "III";
		int retorno = EscreveNumerosRomanos.imprimirValorRomano(entrada);
		assertEquals(3, retorno);
		
		
		
	}

}
