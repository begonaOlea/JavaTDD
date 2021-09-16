package com.curso.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class JuegoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test//(excepted = JuegoException.class)
	public void testPonerFichaEnTableroFueraRangoX() {
		
		//preparo un objeto juego  que todavia no tiene fichas puestas
		Juego j = new Juego();
		int x = 4;
		int y = 0;
		boolean  espero = false;
		boolean recibo = j.ponerFicha(x, y);
		
		Assert.assertEquals(espero, recibo);

	}
	
	@Test
	public void testPonerFichaEnTableroFueraRangoY() {
		
		//preparo un objeto juego  que todavia no tiene fichas puestas
		Juego j = new Juego();
		int x = 0;
		int y = 4;
		boolean  espero = false;
		boolean  recibo = j.ponerFicha(x, y);
		
		Assert.assertEquals(espero, recibo);

	}
	
	
	@Test
	public void testPonerFichaEnTableYaHayFicha() {
		
		//preparo un objeto juego  que todavia no tiene fichas puestas
		Juego j = new Juego();
		int x = 0;
		int y = 0;
		j.ponerFicha(x, y); //poniendo 0,0
		
		boolean  espero = false;
		boolean  recibo = j.ponerFicha(x, y);
		
		Assert.assertEquals(espero, recibo);

	}
	
	@Test
	public void testPonerFichaEnTableroSitioLibre() {
		
		//preparo un objeto juego  que todavia no tiene fichas puestas
		Juego j = new Juego();
		int x = 0;
		int y = 0;
		
		boolean  espero = true;
		boolean  recibo = j.ponerFicha(x, y);
		
		Assert.assertEquals(espero, recibo);

	}
	
	@Test
	public void testPrimerJudagosDebeserX() {
		
		//preparo un objeto juego  que todavia no tiene fichas puestas
		Juego j = new Juego();
		int x = 0;
		int y = 0;
		
		char  espero = 'X';
		char  recibo = j.getJugador();
		
		Assert.assertEquals(espero, recibo);

	}
	
	@Test
	public void testJudagosDespuesdeXDebeserO() {
		
		//preparo un objeto juego  que todavia no tiene fichas puestas
		Juego j = new Juego();
		int x = 0;
		int y = 0;
		j.ponerFicha(x, y);
		
		
		//que espero
		char  espero = 'O';
		//lanzo accion a probar
		char  recibo = j.getJugador();
		
		
		//afirmo esto . si no es falla test
		//Assert.assertEquals(espero, recibo);
		if(espero != recibo) fail("...... jugadro debe ser 0");

	}
	
	
	
	
	
	

}
