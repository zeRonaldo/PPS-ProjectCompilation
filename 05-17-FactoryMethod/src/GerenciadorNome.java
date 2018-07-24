import nome.ComVirgula;
import nome.Nome;
import nome.SemVirgula;

public class GerenciadorNome {
	public Nome criarNome(String n){
		if(n.contains(",")) return new ComVirgula(n);
		else  return new SemVirgula(n);
	}
}
	

