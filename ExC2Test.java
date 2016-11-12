/***
Curs Frasinatu Infoiasi
Exemplu curs 2 - clase si obiecte 
- Distrugerea obiectelor 
Utilizati :
 java -verbose:gc ExC2Test
 pentru a vedea Garbage Colector in actiune
 ca urmare a apelului System.gc()
*/

class ExC2Test{
//	import java.lang.Runtime;

 	String a;

	void init(){
		a = new String("aa");
		String b=new String("bb");
		System.out.println("Am initializat a si b");
	}
	
	void stop() {
		a = null;
		System.gc();
		System.out.println("Am distrus a, a=null");
	}

	void print() {
	    System.out.println("var membru a= "+a);
	    }


	public static void main(String args[]) {
		ExC2Test ex = new ExC2Test();
		ex.init();
		ex.print();
		ex.stop();		
		System.out.println("b este distrus de garbage colector!");
		Runtime runtime = Runtime.getRuntime();
		long memory = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("memoria utilizata de program : "+memory);
		System.out.println("utilizati  \"java -verbose:gc ExC2Test\" \npentru a vedea garbage colector in actiune");
	}

}

