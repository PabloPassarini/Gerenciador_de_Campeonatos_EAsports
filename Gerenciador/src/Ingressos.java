
public class Ingressos {
	private String nome_evento;
	private float valor_inteira_vip, valor_inteira_pista, valor_meia_vip, valor_meia_pista;
	private int quantidade_pista, quantidade_vip;
	private String range_arquibancadas_vip, range_arquibancadas_pista; // exemplo: da poltrona 1 ate a 100 é vip
	
	public String getNome_evento() {
		return nome_evento;
	}
	public void setNome_evento(String nome_evento) {
		this.nome_evento = nome_evento;
	}
	public float getValor_inteira_vip() {
		return valor_inteira_vip;
	}
	public void setValor_inteira_vip(float valor_inteira_vip) {
		this.valor_inteira_vip = valor_inteira_vip;
	}
	public float getValor_inteira_pista() {
		return valor_inteira_pista;
	}
	public void setValor_inteira_pista(float valor_inteira_pista) {
		this.valor_inteira_pista = valor_inteira_pista;
	}
	public float getValor_meia_vip() {
		return valor_meia_vip;
	}
	public void setValor_meia_vip(float valor_meia_vip) {
		this.valor_meia_vip = valor_meia_vip;
	}
	public float getValor_meia_pista() {
		return valor_meia_pista;
	}
	public void setValor_meia_pista(float valor_meia_pista) {
		this.valor_meia_pista = valor_meia_pista;
	}
	public int getQuantidade_pista() {
		return quantidade_pista;
	}
	public void setQuantidade_pista(int quantidade_pista) {
		this.quantidade_pista = quantidade_pista;
	}
	public int getQuantidade_vip() {
		return quantidade_vip;
	}
	public void setQuantidade_vip(int quantidade_vip) {
		this.quantidade_vip = quantidade_vip;
	}
	public String getRange_arquibancadas_vip() {
		return range_arquibancadas_vip;
	}
	public void setRange_arquibancadas_vip(String range_arquibancadas_vip) {
		this.range_arquibancadas_vip = range_arquibancadas_vip;
	}
	public String getRange_arquibancadas_pista() {
		return range_arquibancadas_pista;
	}
	public void setRange_arquibancadas_pista(String range_arquibancadas_pista) {
		this.range_arquibancadas_pista = range_arquibancadas_pista;
	}
	public String getApresentador() {
		return apresentador;
	}
	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}
	public String getNarrador1() {
		return narrador1;
	}
	public void setNarrador1(String narrador1) {
		this.narrador1 = narrador1;
	}
	public String getNarrador2() {
		return narrador2;
	}
	public void setNarrador2(String narrador2) {
		this.narrador2 = narrador2;
	}
	
	
	
	public String dados_ingressos() {
		String dados = "\n\nQuantidade de ingressos vip: " + this.quantidade_vip + " || Quantidade de ingressos pista: " + this.quantidade_pista;
		dados += "\nPreco inteira vip R$" +this.valor_inteira_vip + " || Preco meia vip R$" + this.valor_meia_vip;
		dados += "\nPreco inteira pista R$" +this.valor_inteira_pista + "|| Preco meia pista R$" +this.valor_meia_pista;
		dados += "\nRange arquibancadas vip: " + this.range_arquibancadas_vip;
		dados += "\nRange arquibancadas pista: " + this.range_arquibancadas_pista;
		return dados;
	}
	String apresentador;
	String narrador1, narrador2;

}
