class ExempluInstructiuni {
	public static void main(String args[]) {
		int i=0, j=0;
eticheta: 
		while (i < 10) {
			j++;
			if (j==5) continue eticheta;
			if (j==7) break eticheta;
			System.out.println("j="+j);
		}
		i++;
		System.out.println("i="+i);


		int step=0;
		for(int up=0, down=15; up < 15 && down > 0; up++, down--) {
			step++;
			System.out.println("iteratia:"+step+" - "+" up: "+up+" down: "+down);
		}


	}
}
