package handler;
import java.math.BigDecimal;

import helper.Moeda;

public abstract class MoedaHandler {

	
	  /**
	   * Proximo slot da ATM
	   */
	  protected MoedaHandler proximo;
	  
	  /**
	   * Reconhecer o valor monetario da moeda
	   * 
	   * @param coin moeda a ser analisada
	   * @return valor monetario da moeda
	   */
	  public abstract BigDecimal reconhecer(Moeda moeda);

	  /**
	   * Configurar o proximo slot
	   * 
	   * @param successor proximo slot
	   */
	  public void setProximo(MoedaHandler proximo)
	  {
	    this.proximo = proximo;
	  }
	}
