/***
java frasinaru exemplu listing 4.5 pag 110
Citirea unei secvente de numere si siruri 
dintr-un fisier specificat
si afisarea tipului si valorii lor
*/

import java.io.*;
public class ExC4CitireAtomi {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new FileReader("in.txt"));
	StreamTokenizer st = new StreamTokenizer(br);

	int tip = st.nextToken();
	// Se citeste primul atom lexical 
	while (tip != StreamTokenizer.TT_EOF) {
	    switch (tip) {
		case StreamTokenizer.TT_WORD:
			System.out.println("Cuvant: "+st.sval);
			break;
		case StreamTokenizer.TT_NUMBER:
			System.out.println("Numar: "+st.nval);
	    }

	    tip = st.nextToken();
	    // trecem la urmatorul atom
	}
    }
}

