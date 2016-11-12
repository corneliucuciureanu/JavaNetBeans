//  exemplu folosire enum 

class CuloriSemafor {
    public static final int ROSU = -1;
    public static final int GALBEN = 0;
    public static final int VERDE = 1; 
}

enum Semafor { ROSU, GALBEN, VERDE};



class ExC2Enumerare {
    public static void main(String args[]){
    
    CuloriSemafor semaforColorat = new CuloriSemafor();

	System.out.println("--->   "+Semafor.ROSU);
	System.out.println("CuloriSemafor: "+ semaforColorat.GALBEN);
    }

}

