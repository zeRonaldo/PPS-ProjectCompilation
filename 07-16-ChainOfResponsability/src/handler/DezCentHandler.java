package handler;

import java.math.BigDecimal;

import helper.Moeda;

public class DezCentHandler extends MoedaHandler {

	/**
	 * Concrete Handler (R$ 0,10)
	 */
	
	 
	  public BigDecimal reconhecer(Moeda moeda)
	  {
	    if(Moeda.DEZ_CENT.equals(moeda))
	    {
	      System.out.println("Reconhecido R$ 0,10");
	      
	      return new BigDecimal(0.10);
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

