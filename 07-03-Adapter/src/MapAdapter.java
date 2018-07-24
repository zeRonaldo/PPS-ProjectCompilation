import java.lang.reflect.Array;
import java.util.HashMap;

@SuppressWarnings("rawtypes")
public interface MapAdapter extends java.util.Map {
	
	static void Map(Object [][] o){
		@SuppressWarnings("rawtypes")
		HashMap m = new HashMap();
		for (int i = 0; i < o.length; i++){
			Object key = o[i][0];
			Object value = o[i][1];
			m.put(key, value);
		}
		
	}
}
