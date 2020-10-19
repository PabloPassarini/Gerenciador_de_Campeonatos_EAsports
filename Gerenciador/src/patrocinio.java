
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
}

