
public class Campeonato {
	String nome_evento;
	String data_inicial, data_final;
	int quantidade_equipes;
	float premio;
	String local;
	String narrador1, narrador2;
	public String dados_Campeonato() {
		String dados = "\n\nNome do Evento: " + this.nome_evento;
		dados += "\nData inicial: " + this.data_inicial + " || Data final: " + this.data_final;
		dados += "\nQuantidade de equipes: " + this.quantidade_equipes;
		dados += "\nPremio R$" + this.premio;
		dados += "\nLocal: " + this.local;
		dados += "\nNarrador 1: " + this.narrador1 + " || Narrador 2: " + this.narrador2;
		return dados;
	}

	int limite_equipe;
	String nome_equipe;
	private Campeonato prox;

	//limite equipe
	public int getlimite_equipe() {
		return limite_equipe;
	}
	public void setlimite_equipe(int x) {
		this.limite_equipe = x;
	}

	public Campeonato getProx() {
		return prox;
	}
	public void setProx(Campeonato prox) {
		this.prox = prox;
	}
}
