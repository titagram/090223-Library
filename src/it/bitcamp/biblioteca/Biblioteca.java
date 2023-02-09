package it.bitcamp.biblioteca;


public class Biblioteca {
	
	//att
	private Libro[] scaffale;// = new Libro[10];
	
	
	//costr
	Biblioteca() {
		this.scaffale= new Libro[10];
	};
	
	Biblioteca(int dimensione) {
		this.scaffale= new Libro[dimensione];
	}

	
	//get set
	public Libro[] getScaffale() {
		return scaffale;
	}

	public void setScaffale(Libro[] scaffale) {
		this.scaffale = scaffale;
	};
	
	//metodo aggiungi libro
	public void aggiungiLibro(Libro a) {
		if(a==null) {
			System.out.println("Non puoi aggiungere un libro che non esiste");
			return;
		}
		if(scaffale[scaffale.length-1] != null) {
			aumentaCapienza();
		}
		
		for(int i=0; i<scaffale.length; i++) {
			if(scaffale[i]== null) {
				scaffale[i] = a;
				break;
			}
		}
		
	}	
	
	
	
	//metodo stampa libreria
		public void stampaLibreria() {
			for(int i=0; i<scaffale.length; i++) {
				if(scaffale[i] != null) { //puoi mettere qui il toString di Libro
					System.out.println("--------------------");
					System.out.println("POSIZIONE " +(i+1));
					System.out.println("Titolo: "+scaffale[i].getTitolo());
					System.out.println("Autore: "+scaffale[i].getAutore());
					System.out.println("ISBN: "+scaffale[i].getISBN());
					System.out.println("Pagine: "+scaffale[i].getPagine());
					System.out.println("--------------------");
				}
			}
		}
		
	//Elimina da ISBN
		public void eliminaISBN(int isbn) {
			for(int i=0; i<this.scaffale.length; i++ ) {
				if(this.scaffale[i].getISBN()== isbn) {  
					this.scaffale[i]=null;					
					break;
				}
			}
			riordinaScaffale();
		}
		
		//Ricerca da ISBN
		public Libro cercaISBN(int isbn) {
			Libro libroScelto = null;
			for(int i=0; i<this.scaffale.length; i++ ) {
				if(this.scaffale[i].getISBN()== isbn) {  
					System.out.println("Il libro: "+ this.scaffale[i].getTitolo() + "\nISBN n.: "+this.scaffale[i].getISBN()+"\nSi trova alla posizione numero: "+(i+1) );
					libroScelto=this.scaffale[i];
					break ;
				}				
				
			}
			if(libroScelto==null) {
				System.out.println("Libro non trovato");
			}
			return libroScelto;
		}	
		
		
		//-----------------METODI PRIVATI-------------------------//
		
		//metodo aumenta capienza
		
		private void aumentaCapienza() {
			Libro[] nuovoScaffale = new Libro[scaffale.length+1];
				
			for(int i=0; i<scaffale.length; i++) {
				nuovoScaffale[i] = scaffale[i];
			}
			this.scaffale = nuovoScaffale;
			}
		
		//metodo riordina NULL
		
		private void riordinaScaffale() {
			for(int i=0; i<this.scaffale.length-1; i++) {
				if(this.scaffale[i]== null) {
					this.scaffale[i] = this.scaffale[i+1];
					this.scaffale[i+1] = null;
				}
			}
			
		}
		
	
	

}
