package edu.epidata;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Liga extends Enfrentable {

	private List<Enfrentable> integrantes;
	
	public Liga(String nombre, String nombreFantasia) {
		super(nombre, nombreFantasia);
		this.integrantes = new LinkedList<Enfrentable>();
	}
	
	public Liga(String nombre, String nombreFantasia, List<Enfrentable> integrantes) {
		super(nombre, nombreFantasia);
		this.integrantes = new LinkedList<Enfrentable>(integrantes);
	}

	public boolean addIntegrante(Enfrentable e) {
		return this.integrantes.add(e);
	}
	
	@Override
	public float getValorAtributo(String key) {
		int cantPoseedoresAtrib = 0;
		float valorAtributo = 0;
		for(Enfrentable e:this.integrantes) {
			float tmp = e.getValorAtributo(key);
			if( tmp != 0 ) {
				cantPoseedoresAtrib++;
				valorAtributo += tmp;
			}
				
		}
		return valorAtributo/cantPoseedoresAtrib;
	}

	@Override
	public List<Personaje> ordenar(Comparator<Enfrentable> c) {
		List<Personaje> personajes = this.getPersonajes();
		Collections.sort(personajes, c);
		return personajes;
	}

	@Override
	public List<Personaje> getPersonajes() {
		List<Personaje> personajes = new LinkedList<Personaje>(); 
		for(Enfrentable e:this.integrantes)
			personajes.addAll( e.getPersonajes() );
		return personajes;
	}

}
