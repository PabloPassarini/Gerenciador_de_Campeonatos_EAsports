
public class Cadastro_Jogador {
	String nome_jogador,CPF_jogador, equipe_jogador;
	//String funcao, morador;
	int idade_jogador;
	String dados_jogadores() {
		String dados = "\n Nome do jogador; " + this.nome_jogador;
		dados+= "\nCPF: " + this.CPF_jogador;
		dados+= "\nEquipe: " + this.equipe_jogador;
		//dados+= "\nFuncao: " + this.funcao;
		//dados+= "\nMorador da cidade; " +this.morador;
		return dados;
	}
	private Cadastro_Jogador prox;

	public String getInfo_nome_jogador() {
		return nome_jogador;
	}
	public int getInfo_idade_jogador() {
		return idade_jogador;
	}
	public String getInfo_CPF_jogador() {
		return CPF_jogador;
	}
	public String getInfo_equipe_jogador() {
		return equipe_jogador;
	}
	public void setInfo(String nome_jogador,int idade_jogador,String CPF_jogador,String equipe_jogador) {
		this.nome_jogador = nome_jogador;
		this.idade_jogador = idade_jogador;
		this.CPF_jogador = CPF_jogador;
		this.equipe_jogador = equipe_jogador;
	}
	public Cadastro_Jogador getProx() {
		return prox;
	}
	public void setProx(Cadastro_Jogador prox) {
		this.prox = prox;
	}
}
