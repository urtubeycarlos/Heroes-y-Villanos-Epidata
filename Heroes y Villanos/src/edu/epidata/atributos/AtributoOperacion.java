package edu.epidata.atributos;

import java.util.function.BiFunction;

import edu.epidata.Enfrentable;

public class AtributoOperacion implements Atributo {

	String key1;
	String key2;
	BiFunction<Float, Float, Float> op;
	
	public AtributoOperacion(String key1, String key2, BiFunction<Float, Float, Float> op) {
		this.key1 = key1;
		this.key2 = key2;
		this.op = op;
	}
	
	@Override
	public float getValor(Enfrentable e) {
		float val1 = e.getValorAtributo(key1);
		float val2 = e.getValorAtributo(key2);
		return op.apply(val1, val2);
	}
	
}
