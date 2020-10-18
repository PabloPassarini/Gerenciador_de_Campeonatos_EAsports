
public class patrocinio {
double valor_patrocinio;
int nivel_patrocinio;
String Empresa_patrocinio;
String dados_patrocinio() {
	String dados = "\nEmpresa: " +this.Empresa_patrocinio;
	dados+= "\nContribuiu com um valor de: " + this.valor_patrocinio;
	dados+= "\nNivel de patrocinio: " + this.nivel_patrocinio;
	return dados;
}

private patrocinio prox_patrocinio;

public double getInfo_valor_patrocinio() {
	return valor_patrocinio;
}
public int getInfo_nivel_patrocinio() {
	return nivel_patrocinio;
}
public String getInfo_Empresa_patrocinio() {
	return Empresa_patrocinio;
}
public void setInfo_patrocinio(String Empresa_patrocinio,int nivel_patrocinio,double valor_patrocinio) {
	this.Empresa_patrocinio = Empresa_patrocinio;
	this.nivel_patrocinio =nivel_patrocinio;
	this.valor_patrocinio = valor_patrocinio;
}
public patrocinio getProx_patrocinio() {
	return prox_patrocinio;
}
public void setProx_patrocinio(patrocinio prox) {
	this.prox_patrocinio = prox;
}
}

