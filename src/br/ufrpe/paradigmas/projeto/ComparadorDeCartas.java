package br.ufrpe.paradigmas.projeto;

import java.util.Comparator;

public class ComparadorDeCartas implements Comparator<Carta> {

	@Override
	public int compare(Carta c1, Carta c2) {
		if (c1.getValor() < c2.getValor())
			return -1;
		else if (c1.getValor() > c2.getValor())
			return +1;
		else
			return 0;
	}

}
