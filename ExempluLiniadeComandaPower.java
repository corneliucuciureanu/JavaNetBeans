class ExempluLiniadeComandaPower {
	public static void main(String args[]) {
		for (int i=0; i<args.length; i++)
			System.out.print(args[i]+"*");
		double numar = Double.parseDouble(args[0]);
		int putere=Integer.parseInt(args[1]);
		System.out.println("Rezultat= "+Math.pow(numar,putere));
	}
}
