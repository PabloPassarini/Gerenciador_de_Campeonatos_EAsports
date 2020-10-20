import java.util.Scanner;
public class Equipe {
	String nome_equipe;

	String nome_jogador,CPF_jogador;
	int idade_jogador;

	//Scanner ler = new Scanner(System.in);

	public String dados_jogadores() {
		String dados = "\n Nome do jogador: " + this.nome_jogador;
		dados+= "\nCPF: " + this.CPF_jogador;
		return dados;
	}

	private Equipe prox;


	public String getnome_equipe() {
		return nome_equipe;
	}
	public void setnome_equipe(String info) {
		this.nome_equipe = info;
	}

	public String getnome_jogador() {
		return nome_jogador;
	}
	public void setnome_jogador(String info) {
		this.nome_jogador = info;
	}

	public String getCPF_jogador() {
		return CPF_jogador;
	}
	public void setCPF_jogador(String info) {
		this.CPF_jogador = info;
	}



	public Equipe getProx() {
		return prox;
	}
	public void setProx(Equipe prox) {
		this.prox = prox;
	}

}
