
public class Patrocinio {
double valor;
int nivelpatrocinio;
String Empresa;
String dados_Patrocinio() {
	String dados = "\nEmpresa: " +this.Empresa;
	dados+= "\nContribuiu com um valor de: " + this.valor;
	dados+= "\nNivel de patrocinio: " + this.nivelpatrocinio;
	return dados;
}

}
