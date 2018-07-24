package handler;

import java.math.BigDecimal;

import helper.Moeda;

public class CincoCentHandler extends MoedaHandler {

	/**
	 * Concrete Handler (R$ 0,05)
	 */
	
	 
	  public BigDecimal reconhecer(Moeda moeda)
	  {
	    if(Moeda.CINCO_CENT.equals(moeda))
	    {
	      System.out.println("Reconhecido R$ 0,05");
	      
	      return new BigDecimal(0.05);
	    }
	    else if(proximo != null)
	    {
	      return proximo.reconhecer(moeda);
	    }
	    else
	    {
	      return new BigDecimal(0.0);
	    }
	  }
	}
