// implementarea 3.3  Exceptii proprii  / pag 87

class ExceptieStiva extends Exception {
    public ExceptieStiva (String mesaj) {
	super(mesaj);
    }
}

class Stiva {

    int elemente[] = new int[100];
    int n=0; //numarul de elemente din stiva 

    public void adauga(int x) throws ExceptieStiva {
	if (n==100) 
	    throw new ExceptieStiva("Stiva este plina!");
	    elemente[n++] = x;
    }

    public int scoate() throws ExceptieStiva {
	if (n==0) 
	    throw new ExceptieStiva("Stiva este goala!");
	return elemente[n--];
    }
}

class ExC3ExceptiiProprii {
    public static void main(String args[]) {
	Stiva st = new Stiva();
	
	
	try{  //exceptie stiva e goala  
	    st.scoate();
	} catch(ExceptieStiva e) {
	    System.out.println("\ntratam erorile din stiva");
	    System.err.println("mesaj exceptii: "+e.getMessage());
	    e.printStackTrace();
	}

	try {  //exceptie stiva e plina
		for (int i=0;i<=100;i++) 
		    st.adauga(i);
	} catch (ExceptieStiva e) {
	    System.out.println("\ntratam erorile din stiva");
	    System.err.println("mesaj exceptii: "+e.getMessage());
	    e.printStackTrace();
	}

    }
}
