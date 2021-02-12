package edu.epidata;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Juego {
	
	private List<Enfrentable> enfrentables;
	
	public Juego() {
		this.enfrentables = new LinkedList<Enfrentable>();
	}
	
	public boolean addEnfrentable(Enfrentable e) {
		return this.enfrentables.add(e);
	}
	
	public List<Enfrentable> getQuienesVencen(Enfrentable e2, Comparator<Enfrentable> c){
		List<Enfrentable> vencedores = new LinkedList<Enfrentable>();
		for(Enfrentable e1:this.enfrentables)
			if( c.compare(e1, e2) <= 0 )
				vencedores.add(e1);
		if( vencedores.isEmpty() )
			return new LinkedList<Enfrentable>( Arrays.asList(e2) );
		return vencedores;
	}
	
	public Enfrentable enfrentar(Enfrentable e1, Enfrentable e2, Comparator<Enfrentable> c) {
		return e1.enfrentar(e2, c);
	}
	
	public List<Personaje> ordenarPersonajes(Comparator<Personaje> c){
		Set<Personaje> personajes = new TreeSet<Personaje>(c);
		for(Enfrentable e:this.enfrentables)
			personajes.addAll( e.getPersonajes() );
		return new LinkedList<Personaje>(personajes);
	}
	
	public static void main(String... args) {
		//Play the game
	}

}
