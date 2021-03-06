package br.com.minic.elementos;

public class ComandoIf implements IComando {
	
	// Atributos
	
	IExpressao expRelacional;
	IComando codIF;
	private boolean isEntreParenteses;

	// Construtor
	
	public ComandoIf(IExpressao expRelacional, IComando codIF) {
		setExpRelacional(expRelacional);
		setCodIF(codIF);
	}
	
	// M�todos Acessores e Modificadores
	
	public void setEntreParenteses(boolean isEntreParenteses) {
        this.isEntreParenteses = isEntreParenteses;
    }
	
	
	public IExpressao getExpRelacional() {
		return expRelacional;
	}

	public void setExpRelacional(IExpressao expRelacional) {
		this.expRelacional = expRelacional;
	}

	public IComando getCodIF() {
		return codIF;
	}

	public void setCodIF(IComando codIF) {
		this.codIF = codIF;
	}
	
	// M�todo toString
	
	public String toString() {
		StringBuilder comandoif = new StringBuilder();
		
		comandoif.append("if (" + this.getExpRelacional() + ") \n");
		comandoif.append("  " + this.getCodIF() + ";");
		
	    return comandoif.toString();
	}


}
