package edu.epidata.comparadores;

import java.util.Comparator;

import edu.epidata.Enfrentable;

public class ComparatorCriteriaSimple implements Comparator<Enfrentable> {

	private String key;
	
	public ComparatorCriteriaSimple(String key) {
		this.key = key;
	}
	
	
	@Override
	public int compare(Enfrentable e1, Enfrentable e2) {
		// TODO Auto-generated method stub
		return (int) (e1.getValorAtributo(key) - e2.getValorAtributo(key));
	}

}
