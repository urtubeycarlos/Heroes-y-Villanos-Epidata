package edu.epidata.comparadores;

import java.util.Comparator;

import edu.epidata.Enfrentable;

public class ComparatorNombre implements Comparator<Enfrentable> {

	@Override
	public int compare(Enfrentable e1, Enfrentable e2) {
		return e1.getNombre().compareTo( e2.getNombre() );
	}


}
