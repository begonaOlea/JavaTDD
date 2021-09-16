package com.curso.demo;

public class Juego {

	private char[][] tablero = {
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{' ', ' ', ' '},
	};
	

	private char jugador = 'X';
	
	public Juego() {
		
	}
	
	public boolean ponerFicha(int x, int y)  {
		
		
		if(x < 0 || x >2 ) return false; // 0, 1,2
		if(y < 0 || y >2 ) return false;
		
		if(tablero[x][y] != ' ') return false;
		
		tablero[x][y] = jugador;
	
		if (jugador == 'X' ) {
			jugador = 'O';
		}else {
			jugador = 'X';
		}
		
		
		return true;
	}
	
	public char getJugador() {
		return jugador;
	}
	
	
	

}
