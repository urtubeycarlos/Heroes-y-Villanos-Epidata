package edu.epidata.atributos;

import java.util.function.BiPredicate;

import edu.epidata.Enfrentable;

public class AtributoCondicional implements Atributo {

	String key1;
	String key2;
	Atributo keyThen;
	Atributo keyElse;
	BiPredicate<Float, Float> p;
	
	public AtributoCondicional(String key1, String key2, Atributo keyThen, Atributo keyElse, BiPredicate<Float, Float> p) {
		this.key1 = key1;
		this.key2 = key2;
		this.keyThen = keyThen;
		this.keyElse = keyElse;
		this.p = p;
	}

	@Override
	public float getValor(Enfrentable e) {
		float val1 = e.getValorAtributo(key1);
		float val2 = e.getValorAtributo(key2);
		if( p.test(val1, val2) )
			return keyThen.getValor(e);
		else
			return keyElse.getValor(e);
		
	}
	
}
