/***
Cisteste siduri de la tastatura si verifica 
daca reprezinta numere sau nu.
*/

import java.io.*;
public class ExC4CitireTastatura {
    public static void main(String args[]) {
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	try {
	    while(true) {
		String s = stdin.readLine();
		if (s.equals("exit") || s.length() == 0)
		    break;
		System.out.print(s);
		try {
		    Double.parseDouble(s);
		    System.out.println(": DA");
		} catch( NumberFormatException e) {
		    System.out.println(": NU");
		}
	    }
	} catch(IOException e) {
	    System.err.println("Eroare la intrarea standard!");
	    e.printStackTrace();
	}
    }
}
		
