import component.Numero1;
import concreteComponent.Numero1Normal;
import decorator.Curly1;
import decorator.Round1;
import decorator.Square1;

public class Teste {

	public static void main(String[] args) {
		//Simples
		Numero1 n1 = new Numero1Normal();
		n1.imprimir();
		System.out.println("\n---------");
		
		//[1]
		Numero1 n2 = new Square1(n1);
		n2.imprimir();
		System.out.println("\n---------");
		
		//{[1]}
		Numero1 n3 = new Curly1(n2);
		n3.imprimir();
		System.out.println("\n---------");
		
		//({[1]})
		Numero1 n4 = new Round1(n3);
		n4.imprimir();
		System.out.println("\n---------");
	}

}
