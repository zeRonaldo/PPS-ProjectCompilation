package leafs;
import component.Figura;

public class Ponto implements Figura {
	private double area;
	private double perimetro;
	
	public Ponto(double area, double perimetro) {
		super();
		this.area = area;
		this.perimetro = perimetro;
	}
	//GETTERS
	public double getArea() {
		return area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	//SETTERS
	public void setArea(double area) {
		this.area = area;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	//FIGURA
	public double perimetroFigura(){
		return perimetro;
	};
	public double areaFigura(){
		return area;
	};
	public void desenhaFigura(){
		System.out.println(". <<<Ponto");
	}
	@Override
	public String toString() {
		return "Ponto [area=" + area + ", perimetro=" + perimetro + "]";
	};
	
}
