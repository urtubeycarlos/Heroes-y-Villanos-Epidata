package edu.epidata;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import edu.epidata.atributos.Atributo;

public class Personaje extends Enfrentable {

	Map<String, Atributo> atributos;
	
	public Personaje(String nombre, String nombreFantasia) {
		super(nombre, nombreFantasia);
		this.atributos = new HashMap<String, Atributo>();
	}

	@Override
	public float getValorAtributo(String key) {
		Atributo a = this.atributos.get(key);
		if( a == null )
			return 0;
		return a.getValor(this);
	}

	@Override
	public List<Personaje> ordenar(Comparator<Enfrentable> c) {
		return this.getPersonajes();
	}

	@Override
	public List<Personaje> getPersonajes() {
		return new LinkedList<Personaje>( Arrays.asList(this) );
	}


}
