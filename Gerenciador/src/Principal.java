import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cadastro_Jogador[] v= new Cadastro_Jogador[10];
		for(int i=0; i<10; i++) {
			v[i] = new Cadastro_Jogador();
		}
		
		Ingressos ing[] = new Ingressos[10];
		for(int i=0; i<10; i++) {
			ing[i] = new Ingressos();
		}
		
		
		
		int op = 0;
		
		while(op != 5) {
			System.out.println("------------Gerenciador de competições de EA sports------------");
			System.out.println("Menu: \n1-Cadastrar Jogador\n2-Ingressos\n3-Campeonato\n4-Patrocinio\n5-Sair\nOpcao: ");
			op = ler.nextInt();
			System.out.println(op);
			
			if(op == 1) {
				for(int i=0; i<10; i++) {
					System.out.println("Informe o nome do jogador: ");
					v[i].nome_jogador =  ler.next();
					System.out.println(v[i].nome_jogador);
				}
			}else if(op == 2) {
				for(int i=0; i<10; i++) {
					System.out.println("\n\nPreencha os dados referentes aos ingressos do " + (i+1) + "o evento: ");
					System.out.println("Nome do evento (do qual sera vendido o ingressos): ");
					ing[i].nome_evento = ler.next();
					System.out.println("Quantas entradas vip's vao ter? ");
					ing[i].quantidade_vip = ler.nextInt();
					System.out.println("Qual o valor dessas entradas (Vip) inteira: ");
					ing[i].valor_inteira_vip = ler.nextFloat();
					System.out.println("Qual o valor dessas entradas (Vip) meia: ");
					ing[i].valor_meia_vip = ler.nextFloat();
					System.out.println("Quantas entradas pistas vao ter");
					ing[i].quantidade_pista = ler.nextInt();
					System.out.println("Qual o valor dessas entradas (pistas) inteira: ");
					ing[i].valor_inteira_pista = ler.nextFloat();
					System.out.println("Qual o valor dessas entradas (pista) meia: ");
					ing[i].valor_meia_pista = ler.nextFloat();
					System.out.println("Range das arquibancadas vip (exemplo: 0 - 100, 50 - 250)");
					ing[i].range_arquibancadas_vip = ler.next();
					System.out.println("Range das arquibancadas pista (exemplo: 0/100, 50/250)");
					ing[i].range_arquibancadas_pista = ler.next();
					
					int aux;
					System.out.println("Deseja imprimir os dados? (1-sim, 2-nao): ");
					aux = ler.nextInt();
					if(aux == 1) {
						System.out.println(ing[i].dados_ingressos());
					}
				}
				
				
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
