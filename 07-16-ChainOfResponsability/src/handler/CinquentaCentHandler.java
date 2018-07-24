package handler;

import java.math.BigDecimal;

import helper.Moeda;

public class CinquentaCentHandler extends MoedaHandler {

	/**
	 * Concrete Handler (R$ 0,50)
	 */
	
	 
	  public BigDecimal reconhecer(Moeda moeda)
	  {
	    if(Moeda.CINQUENTA_CENT.equals(moeda))
	    {
	      System.out.println("Reconhecido R$ 0,50");
	      
	      return new BigDecimal(0.50);
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

