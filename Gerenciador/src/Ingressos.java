
public class Ingressos {
<<<<<<< HEAD
	float valor_inteira_vip, valor_inteira_pista, valor_meia_vip, valor_meia_pista;
	int quantidade_pista, quantidade_vip;
	String range_arquibancadas_vip, range_arquibancadas_pista; // exemplo: da poltrona 1 ate a 100 é vip
	
	String dados_ingressos() {
		String dados = "\n\nQuantidade de ingressos vip: " + this.quantidade_vip + " || Quantidade de ingressos pista: " + this.quantidade_pista;
		dados += "\nPreco inteira vip R$" +this.valor_inteira_vip + " || Preco meia vip R$" + this.valor_meia_vip;
		dados += "\nPreco inteira pista R$" +this.valor_inteira_pista + "|| Preco meia pista R$" +this.valor_meia_pista;
		dados += "\nRange arquibancadas vip: " + this.range_arquibancadas_vip;
		dados += "\nRange arquibancadas pista: " + this.range_arquibancadas_pista;
		return dados;
	}
	
	
=======
	String apresentador;
	String narrador1, narrador2;
>>>>>>> branch 'master' of https://github.com/PabloPassarini/Gerenciador_de_Campeonatos_EAsports.git
	
}
