import java.util.ArrayList;

import nome.Nome;

public class teste {

	public static void main(String[] args) {
		if(args.length > 0) {
			ArrayList<Nome> nomes = new ArrayList<Nome>();
			for(String arg:args){
				nomes.add(GerenciadorNome.criarNome(arg));
			}
			
			for(Nome n:nomes){
				n.printNome();
			}
		}else{
			System.out.println("Função sem argumentos");
		}
	}

}
