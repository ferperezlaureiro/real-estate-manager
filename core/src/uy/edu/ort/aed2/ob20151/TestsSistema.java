package uy.edu.ort.aed2.ob20151;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestsSistema {

	@Test
	public void testRegistroVendedor() {
		ISistema sistema = new Sistema();
		sistema.inicializarSistema(10);
		//Datos de la prueba
		String cedula = "3.702.156-9";
		String nombre = "Omar";
		String email = "omar@gmail.com";
		String celular = "098123456";
		//Estimulo
		Retorno ret = sistema.registrarVendedor(cedula, nombre, email, celular);
		assertEquals(Retorno.Resultado.OK, ret.resultado);	//Deberia retornar OK
		
	}

	
	@Test
	public void testListadoVendedor() {
		ISistema sistema = new Sistema();
		sistema.inicializarSistema(10);
		//Datos de la prueba
		String cedula = "3.702.156-9";
		String nombre = "Omar";
		String email = "omar@gmail.com";
		String celular = "098123456";
		//Estimulo
		Retorno ret = sistema.registrarVendedor(cedula, nombre, email, celular);
		assertEquals(Retorno.Resultado.OK, ret.resultado);	//Deberia retornar OK
		ret = sistema.listadoVendedores();
		assertEquals(Retorno.Resultado.OK, ret.resultado);	//Deberia retornar OK
		// El valor string deberia contener los datos del vendedor ingresado
		assertTrue(ret.valorString.contains(cedula) && ret.valorString.contains(nombre) && ret.valorString.contains(celular));
	}

}
