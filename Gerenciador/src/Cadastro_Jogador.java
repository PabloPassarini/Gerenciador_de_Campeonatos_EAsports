
public class Cadastro_Jogador {
	String nome_jogador,CPF_jogador, equipe_jogador;
	String funcao, morador;
	int idade_jogador;
	public String dados_jogadores() {
		String dados = "\n Nome do jogador: " + this.nome_jogador;
		dados+= "\nCPF: " + this.CPF_jogador;
		dados+= "\nEquipe: " + this.equipe_jogador;
		dados+= "\nFuncao: " + this.funcao;
		dados+= "\nMorador da cidade; " +this.morador;
		return dados;
	}
}
