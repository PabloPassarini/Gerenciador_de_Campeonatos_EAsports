
public class Campeonato {
	String nome_evento;
	float premio;
	String local;
	String narrador;
	public Campeonato prox;
	
	
	
	public String getNome_evento() {
		return nome_evento;
	}



	public void setNome_evento(String nome_evento) {
		this.nome_evento = nome_evento;
	}



	public float getPremio() {
		return premio;
	}



	public void setPremio(float premio) {
		this.premio = premio;
	}



	public String getLocal() {
		return local;
	}



	public void setLocal(String local) {
		this.local = local;
	}



	public String getNarrador() {
		return narrador;
	}



	public void setNarrador(String narrador) {
		this.narrador = narrador;
	}



	public Campeonato getProx() {
		return prox;
	}



	public void setProx(Campeonato prox) {
		this.prox = prox;
	}



	public String dados_Campeonato() {
		String dados = "\n\nNome do Evento: " + this.nome_evento;
		dados += "\nPremio R$" + this.premio;
		dados += "\nLocal: " + this.local;
		dados += "\nNarrador 1: " + this.narrador;
		return dados;
	}
}
