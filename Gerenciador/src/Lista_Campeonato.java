import java.util.*;

public class Lista_Campeonato {
	int qtdElementos;
	Campeonato primeiro, ultimo;
	Scanner ler = new Scanner(System.in);
	
	public Lista_Campeonato() {
		this.qtdElementos = 0;
		this.primeiro = null;
		this.ultimo = null;
	}
	
	
	
	public void InserirComeco(String nome, String local, String narrador, float premio) {
		if(this.qtdElementos == 0) {
			//Lista vazia
			Campeonato novo = new Campeonato();
			novo.setNome_evento(nome);
			novo.setLocal(local);
			novo.setNarrador(narrador);
			novo.setPremio(premio);
			novo.setProx(primeiro);
			this.primeiro = novo;
			
		}else {
			Campeonato novo2 = new Campeonato();
			novo2.setNome_evento(nome);
			novo2.setLocal(local);
			novo2.setNarrador(narrador);
			novo2.setPremio(premio);
			novo2.setProx(primeiro);
			this.primeiro = novo2;
		}
		this.qtdElementos++;
	}
	
	
	
	
	public void pesquisaElemento(String nome) {
		Campeonato aux = this.primeiro;
		while(aux.getProx() != null) {
			if(aux.nome_evento == nome) {
				System.out.println("Evento encontrado: "+nome);
				System.out.println("O que voce quer editar? (1-Nome do evento, 2-Local, 3-narrador, 4-premio, 5-sair");
				int op = ler.nextInt();
				if(op == 1) {
					System.out.println("Novo Nome: ");
					String n = ler.next();
					aux.setNome_evento(n);
				}else if(op == 2) {
					System.out.println("Nome do local: ");
					String n = ler.next();
					aux.setLocal(n);
				}else if(op == 3) {
					System.out.println("Narrador: ");
					String n = ler.next();
					aux.setNarrador(n);
				}else if(op == 4) {
					System.out.println("Premio:");
					float n = ler.nextFloat();
					aux.setPremio(n);
				}else {
					System.out.println("Tchau");
				}

			}else {
				System.out.println("Nota não encontrada!");
			}
			aux = aux.getProx();
			
		}
	}
}
