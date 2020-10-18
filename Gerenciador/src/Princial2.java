import java.util.Scanner;
public class Princial2 {

	public static void main(String[] args) {
		/*Scanner ler = new Scanner(System.in);


		int contador_ingressos = 0;



		Ingressos[] ing = new Ingressos[10];
		for(int i=0; i<10; i++) {
			ing[i] = new Ingressos();
		}*/
		Scanner ler = new Scanner(System.in);
		int op = 0;
		Lista_jogador.criaLista_jogaodr();
          Lista_jogador list_jogador= new Lista_jogador();
		while(op != 5) {
			System.out.println("------------Gerenciador de competições de EA sports------------");
			System.out.println("Menu: \n1-Cadastrar Jogador\n2-lista de jogadores\n3-procurar jogador \n4-remover\n5-Sair\nOpcao: ");
			op = ler.nextInt();
			System.out.println(op);
			if(op==1) {
				String n,c,e;
				int i;
				System.out.println("nome");
				n=ler.next();
				System.out.println("idade");
				i=ler.nextInt();
				System.out.println("CPF");
				c=ler.next();
				System.out.println("equipe");
				e=ler.next();
				list_jogador.add_jogador(n,i,c,e);
			}
			if(op==2)
				list_jogador.print_jogador();
			if(op==3) {
				String n;
				System.out.println("nome");
				n=ler.next();
				System.out.println(list_jogador.search_jogador_nome(n));
			}
			if(op==4) {
				String n;
				System.out.println("nome");
				n=ler.next();
				list_jogador.remove_jogador_nome(n);

			}

		}

	}		
}
