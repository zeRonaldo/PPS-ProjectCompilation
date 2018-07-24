package decorator;

import component.Numero1;

public class Round1 extends umDecorator{
	
	public Round1(Numero1 num){
		super(num);
	}
	@Override
	public void imprimir() {
		System.out.print("(");
		this.getNumero().imprimir();
		System.out.print(")");	
	}

}
