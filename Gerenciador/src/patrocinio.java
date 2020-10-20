
public class patrocinio {
	double valor_patrocinio;
	String Empresa_patrocinio;
	private patrocinio prox;


	//Valor_patrocinio
	public double getvalor_patrocinio() {
		return valor_patrocinio;
	}
	public void setValor_patrocinio(double a) {
		this.valor_patrocinio = a;
	}


	//Empresa_patrocinio
	public String getEmpresa_patrocinio() {
		return Empresa_patrocinio;
	}
	public void setEmpresa_patrocinio(String a) {
		this.Empresa_patrocinio = a;
	}



	public patrocinio getProx() {
		return prox;
	}
	public void setProx(patrocinio prox) {
		this.prox = prox;
	}



	String dados_patrocinio() {
		String dados = "\nEmpresa: " +this.Empresa_patrocinio;
		dados+= "\nContribuiu com um valor de: " + this.valor_patrocinio;
		return dados;
	}

}

