import java.util.Random;

public class mainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// *************** Conta numeri *****************		
//		Random r =  new Random();
//		
//		for(int i=0; i<10000;i++){
//			if (r.nextInt(10)==5)
//				new Punto();			
//		}
//
//		System.out.println("Sono stati creati "+Punto.getConta()+" punti.");            //Punto.getConta() è un metodo di classe, si nota hce non ho fatto l'oggetto 
		                                                                                //tipo p1.getConta, ma la classe Punto.getConta per fare questo ho dovuto 
		                                                                                //dichiarare static sia la variabile "static private int conta = 0" che il 
		                                                                                //metodo "static public int getConta()"
	
	
// *************** Segmento *****************
		Segmento s = new Segmento(3,2,56,41);
		
		System.out.println("Il segmento è lungo: "+s.lunghezza());
	}

}
