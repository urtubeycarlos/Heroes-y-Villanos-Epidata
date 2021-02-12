package edu.epidata.atributos;

import edu.epidata.Enfrentable;

public class AtributoSimple implements Atributo {

	float valor;
	
	public AtributoSimple(float valor){
		this.valor = valor;
	}

	@Override
	public float getValor(Enfrentable e) {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
