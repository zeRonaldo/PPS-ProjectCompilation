import states.Semaforo;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Semaforo semaforo = new Semaforo();
		
		semaforo.on();
		semaforo.status();
		semaforo.tick();
		semaforo.status();
		semaforo.tick();
		semaforo.panico();
		semaforo.on();

	}

}