package composite;

public class Circulo extends FiguraComposta{

	public Circulo(double area, double perimetro) {
		super(area, perimetro);
		
	}
	
	public void desenhaFigura(){
		System.out.println("o <<<Círculo");
	}

	@Override
	public String toString() {
		return "Circulo [" + super.toString() + "]";
	};
	
}
