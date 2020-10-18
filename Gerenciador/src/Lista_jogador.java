public class Lista_jogador { // Esboço
	private Cadastro_Jogador prim;


	public void criaLista_jogaodr(){//Cria uma lista
		prim = null;
	}

	public void add_jogador(String n,int i,String c,String e){//adiciona elemento na lista
		Cadastro_Jogador novo = new Cadastro_Jogador();
		novo.setInfo(n,i,c,e);
		novo.setProx(prim);
		prim = novo;
	}

	public void print_jogador(){ //imprime lista
		for(Cadastro_Jogador n = prim; n != null; n = n.getProx()){
			n.dados_jogadores();
			System.out.println("\n");
		}
	}

	public boolean isEmpty_jogador(){ // verificar se lista esta fazia
		if(prim == null)
			return true;
		else
			return false;
	}

	public Cadastro_Jogador search_jogador_nome(String n){//Procurar na lista pelo nome
		for(Cadastro_Jogador i = prim; i != null; i = i.getProx()){
			if(i.getInfo_nome_jogador()==n){
				return i;
			}
		}
		return null; 
	}

	public Cadastro_Jogador search_jogador_CPF(String n){//Procurar na lista pelo CPF
		for(Cadastro_Jogador i = prim; i != null; i = i.getProx()){
			if(i.getInfo_CPF_jogador()==n){
				return i;
			}
		}
		return null; 
	}

	public void remove_jogador_nome(String n){ //Remover elemento conforme o nome
		Cadastro_Jogador anterior = null;
		Cadastro_Jogador p = prim;
		while(p != null && p.getInfo_nome_jogador() != n){
			anterior = p;
			p = p.getProx();
		}
		if(p == null){
			return;
		}
		if(anterior == null){
			prim = p.getProx();
		}
		else{
			anterior.setProx(p.getProx());
		}
	}
public void remove_jogador_CPF(String n){ //Remover elemento conforme o CPF
	Cadastro_Jogador anterior = null;
	Cadastro_Jogador p = prim;
	while(p != null && p.getInfo_CPF_jogador() != n){
		anterior = p;
		p = p.getProx();
	}
	if(p == null){
		return;
	}
	if(anterior == null){
		prim = p.getProx();
	}else{
		anterior.setProx(p.getProx());
	}
}
}

