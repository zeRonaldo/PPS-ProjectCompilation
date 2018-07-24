package nome;

public class ComVirgula implements Nome{
	private String nome;
	private String sobrenome;
	
	public ComVirgula(String n) {
		// TODO Auto-generated method stub
		String[] nomecompleto = n.split(", ");
		this.nome = nomecompleto[1];
		this.sobrenome = nomecompleto[0];
	}

	@Override
	public void printNome() {
		System.out.println(this.nome+" "+this.sobrenome);
		
	}

}
