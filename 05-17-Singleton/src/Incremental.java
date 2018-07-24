
public class Incremental {
	private static int count = 0;
	private int numero;

			private Incremental() {
				numero = ++count;
			}
			public static Incremental getInstance(){
				if(count == 0){
					return new Incremental();
				}
				return new Incremental();
			}
			public String toString(){
				return "Incremental "+ this.numero;
			}
}
