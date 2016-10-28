package br.ufrpe.paradigmas.projeto;

import java.io.IOException;
import java.util.ArrayList;

public class Player {

	ArrayList<Carta> carta;
	ArrayList<Maos> mao;
	Regras ranking;
	private byte cartaAlta;
	private byte cartaRanking;
	private byte kicker;

	public Player() {
		this.carta = new ArrayList<Carta>();
		this.mao = new ArrayList<Maos>();
		this.ranking = new Regras();
	}

	public void setCarta(byte valor, char naipe) {
		Carta c = new Carta(valor, naipe);
		carta.add(c);
	}

	public void setMao(Maos mao) {
		this.mao.add(mao);
	}

	public byte getCartaAlta() {
		return cartaAlta;
	}

	public void setCartaAlta(byte cartaAlta) {
		this.cartaAlta = cartaAlta;
	}

	public byte getCartaRanking() {
		return cartaRanking;
	}

	public void setCartaRanking(byte cartaRanking) {
		this.cartaRanking = cartaRanking;
	}

	public byte getKicker() {
		return kicker;
	}

	public void setKicker(byte kicker) {
		this.kicker = kicker;
	}
	
//	public void printMao() throws IOException {
//		for (Carta carta2 : carta) {
//			System.out.print(carta2.getValor() + "" + carta2.getNaipe() + " ");
//		}
//		System.out.println();
//	}
}
