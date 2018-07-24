package exceptions;

public class CustomExceptions extends Exception {
		    private String msg;
		    public CustomExceptions(String msg){
		      super(msg);
		      this.msg = msg;
		    }
		    public String getMessage(){
		      return msg;
		    }
		  }
		  public class NomeInvalidoException extends CustomExceptions{
		    /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public NomeInvalidoException(){
		      super("Nome inválido!");
		    }
		  }
		  public class SemDadosSuficientesException extends CustomExceptions{
		    /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public SemDadosSuficientesException(){
		      super("O programa não recebeu dados o suficiente para executar");
		    }

}