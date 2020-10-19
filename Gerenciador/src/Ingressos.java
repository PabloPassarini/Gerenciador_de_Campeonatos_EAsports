
public class Ingressos {
	String comprador;
	int cpf, qtd_inteira, qtd_meia;
	float valor_meias, valor_inteira, valor_total;
	
	
	
	public String getComprador() {
		return comprador;
	}
	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getQtd_inteira() {
		return qtd_inteira;
	}
	public void setQtd_inteira(int qtd_inteira) {
		this.qtd_inteira = qtd_inteira;
	}
	public int getQtd_meia() {
		return qtd_meia;
	}
	public void setQtd_meia(int qtd_meia) {
		this.qtd_meia = qtd_meia;
	}
	
	
	
	
	
	
	
	
	
	public void calculavalor(int tipo, float valor) {
		if(tipo == 1) { // 1 - Vip
			this.valor_inteira = this.qtd_inteira * valor;
		}
		if(tipo == 2){
			this.valor_meias = this.qtd_meia * valor;
		}
	}
	
	public void finalizar() {
		this.valor_total = this.valor_inteira + this.valor_meias;
	}
	public String dados() {
		String d = "\nComprador" + this.comprador;
		d += "\nCpf: " + this.cpf;
		d += "\nQuantidade de ingressos do tipo inteiro: " + this.qtd_inteira + " || Valor R$"+this.valor_inteira;
		d += "\nQuantidade de ingressos do tipo meia: " + this.qtd_meia+ " || Valor R$"+this.valor_meias;
		d +="\nValor total R$" + (this.valor_total);
		
		return d;
	}
	
	
	

}
