/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1p1acf;

import java.util.Random;

/**
 * http://profs.info.uaic.ro/~acf/java/labs/lab_01.html
 * https://en.wikipedia.org/wiki/Graeco-Latin_square
 * @author morfeus
 * 
 */
public class Lab1P1ACF {

    /**
     * @param args the command line arguments
     */
    static int n=0;
    static final char s[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
    static final char t[] = {'\u03B1','\u03B2','\u03B3','\u03B4','\u03B5','\u03B6','\u03B7','\u03B8',
                    '\u03C1','\u03C2','\u03C3','\u03C4','\u03C5','\u03C6','\u03C7',};
      static String matrice[][];
    
    
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // retine timpul de inceput pgogram
        
        if (args.length ==0) {
            n=randomInt(15);
            //n=3;
            System.out.println("For no n argument using "+n+" * "+n+"  Graeco-Latin square!");
            
        }
        else {
            n = Integer.parseInt(args[0]);
            if (n>15) 
            {
                System.out.println("Ati depasit dimensiunea si folosim n=15");
                n=15;
                //System.exit(-1);
            } 
            else if (n<3) 
            {
                System.out.println("Problema nu are rost pentru n= "+n
                        +"\nFolosim valoarea n=3");
                n=3;
            }
            
            System.out.print("T= ");
            for (int i=0;i<n;i++)
                System.out.print(" "+s[i]);
            System.out.print("\nS= ");
            for (int i=0;i<n;i++)
                System.out.print(" "+t[i]);
                            
        }
        
        System.out.println("\nPrinting Graeco-Latin square of "+n+"*"+n); 
                
        deseneazaExempluPatratGL();
        
        TesteazaFunctiaSiftare(n);
        
        formeazaPatrat(n);
        
        // calculeaza timpul de executie program
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("\nTimpul total de executie : "+totalTime);
    }
    
    static int randomInt(int n) {
        Random rnd = new Random();
        int ret = rnd.nextInt(n);
        if (ret <3) 
            return 3;
        else 
            return  ret;
    }
    
    static void deseneazaExempluPatratGL() {
        System.out.println(""+'\u2554'+'\u2550'+'\u2550'+'\u2550'+'\u2550'
                +'\u2566'+'\u2550'+'\u2550'+'\u2550'+'\u2550'+'\u2566'+'\u2550'
                +'\u2550'+'\u2550'+'\u2550'+'\u2557');
        System.out.println('\u2551'+" "+'A'+'\u03B1'+" "+'\u2551'+" "+'B'
                +'\u03B3'+" "+'\u2551'+" "+'C'+'\u03B2'+" "+'\u2551');
        System.out.println(""+'\u2551'+'\u2550'+'\u2550'+'\u2550'+'\u2550'
                +'\u256C'+'\u2550'+'\u2550'+'\u2550'+'\u2550'+'\u256C'+'\u2550'
                +'\u2550'+'\u2550'+'\u2550'+'\u2551');
        System.out.println('\u2551'+" "+'B'+'\u03B2'+" "+'\u2551'+" "+'C'
                +'\u03B1'+" "+'\u2551'+" "+'A'+'\u03B3'+" "+'\u2551');
        System.out.println(""+'\u2551'+'\u2550'+'\u2550'+'\u2550'+'\u2550'
                +'\u256C'+'\u2550'+'\u2550'+'\u2550'+'\u2550'+'\u256C'+'\u2550'
                +'\u2550'+'\u2550'+'\u2550'+'\u2551');
        System.out.println('\u2551'+" "+'C'+'\u03B3'+" "+'\u2551'+" "+'A'
                +'\u03B2'+" "+'\u2551'+" "+'B'+'\u03B1'+" "+'\u2551');
        System.out.println(""+'\u255A'+'\u2550'+'\u2550'+'\u2550'+'\u2550'
                +'\u2569'+'\u2550'+'\u2550'+'\u2550'+'\u2550'+'\u2569'+'\u2550'
                +'\u2550'+'\u2550'+'\u2550'+'\u255D');
    }
    
    public static String GetHexCode(char character)
    {
        return Integer.toHexString(character);
    }//end
    
    public static void TesteazaFunctiaSiftare(int n) {
        int array[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
            System.out.println();
            for(int j = 0; j < n; j++) {
                array[i][j]=((i + 1) + j) % n;
                if (array[i][j] == 0) array[i][j] = n;
                System.out.print("  "+array[i][j]);
            }
        }
        System.out.println();
                
     }
    
    /**
     *
     * @param s
     * @param t
     */
    public static void formeazaPatrat(int n){ 
        //String matrice[][] 
          matrice = new String[n][n]; 
        
        int nr=0;
        /**
         * folosind o solutie de combinatorica de siftare a valorilor cu care 
         * populam matricea satisfacem conditia de a avea valori unice pe rand 
         * si coloana a caracterelor din s si t .
         */
        for (int i=0; i<n;i++) {
            for (int j=0; j<n;j++) {
                // aflam prin o solutie combinatorica care e indicele urmatorului numar              
                nr = ((i+1)+j) % n;
                if (nr== 0) nr = n;
                // adaugam valori in matrice
                matrice[i][j]= new StringBuilder().append(s[nr-1]).append(t[nr-1]).toString();
                System.out.print("\t ["+i+j+"]-"+s[i]+t[i]+"->"+matrice[i][j]);               
            }
            System.out.println();  // trecem pe urmatoarea linie la afisarea matricii
        }  // terminam crearea matricii 
        
        // verificam matricea pentru conditia 2 : fiecare pereche unica 
        verificarePatrat(n);
        AfiseazaPatrat(n);
     }
    
    public static void verificarePatrat(int n) {
        boolean verificare; 
        char aux1,aux2;
        do {
        verificare = true;    
        for(int i=0;i<n;i++) {
            System.out.println();
            for(int j=0;j<n;j++) {
                //System.out.print("\t ["+i+j+"]="+matrice[i][j]); 
                for (int a=0;a<n;a++) 
                    for (int b=0;b<n;b++)
                        if ((matrice[i][j].equals(matrice[a][b])) && ((i!=a) && (j!=b)) && (b!=0)) {
                            System.out.println("sunt egale ["+a+b+"]="+matrice[a][b]+" = ["+i+j+"]");                                                        
                            verificare = false; 
                            if ((b+1)==n) {
                                aux1 = matrice[a][b-1].charAt(1);
                                aux2 = matrice[a][b].charAt(1);
                                matrice[a][b-1]=matrice[a][b-1].replace(aux1,aux2);
                                matrice[a][b]=matrice[a][b].replace(matrice[a][b].charAt(1) , aux1);
                            }
                            else {
                                aux1 = matrice[a][b+1].charAt(1);
                                aux2 = matrice[a][b].charAt(1);
                                matrice[a][b+1]=matrice[a][b+1].replace(aux1,aux2);
                                matrice[a][b]=matrice[a][b].replace(matrice[a][b].charAt(1) , aux1);
                            }
                            break;
                        }
            }
        }
        } while(verificare == false);
        System.out.println("\nAm verificat matricea");
            
    }
    
    public static void AfiseazaPatrat(int n) {
        for (int i=0;i<n;i++) {
            System.out.println();
            for ( int j=0; j<n; j++) {
                System.out.print("\t ["+i+j+"]="+matrice[i][j]);
            }
        }
            System.out.println();
    }
}
