package client;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import handler.CincoCentHandler;
import handler.CinquentaCentHandler;
import handler.DezCentHandler;
import handler.MoedaHandler;
import handler.UmCentHandler;
import handler.UmRealHandler;
import handler.VinteCincoCentHandler;
import helper.Moeda;

public class Maquina {
	
	  /**
	   * Preco a ser cobrado pela Máquina
	   */
	  private BigDecimal price;
	  
	  /**
	   * Primeiro slot da Máquina
	   */
	  private MoedaHandler slot;
	  
	  /**
	   * Valor depositado na Máquina pelo usuario
	   */
	  private BigDecimal total;
	  
	  /**
	   * Construtor para inicializar o preco a ser cobrado pela Máquina
	   * 
	   * @param price preco a ser cobrado pela Máquina
	 * @return 
	   */
	  public Maquina(BigDecimal price)
	  {
	    this.price = price;
	    
	    total = new BigDecimal(0.0);
	    
	    NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
	    
	    System.out.println("Preço a ser cobrado: R$ " + nf.format(price));
	    
	    slot = new UmCentHandler();
	    MoedaHandler cincoCent = new CincoCentHandler();
	    MoedaHandler dezCent = new DezCentHandler();
	    MoedaHandler vinteCincoCent = new VinteCincoCentHandler();
	    MoedaHandler cinquentaCent = new CinquentaCentHandler();
	    MoedaHandler umReal = new UmRealHandler();
	    
	    slot.setProximo(cincoCent);
	    cincoCent.setProximo(dezCent);
	    dezCent.setProximo(vinteCincoCent);
	    vinteCincoCent.setProximo(cinquentaCent);
	    cinquentaCent.setProximo(umReal);
	  }
	  
	  /**
	   * Depositar uma moeda
	   * 
	   * @param coin moeda depositada pelo usuario na Máquina
	   */
	  public void depositar(Moeda coin)
	  {
	    total = total.add(slot.reconhecer(coin));
	    
	    NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));

	    if(total.doubleValue() < price.doubleValue())
	    {
	      System.out.println("Falta R$ " + nf.format(price.subtract(total)));
	    }
	    else if(total.doubleValue() == price.doubleValue())
	    {
	      System.out.println("Obrigado pela sua preferência!");
	    }
	    else if(total.doubleValue() > price.doubleValue())
	    {
	      System.out.println("Obrigado pela sua preferência!");
	      System.out.println("Seu troco á de R$ " + nf.format(total.subtract(price)));
	    }
	  }
	
}
