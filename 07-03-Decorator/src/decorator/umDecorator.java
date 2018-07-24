package decorator;

import component.Numero1;

public abstract class umDecorator implements Numero1 {
	private Numero1 num1;
	
	public  umDecorator (Numero1 n1){
		this.num1 = n1;
	}
	
	public Numero1 getNumero(){
		return this.num1;
	}
}
