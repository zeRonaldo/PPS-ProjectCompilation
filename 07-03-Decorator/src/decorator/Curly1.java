package decorator;

import component.Numero1;

public class Curly1 extends umDecorator{
	
	public Curly1(Numero1 num){
		super(num);
	}
	@Override
	public void imprimir() {
		System.out.print("{");
		this.getNumero().imprimir();
		System.out.print("}");
		
	}

}
