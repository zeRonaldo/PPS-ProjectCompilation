package client;

import java.util.ArrayList;

import component.Figura;
import composite.*;
import leafs.*;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura ponto =  new Ponto(0, 0);
		Figura reta = new Reta (1, 0);
		Figura circ = new Circulo(1, 3);
		Figura quad = new Quadrilatero(2,4);
		Figura tri = new Triangulo(1,5);
		ArrayList <Figura>all = new ArrayList<Figura>();
		
		all.add(ponto);
		all.add(reta);
		all.add(circ);
		all.add(quad);
		all.add(tri);
		
		for(Figura f : all){
			f.desenhaFigura();
		}
		
		
		Figura reta2= new Reta(1,1);
		Figura reta3= new Reta(1,2);
		Figura reta4 = new Reta(1,3);
		
		 ((FiguraComposta) tri).addFigura(reta);
		 ((FiguraComposta) tri).addFigura(reta2);
		 ((FiguraComposta) tri).addFigura(reta3);
		 
		 ((FiguraComposta) quad).addFigura(reta);
		 ((FiguraComposta) quad).addFigura(reta2);
		 ((FiguraComposta) quad).addFigura(reta3);
		 ((FiguraComposta) quad).addFigura(reta4);
		 
		 ((FiguraComposta) circ).addFigura(ponto);
		 
		 
		 for(Figura f : all){
				System.out.println(f.toString());
			};
	}

}
