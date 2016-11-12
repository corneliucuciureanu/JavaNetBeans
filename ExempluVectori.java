class ExempluVectori {
	/***
	 * exemplu utilizare tablouri si metode tablouri
	 */

	public void copiereaVectori() {

		int a[] = {1, 2, 3, 4};
		int b[] = new int[4];
		
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println("");
	

		//Varianta1
		for (int i=0; i<a.length; i++)
			b[i] = a[i];

		for(int i=0;i<b.length;i++)
			System.out.print(b[i]);
		System.out.println("");
	
		//varianta2
		System.arraycopy(a, 0, b, 0, a.length);

		System.out.println("adresa  a "+a+" -  b "+b);
		//Nu are efectul dorit
		b=a;

		for(int i=0;i<b.length;i++)
			System.out.print(b[i]);
		
		System.out.println("adresa b=a "+a+" -  "+b);
		System.out.println("operatia b=a nu copie continut vector! \n copie adresa Vectori");
	}

	public void Sortare() {
		int v[]= {3, 1, 4, 2};
		java.util.Arrays.sort(v);
		
		for(int i=0;i<v.length;i++)
			System.out.print(v[i]);
		System.out.println(" ");

	}

	public static void main(String args[]) {
		// folosirea 
		ExempluVectori ex = new ExempluVectori();
		ex.copiereaVectori();
	}
}
