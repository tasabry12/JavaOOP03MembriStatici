
public class Punto {
	
//stato interno
	private int x=0;
	private int y=0;
	static private int conta = 0;        //static con static dischiaro che non oggetto non apaprtine a nessun in particolare, ma è condiviso 
	                                     // un qualsiasi metodo chiamato su qualsiasi oggetto Punto portà accedere il lettura scrittura a questa variabile conta
	//METODI
	
	//costruttori
	public Punto(int _x, int _y) {
		setX(_x); 
		setY(_y);
		conta ++;                       // il coastruttore accede a conta
	}
	
	static public int getConta(){      // metodo statico per poterlo richiamare nel main
		return conta;
	}
	
	public Punto(){	this(0,0); }
	
	
	public Punto(int _x)
	{
	this(_x,0);	
	}
	//setter

	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//altro	
	public int LocalizzaQuadrante(){
		if (x>0 && y>0)
			return 1;
		else 
			if (x<0 && y>0)
				return 2;
			else
				if (x<0 && y<0)
					return 3;
				else
					if (x>0 && y<0)
						return 4;
					else 
						return 99;
	}
	
	
}
