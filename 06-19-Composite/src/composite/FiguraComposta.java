package composite;

import java.util.ArrayList;
import java.util.List;

import component.Figura;

public class FiguraComposta implements Figura{
	private double area;
	private double perimetro;
	private List<Figura> figuras;
	
	
	public FiguraComposta(double area, double perimetro) {
		super();
		this.area = area;
		this.perimetro = perimetro;
		this.figuras = new ArrayList<Figura>();
	}
	
	public void addFigura(Figura f){
		this.figuras.add(f);
	}
	//GETTERS
	public double getArea() {
		return area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public List<Figura> getFiguras() {
		return figuras;
	}
	//SETTERS
	public void setArea(double area) {
		this.area = area;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public void setFiguras(List<Figura> figuras) {
		this.figuras = figuras;
	}
	//FIGURA
	public double perimetroFigura(){
		return perimetro;
	};
	public double areaFigura(){
		return area;
	};
	public void desenhaFigura(){
	}

	@Override
	public String toString() {
		return "area=" + area + ", perimetro=" + perimetro + ", figuras=" + figuras + "";
	};
	

}
