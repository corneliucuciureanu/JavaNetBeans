class A {
    int x;
    
    A() {
	this(0);
	System.out.println("A()");
    }

    // Supraincarcare
    A(int x) {
	this.x = x;
	System.out.println("A(x) x= "+x);
    }

    void metoda() {
	x++;
	System.out.println("A metoda x= "+x);
    }
}

class B extends A {
    B() {
	this(0);
	System.out.println("B()");
    }

     //	Supraincarcare
    B(int x) {
	super(x);
	System.out.println("B(x) x= "+x);
    }

	// Supradefinire prin extensie
    void metoda() {
	super.metoda();
	System.out.println("B metoda x= "+x);
    }
}

class ExC2ThisSuper {
    public static void main(String args[]) {
	A a = new A();
	a.metoda();

	System.out.println("-----------------");
	
	B b = new B();
	b.metoda();
    }
}
