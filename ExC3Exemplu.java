public class ExC3Exemplu {
    public static void main(String args[]) 
    	throws ArrayIndexOutOfBoundsException  	{
	int v[] = new int[10];
	try {
	v[10] = 0; // exceptie! 
	} catch (Exception e) {
	    System.out.println("Am iesit inafara vectorului cu indicele");
	    System.err.println("Exceptie: "+e.getMessage());
	    e.printStackTrace();
	  //  System.exit(1);
	}  // corect , programul continua	
	
	System.out.println("\n\nmai facem o exceptie!");
	v[11]=0;
	// nu apare eroare la compilare dar apare exceptie la executie si programul va fi terminat

	System.out.println("Aici nu mai ajunge ...");

	
    }
}
