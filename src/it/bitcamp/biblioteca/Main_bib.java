package it.bitcamp.biblioteca;

public class Main_bib {

	public static void main(String[] args) {
		
		//creo i libri
		Libro l1 = new Libro("Codice Da Vinci", "Dan Brown", 10001, 450);
		Libro l2 = new Libro("Essere o Avere", "Erich Fromm", 10002, 352 );
		Libro l3 = new Libro("Il Piccolo Principe", "Antoine de Saint Exeuperey", 10003, 100);
		Libro l4 = new Libro("Critica della Ragion Pura", "Arthur Shopenheuer", 10004, 380);
		Libro l5 = new Libro("L'alchimista", "Paulo Cohelo", 10005, 350);
		Libro l6 = new Libro("Io sono Giorgia", "Giorgia Meloni", 10006, 180);
		
		//creo gli scaffali
		Biblioteca scaffale1 = new Biblioteca(1); //comunque sarà ingrandito a piacere
		Biblioteca scaffale2 = new Biblioteca(1);
		
		//popolo lo scaffale
		scaffale1.aggiungiLibro(l1);
		scaffale1.aggiungiLibro(l2);
		scaffale1.aggiungiLibro(l3);
		scaffale1.aggiungiLibro(l4);
		scaffale1.aggiungiLibro(l5);
		scaffale1.aggiungiLibro(l6);
		
		//stampo lo scaffale 1
		scaffale1.stampaLibreria();
		
		//cerca libro da ISBN e copialo nel nuovo scaffale (alla prima posizione disponibile)
		scaffale2.aggiungiLibro(scaffale1.cercaISBN(10008));
		
		//elimina libro da ISBN
		scaffale1.eliminaISBN(10005);
		
		//ristampo lo scaffale 1
		scaffale1.stampaLibreria();
		
		//stampo lo scaffale 2
		scaffale2.stampaLibreria();
		
		//Libro in prestito - da completare
		/*Libro inPrestito = scaffale1.cercaISBN(10006);
		Utente U = new Utente();
		U.prendiInPrestito(inPrestito);*/

	}
}