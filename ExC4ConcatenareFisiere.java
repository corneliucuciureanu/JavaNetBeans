/***  Concatenarea a doua fisiere 
ale caror nume sunt primite de la linia de comanda.
Rezultatul concatenarii este afisat pe ecran.
 exemplul frasinaru listing 4.2 pag 101
*/
import java.io.*;

public class ExC4ConcatenareFisiere {
    public static void main(String args[]) {
	if (args.length <=1 ) {
	    System.out.println("Argumente insuficiente!");
	    System.exit(-1);
	}

	try {
	    FileInputStream f1 = new FileInputStream(args[0]);
	    FileInputStream f2 = new FileInputStream(args[1]);
	    SequenceInputStream s = new SequenceInputStream(f1, f2);
	    int c;
	    while ((c = s.read()) != -1)
		System.out.print((char) c);
	    s.close();
	    // f1 si f2 sunt inchise automat
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
