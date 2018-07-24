package states;
import concreteStates.AmareloIntermitente;

public class Semaforo {

	protected SemaforoState cor;
	
	public Semaforo(){
		
		this.cor=new AmareloIntermitente();
		
		System.out.println(String.format("Cor: %s", this.cor));
		
	}
	
	public void tick(){
		this.cor= cor.tick();
		
		System.out.println(String.format("Cor: %s", this.cor));
		
	}
	
	public void panico(){
		this.cor= cor.panic();
		
		System.out.println(String.format("Cor: %s", this.cor));
	}
	
	public void off(){
		this.cor= cor.off();
		
		System.out.println(String.format("Cor: %s", this.cor));
	}
	
	public void on(){
		
		this.cor=cor.on();
		
		System.out.println(String.format("Cor: %s", this.cor));
	}
	
	public void status(){
		this.cor= cor.status();
		System.out.println(String.format("Cor: %s", this.cor));
	}
}