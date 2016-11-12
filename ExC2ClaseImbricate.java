class ClasaDeAcoperire {
    private int x=1;

    class ClasaImbricata1 {
	int a=x;
    }

    void metoda() {
	final int y=2;
	int z=3;
	class ClasaImbricata2 {
	    int b=x;
	    int c=y;

	    int d=z; //incorect
	}
    }

    static class ClasaImbricataStatica {
	int t=0;
    }
}

class ExC2ClaseImbricate {
    public static void main (String args[]) {
	ClasaDeAcoperire ex = new ClasaDeAcoperire();
//	ClasaDeAcoperire.ClasaImbricata1 ci1 = new ClasaDeAcoperire.ClasaImbricata1();
	//ci1.a =10;
	ex.metoda();
	//ex.metoda(new ClasaImbricata2());

//	ClasaDeAcoperire.ClasaImbricata.t =1;
    }
}
