import java.util.*;

public class Principal {
	public static void main(String[] args) {
		int op = -1,op_edit, cont_ing = 0, qtd_ing =10, aux;
		String aux_s;
		Scanner ler = new Scanner(System.in);
		Campeonato c = new Campeonato();
		
		
		//Vetor para a classe Ingressos
		Ingressos[] ing = new Ingressos[10];
		for(int i=0; i<10; i++) {
			ing[i] = new Ingressos();
		}
		
		
		
		while(op != 0) {
			System.out.println("*******************Menu*********************");
			System.out.println("1-Adicionar Jogador, 2-Comprar Ingresso,3-Campeonato,4-Patrocinio, 5-Edita Campeonato , 6-Editar ingresso");
			op = ler.nextInt();
			if(op == 1) {
				
				
				
				
			}else if(op == 2) {
				if(qtd_ing != 0) {
					int q1, q2;
					System.out.println("Temos apenas " + qtd_ing + " ");
					System.out.println("Digite o nome do comprador: ");
					ing[cont_ing].comprador = ler.next();
					System.out.println("Digite o cpf (somente os numeros): ");
					ing[cont_ing].cpf = ler.nextInt();
					System.out.println("Quantidade de ingressos inteira (0 para nenhum): ");
					q1 = ler.nextInt();
					ing[cont_ing].qtd_inteira = q1;
					System.out.println("Quantidade de ingresso meia (0 para meia): ");
					q2 = ler.nextInt();
					ing[cont_ing].qtd_meia = q2;
					ing[cont_ing].calculavalor(1, 30);
					ing[cont_ing].calculavalor(2, 15);
					ing[cont_ing].finalizar();
					System.out.println(ing[cont_ing].dados());
				}else {
					System.out.println("Ingressos exgotados");
				}		
			}else if(op == 3) {
				String a, b, c1;
				float d;
				System.out.println("Digite o nome do evento: ");
				a = ler.next();
				System.out.println("Digite o narrador: ");
				b = ler.next();
				System.out.println("Digite o local: ");
				c1 = ler.next();
				System.out.println("Digite o valor do premio: ");
				d = ler.nextFloat();
				
				
			}else if(op == 4) {
				
			
			
			
			
			}else if(op == 5) {
				System.out.println("Procurar campeonato, digite o nome do evento: ");
				String n = ler.next();	
				
				
				
			}else if(op == 6) {
				System.out.println("Procurar ingresso, digite o cpf: ");
				aux = ler.nextInt();
				int pos = -1;
				for(int i=0; i<10; i++) {
					if(ing[i].getCpf() == aux) {
						pos = i;
						System.out.println(ing[i].getComprador());
						break;
					}
				}
				
				if(pos != -1) {
				while(true){
					
						op_edit = 0;
						System.out.println("Editar:\n1-Nome comprador, 2-Quantidade ingressos inteira, 3-Quantidade ingresso meia, 4-Imprimir dados, 5-Sair");
						op_edit = ler.nextInt();
						if(op_edit == 1) {
							System.out.println("Novo nome: ");
							aux_s = ler.next();
							ing[pos].setComprador(aux_s);
						}else if(op_edit == 2) {
							System.out.println("Quantiade ingressos inteira: ");
							aux = ler.nextInt();
							ing[pos].setQtd_inteira(aux);
						}else if(op_edit == 3) {
							System.out.println("Quantiade ingressos meia: ");
							aux = ler.nextInt();
							ing[pos].setQtd_meia(aux);
						}else if(op_edit == 4) {
							System.out.println(ing[pos].dados());
						}else if(op_edit == 5) {
							break;
						}
					}
					
				}else {
					System.out.println("Ingresso não encontrado! ");
				}
				
			}else if(op == 7) {
				
				
			}
		}
	}
}

