import java.util.Scanner;
public class Princial2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int op = 0, cont_ing=0;
		Ingressos ing[] = new Ingressos[10];
		for(int i=0; i<10; i++) {
			ing[i] = new Ingressos();
		}
          Lista_jogador list_jogador= new Lista_jogador();
          Lista_jogador.criaLista_jogador();
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
				list_jogador.search_jogador_nome(n);
			}
			if(op==4) {
				String n;
				System.out.println("nome");
				n=ler.next();
				list_jogador.remove_jogador_nome(n);
		}
		
		while(op != 6) {
			System.out.println("------------Gerenciador de competições de EA sports 2------------");
			System.out.println("Menu: \n1-Cadastrar Jogador\n2-Ingressos\n3-Campeonato\n4-Patrocinio\n5-Editar\n6-Sair\nOpcao: ");
			op = ler.nextInt();
			System.out.println(op);
			if(op == 2) {
				System.out.println("\n\nPreencha os dados referentes aos ingressos do " + (cont_ing+1) + "o evento: ");
				System.out.println("Nome do evento (do qual sera vendido o ingressos): ");
				ing[cont_ing].nome_evento = ler.next();
				System.out.println("Quantas entradas vip's vao ter? ");
				ing[cont_ing].quantidade_vip = ler.nextInt();
				System.out.println("Qual o valor dessas entradas (Vip) inteira: ");
				ing[cont_ing].valor_inteira_vip = ler.nextFloat();
				System.out.println("Qual o valor dessas entradas (Vip) meia: ");
				ing[cont_ing].valor_meia_vip = ler.nextFloat();
				System.out.println("Quantas entradas pistas vao ter");
				ing[cont_ing].quantidade_pista = ler.nextInt();
				System.out.println("Qual o valor dessas entradas (pistas) inteira: ");
				ing[cont_ing].valor_inteira_pista = ler.nextFloat();
				System.out.println("Qual o valor dessas entradas (pista) meia: ");
				ing[cont_ing].valor_meia_pista = ler.nextFloat();
				System.out.println("Range das arquibancadas vip (exemplo: 0 - 100, 50 - 250)");
				ing[cont_ing].range_arquibancadas_vip = ler.next();
				System.out.println("Range das arquibancadas pista (exemplo: 0/100, 50/250)");
				ing[cont_ing].range_arquibancadas_pista = ler.next();
				
				int aux;
				System.out.println("Deseja imprimir os dados? (1-sim, 2-nao): ");
				aux = ler.nextInt();
				if(aux == 1) {
					System.out.println(ing[cont_ing].dados_ingressos());
				}
								
				cont_ing++;
			}
			else if(op ==5) {
				int op_edit;
				System.out.println("Deseja editar? \n1-Cadastrar Jogador\n2-Ingressos\n3-Campeonato\n4-Patrocinio");
				op_edit = ler.nextInt();
				
				if(op == 2) {
					while(true) {
						System.out.println("O que quer mudar? 1-Nome do evento");
						
					}
				}
			}
		
	}

			}

	}
}
