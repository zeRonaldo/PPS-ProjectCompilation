package decorator;

import component.Numero1;

public class Square1 extends umDecorator{
	
	public Square1(Numero1 num){
		super(num);
	}
	@Override
	public void imprimir() {
		System.out.print("[");
		this.getNumero().imprimir();
		System.out.print("]");
		
	}

}
