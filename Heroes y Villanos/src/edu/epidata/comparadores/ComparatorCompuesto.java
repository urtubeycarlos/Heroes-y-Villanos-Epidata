package edu.epidata.comparadores;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import edu.epidata.Enfrentable;

public class ComparatorCompuesto implements Comparator<Enfrentable> {

	private List<Comparator<Enfrentable>> comparators;
	
	public ComparatorCompuesto() {
		this.comparators = new LinkedList<Comparator<Enfrentable>>();
	}
	
	public ComparatorCompuesto(List<Comparator<Enfrentable>> comparators) {
		this.comparators = new LinkedList<Comparator<Enfrentable>>(comparators);
	}
	
	public boolean addComparator(Comparator<Enfrentable> c) {
		return this.comparators.add(c);
	}
	
	public boolean addComparator(Comparator<Enfrentable> c, int index) {
		this.comparators.add(index, c);
		return true;
	}
	
	@Override
	public int compare(Enfrentable e1, Enfrentable e2) {
		int result = 0;
		for(Comparator<Enfrentable> c:this.comparators)
			result += c.compare(e1, e2);
		return result;
	}

}
