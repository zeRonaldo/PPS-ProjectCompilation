package states;
public interface SemaforoState {
	
	
		public SemaforoState tick();
		public SemaforoState panic();
		public SemaforoState off();
		public SemaforoState on();
		public SemaforoState status();
}