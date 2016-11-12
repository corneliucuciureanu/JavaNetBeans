class Exemplu {


    int x; // Variabila de instanta
    static long n; // variabila de clasa 


//bloc static de initializare 
static{
    System.out.println("Initializam ... ");
   // x=0;   // da eroare la compilare  
   	// non-static variable cannot be referenced from a static context
    n=0;
}

// blocul static de initalizare se executa inaintea constructorului  
	Exemplu() {
	    System.out.println("Constructor ... ");
	}

    void metodaDeInstanta(){
	n++;	//corect - var static din metoda de instanta
	x--;    //corect 
    }

    static void metodaStatica() {
	n++;    // corect - doar var statice 
//	x--;    // eroare la compilare 
	// non-static variable cannot be referenced from a static context
    }

}

class ExC2VarClasaInstanta {
    public static void main(String args[]) {

	Exemplu.metodaStatica();

//	Exemplu.metodaDeInstanta(); 
//	error: non-static method cannot be referenced from a static context

	Exemplu ex = new Exemplu();
	ex.metodaDeInstanta();
    }
}
