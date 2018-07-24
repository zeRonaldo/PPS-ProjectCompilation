package handler;
import java.math.BigDecimal;

import helper.Moeda;

public class UmCentHandler extends MoedaHandler{
	

	/**
	 * Concrete Handler (R$ 0,01)
	 */
	
	 
	  public BigDecimal reconhecer(Moeda moeda)
	  {
	    if(Moeda.UM_CENT.equals(moeda))
	    {
	      System.out.println("Reconhecido R$ 0,01");
	      
	      return new BigDecimal(0.01);
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
