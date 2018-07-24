package composite;

public class Triangulo extends FiguraComposta{

	public Triangulo(double area, double perimetro) {
		super(area, perimetro);
		
	}
	public void desenhaFigura(){
		System.out.println("/\\  <<<<Triângulo");
	}
	@Override
	public String toString() {
		return "Triangulo [" + super.toString() + "]";
	};
	
}
