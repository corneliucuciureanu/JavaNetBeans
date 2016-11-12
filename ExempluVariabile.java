class ExempluVariabile {
	int a;  // a - Varibabile membre
	
	public void metoda(int b) {  // b - argumente ale metodelor
		a = b;
		int c =10;  // c - variabile locale unei metode 
		for(int d=0; d<10; d++) {
			// d - locale unui bloc de cod 
			c--;
		}
		try {
			a = b/c;
		}	catch(ArithmeticException e) {
			// e - Argumente pentru tratarea exceptiilor
			System.err.println(e.getMessage());
		}
	}

	public static void main(String args[]) {
		ExempluVariabile ex = new ExempluVariabile();
		ex.metoda(5);
		ex.a =1;  //vizibil 
	}
}


