import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cadastro_Jogador[] v= new Cadastro_Jogador[10];
		for(int i=0; i<10; i++) {
			v[i] = new Cadastro_Jogador();
		}
		
		
		for(int i=0; i<10; i++) {
			System.out.println("Informe o nome do jogador: ");
			v[i].nome_jogador =  ler.next();
			System.out.println(v[i].nome_jogador);
		}
		
		
	}
}
