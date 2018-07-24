package nome;
public class SemVirgula implements Nome{
	private String nome;
	private String sobrenome;

	
	public SemVirgula(String n) {
		String[] nomecompleto = n.split(" ");
		this.nome = nomecompleto[0];
		this.sobrenome = nomecompleto[1];
	}
	
	@Override
	public void printNome() {
		System.out.println(this.nome+" "+this.sobrenome);
		
	}
}
