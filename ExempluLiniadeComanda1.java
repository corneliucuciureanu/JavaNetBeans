class ExempluLiniadeComanda1 {
	public static void main(String[] args) {
		if (args.length==0) {
			System.out.println("Numar insuficient de argumente!");
			System.exit(-1);  //termin aplicatia
		}
		System.out.println("nr argumente= "+args.length);
		String nume = args[0];  //exista sigur 
		String prenume;
		if (args.length > 1)
			prenume = args[1];
		else 
			prenume = ""; //valoare implicita
		System.out.println("Salut "+nume+" "+prenume);
	}
}
