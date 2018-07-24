package handler;

import java.math.BigDecimal;

import helper.Moeda;

public class UmRealHandler extends MoedaHandler {

	/**
	 * Concrete Handler (R$ 1,00)
	 */
	
	 
	  public BigDecimal reconhecer(Moeda moeda)
	  {
	    if(Moeda.UM_REAL.equals(moeda))
	    {
	      System.out.println("Reconhecido R$ 1,00");
	      
	      return new BigDecimal(1.00);
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
