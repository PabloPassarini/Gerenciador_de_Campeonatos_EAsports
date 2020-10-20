import java.util.Scanner;
public class Equipe {
	String nome_equipe;


	//Scanner ler = new Scanner(System.in);

	/*public String dados_jogadores() {
		String dados = "\n Nome do jogador: " + this.nome_jogador;
		dados+= "\nCPF: " + this.CPF_jogador;
		return dados;
	}*/

	private Equipe prox;

	public String getNome_equipe() {
		return nome_equipe;
	}
	public void setNome_equipe(String nome_equipe) {
		this.nome_equipe = nome_equipe;
	}

	public String getnome_equipe() {
		return nome_equipe;
	}
	public void setnome_equipe(String info) {
		this.nome_equipe = info;
	}


	public Equipe getProx() {
		return prox;
	}
	public void setProx(Equipe prox) {
		this.prox = prox;
	}

}
