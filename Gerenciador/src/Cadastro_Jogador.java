
public class Cadastro_Jogador {
	public String nome;
	String nome_jogador,CPF, equipe, funcao, morador;
	int idade;
	String dados_jogadores() {
		String dados = "\n Nome do jogador; " + this.nome_jogador;
		dados+= "\nCPF: " + this.CPF;
		dados+= "\nEquipe: " + this.equipe;
		dados+= "\nFuncao: " + this.funcao;
		dados+= "\nMorador da cidade; " +this.morador;
		return dados;
	}
}
