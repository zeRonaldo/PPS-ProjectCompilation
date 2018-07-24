package composite;

public class Quadrilatero extends FiguraComposta {

	public Quadrilatero(double area, double perimetro) {
		super(area, perimetro);
		
	}
	public void desenhaFigura(){
		System.out.println("[] <<<Quadrilátero");
	}
	@Override
	public String toString() {
		return "Quadrilatero [" + super.toString() + "]";
	};
	
}
