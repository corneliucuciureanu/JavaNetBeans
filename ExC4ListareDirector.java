/***  java frasinaru listing 4.6 pag 113
Programul listeaza fisierele si subdirectoarele unui director.
Pentru fiecare din ele vor fi afisate diverse informatii.
Numele directorului este primit ca argument de la linia de comanda,
sau este directorul curent.
*/

import java.io.*;
import java.util.*;

public class ExC4ListareDirector {
    private static void info(File f) {
	// Afiseaza informatii despre un fisier sau director
	String nume = f.getName();
	if (f.isFile())
	    System.out.println("Fisier: "+nume);
	else
	    if (f.isDirectory())
		System.out.println("Director: "+nume);

	System.out.println(
		"Calea absoluta: " + f.getAbsolutePath()+
		"\n Poate citi: "+ f.canRead() +
		"\n Poate scrie: "+ f.canWrite() +
		"\n Parinte: "+ f.getParent() +
		"\n Cale: "+ f.getPath() +
		"\n Lungime: " + f.length() +
		"\n Data ultimei modificari: "+
		new Date(f.lastModified()));
	System.out.println("-----------------");
    
    }

    public static void main(String args[]) {
	String nume;
	if (args.length == 0)
	    nume = "."; //directorul curent
	 else
	     nume = args[0];

	 try {
	     File director = new File(nume);
	     File[] continut = director.listFiles();

	     for(int i = 0; i < continut.length; i++)
		 info(continut[i]);

	 } catch(Exception e) {
	     e.printStackTrace();
	 }
    }
}
