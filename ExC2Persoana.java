/***
curs Frasinaru infoiasi
Exemplu curs 2  Persoana 
- exemplu de Clasa cu explicatii 
*/

// [public][abstract][final] class NumeClasa
class Persoana 
// [extends NumeSuperClasa]
// [implements NumeInterfata1 , ... , NumeInterfataN] 
   {
	// [Variabile]
	static private int id=0;		// accesibil doar in clasa - variabila de clasa 
	protected String nume;		// accesibil doar clasei si subclaselor - variabila de instanta

	// [Constructori]
	public Persoana(String nume) {
	    this.nume = nume;
	    plusId();
	}

	// [Metode]
	// metoda Getter 
	public String getNume() {      // accesibil tuturor 
	    return nume;
	}

	// metoda Setter 
	void setNume (String nume) {   // vizibil la nivel de pachet, modificator de acces implicit 
	    this.nume = nume;
	}
	
	//metoda 
	protected void printId() {     // vizibil clasei si subclaselor
	    System.out.println("ID= "+id);
	}

	private void plusId() {       // vizibil doar clasei 
	    id++;
	}

	// [Clase imbricate - interne]

   }

class ExC2Persoana {
    // metoda main pentru apelul clasei ExC2Persoana
    public static void main(String args[]) {
	Persoana p = new Persoana("Ion"); 	// creeaza si initializeaza folosind constructorul 
	System.out.println("Nume Persoana "+p.getNume()); // apeleaza metoda getter
	p.setNume("Maria");				// apeleaza metoda setter 
	System.out.println("Nume Persoana "+p.getNume());
	
	Persoana s = new Persoana("Gheorghe");
	System.out.println("Nume Persoana "+s.getNume());
	p.printId(); 			// Id este static variabila de clasa

	
    }
}

    
