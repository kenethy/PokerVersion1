package br.ufrpe.paradigmas.projeto;

public class Carta {

	private byte valor;
	private char naipe;
	
	Carta(byte valor, char naipe){
		this.setValor(valor);
		this.setNaipe(naipe);
	}

	public byte getValor() {
		return valor;
	}

	public void setValor(byte valor) {
		this.valor = valor;
	}

	public char getNaipe() {
		return naipe;
	}

	public void setNaipe(char naipe) {
		this.naipe = naipe;
	}
}
