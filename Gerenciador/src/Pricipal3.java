import java.util.Scanner;

public class Pricipal3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int op = -1;
		int aux=0;
		Lista_jogador l_j = new Lista_jogador();
		l_j.criaLista_jogador();
		
	
		while(op != 0) {
			System.out.println("------------Gerenciador de competições de EA sports 2------------");
			System.out.println("Menu: \n1-Cadastrar Jogador\n2-Ingressos\n3-Campeonato\n4-Patrocinio\n5-Editar\n6-Sair\nOpcao: ");
			op = ler.nextInt();
			
			if(op == 1) {
				String n,c,e;
				int i;
				System.out.println("Digite o nome do jogador: ");
				n=ler.next();
				System.out.println("Digite a idade do jogador:");
				i=ler.nextInt();
				System.out.println("Digite o CPF do jogador: ");
				c=ler.next();
				System.out.println("Digite o nome da equipe: ");
				e=ler.next();
				l_j.add_jogador(n,i,c,e);
			}else if(op == 2) {
				
					
				
				
				
				
				
				
				
			}else if(op == 3) {
				
				
				
				
				
				
				
				
				
				
			}
			else if(op == 4) {
				System.out.println("Qual classe você deseja alterar? (1-Cadastro jogador, 2-Ingresso, 3-Campeonator, 4-Patrocinio, 5-Sair)");
				aux = ler.nextInt()
				if(aux == 5) {
					break;
				}else if(aux == 1) {
					System.out.println("O que vc deseja? (1-");
				}
			}
			
			
			
			
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	}
}
	
