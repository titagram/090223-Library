package it.bitcamp.biblioteca;

public class Libro { 
	//mettere private!
	//toString
	
	//attributi
	private String titolo;
	private String autore;
	private int ISBN;
	private int pagine;
	
	//costruttori
	Libro(){}

	public Libro(String titolo, String autore, int ISBN, int pagine) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.ISBN = ISBN;
		this.pagine = pagine;
	}
	
	//get set
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	};
	
	  
	

}
