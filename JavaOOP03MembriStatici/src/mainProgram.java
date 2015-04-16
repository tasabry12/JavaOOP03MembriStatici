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
//		System.out.println("Sono stati creati "+Punto.getConta()+" punti.");            //Punto.getConta() è un metodo di classe
	
	
// *************** Segmento *****************
		Segmento s = new Segmento(3,2,56,41);
		
		System.out.println("Il segmento è lungo: "+s.lunghezza());
	}

}
