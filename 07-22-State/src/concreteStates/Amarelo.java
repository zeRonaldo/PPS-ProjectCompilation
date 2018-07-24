package concreteStates;
import states.SemaforoState;

public class Amarelo implements SemaforoState{

	@Override
	public SemaforoState tick() {
		// TODO Auto-generated method stub
		
		
		return new Vermelho();
	}

	@Override
	public SemaforoState panic() {
		// TODO Auto-generated method stub
		return new Vermelho();
	}

	@Override
	public SemaforoState off() {
		// TODO Auto-generated method stub
		
		
		
		return new AmareloIntermitente();
	}

	@Override
	public SemaforoState on() {
		// TODO Auto-generated method stub
		return new Vermelho();
	}

	@Override
	public SemaforoState status() {
		// TODO Auto-generated method stub
		return new  Amarelo();
	}

	@Override
	public String toString(){
		return "Amarelo";
		
	
	
	}
}