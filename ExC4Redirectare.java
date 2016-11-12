/***
curs frasinaru exemplu listing 4.4  pag 108
*/

import java.io.*;
class ExC4Redirectare {
    public static void main(String args[]) {
	try { 
	    BufferedInputStream in = new BufferedInputStream(
	    	new FileInputStream("in.txt"));
	    PrintStream out = new PrintStream(
	    	new FileOutputStream("out.txt"));
	    PrintStream err = new PrintStream(
	    	new FileOutputStream("err.txt"));

	    System.setIn(in);
	    System.setOut(out);
	    System.setErr(err);

	    BufferedReader br = new BufferedReader(
	    	new InputStreamReader(System.in));
	    String s;
	    while((s = br.readLine()) != null) {
		/* Liniile vor fi citite din fisierul in.txt 
		si vor fi scrise in fisierul out.txt 
		*/
		System.out.println(s);
	    }

	    // Aruncam fortat o exceptie
	    throw new IOException("Test");

	} catch (IOException e) {
	    /* Daca apar exceptii, 
	    ele vor fi scrise in fisierul err.txt
	    */
	    System.err.println("Eroare intrare/iesire!");
	    e.printStackTrace();
	}
    }
}
