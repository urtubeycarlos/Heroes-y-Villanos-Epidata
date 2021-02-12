package edu.epidata;

import java.util.Comparator;
import java.util.List;

public abstract class Enfrentable {
	
	private String nombre;
	private String nombreFantasia;
	
	public Enfrentable(String nombre, String nombreFantasia) {
		this.nombre = nombre;
		this.nombreFantasia = nombreFantasia;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNombreFantasia() {
		return nombreFantasia;
	}
	
	public Enfrentable enfrentar(Enfrentable e, Comparator<Enfrentable> c) {
		if( c.compare(this, e) <= 0) 
			return this;
		else
			return e;
	}

	public abstract float getValorAtributo(String key);
	public abstract List<Personaje> ordenar(Comparator<Enfrentable> c);
	public abstract List<Personaje> getPersonajes();
	
	
	@Override
	public boolean equals(Object o) {
		if( !(o instanceof Personaje) )
			return false;
		Personaje p2 = (Personaje) o;
		return this.getNombreFantasia().equals( p2.getNombreFantasia() );
	}
	
	@Override
	public int hashCode() {
		return this.getNombreFantasia().hashCode();
	}

}
