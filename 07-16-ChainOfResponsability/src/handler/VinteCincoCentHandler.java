package handler;

import java.math.BigDecimal;

import helper.Moeda;

public class VinteCincoCentHandler extends MoedaHandler {

	/**
	 * Concrete Handler (R$ 0,25)
	 */
	
	 
	  public BigDecimal reconhecer(Moeda moeda)
	  {
	    if(Moeda.VINTE_CINCO_CENT.equals(moeda))
	    {
	      System.out.println("Reconhecido R$ 0,25");
	      
	      return new BigDecimal(0.25);
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

