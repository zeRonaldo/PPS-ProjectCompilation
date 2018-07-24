import java.util.HashMap;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] matriz ={ {8.0, 7.5},{ 8.5, 9.0},{ 8.2, 30 }, {8.9, 9.0},{ 8.6, 8.4}, {2.3, 8.0 }};
		HashMap map = new MapAdapter(matriz[5][2]);
		map.toString();
	}

}
