class ExC2FormeGeometrice {
	public static void main(String args[]){
		Dreptunghi dr = new Dreptunghi();
		Patrat pr = new Patrat();
	}
}

class Dreptunghi {
	double x,y,w,h;

	Dreptunghi( double x,double y, double w, double h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		System.out.println("Instantiere Dreptunghi");
	}

	Dreptunghi(double w, double h) {
		this(0,0,w,h); // apelam constructorul cu 4 argumente 
		System.out.println("apelam Dreptunghi cu 4 argumente");
	}

	Dreptunghi() {
		this(0,0);		// apelam constructorul cu 2 argumente
		System.out.println("apelam Dreptunghi cu 2 argumente");
	}
}

class Patrat extends Dreptunghi {
	Patrat(double x, double y, double d) {
		super(x,y,d,d);
		System.out.println("apelam din Patrat pe Dreptunghi cu 4 argumente");
	}
	Patrat(){
		super();
		System.out.println("apelam din Patrat pe Dreptunghi cu 0 argumente");	
	}
}