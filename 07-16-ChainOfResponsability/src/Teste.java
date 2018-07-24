import java.math.BigDecimal;

import client.Maquina;
import helper.Moeda;

public class Teste {
	 
	  public static void main(String[] args)
	  {
	    // Preço a ser cobrado: R$ 2,02
	    Maquina maq = new Maquina(new BigDecimal(5.04));
	    
	   
	    maq.depositar(Moeda.UM_REAL);
	    maq.depositar(Moeda.UM_REAL);
	   
	    maq.depositar(Moeda.CINQUENTA_CENT);
	    maq.depositar(Moeda.CINQUENTA_CENT);
	    maq.depositar(Moeda.CINQUENTA_CENT);
	    maq.depositar(Moeda.CINQUENTA_CENT);
	    
	    maq.depositar(Moeda.VINTE_CINCO_CENT);
	    maq.depositar(Moeda.VINTE_CINCO_CENT);
	    maq.depositar(Moeda.VINTE_CINCO_CENT);
	   
	    maq.depositar(Moeda.DEZ_CENT);
	    maq.depositar(Moeda.DEZ_CENT);
	    
	   
	    maq.depositar(Moeda.CINCO_CENT);
	    
	    
	    maq.depositar(Moeda.UM_CENT);
	    maq.depositar(Moeda.UM_CENT);
	    maq.depositar(Moeda.UM_CENT);
	    maq.depositar(Moeda.UM_CENT);

	  }
}
