public class Lista_jogador { // Esboço
	private static Cadastro_Jogador prim_jogador;


	public static void criaLista_jogaodr(){//Cria uma lista
		prim_jogador = null;
	}

	public static void add_jogador(String n,int i,String c,String e){//adiciona elemento na lista
		Cadastro_Jogador novo = new Cadastro_Jogador();
		novo.setInfo_jogador(n,i,c,e);
		novo.setProx_jogador(prim_jogador);
		prim_jogador = novo;
	}

	public static void print_jogador(){ //imprime lista
		for(Cadastro_Jogador n = prim_jogador; n != null; n = n.getProx_jogador()){
			System.out.println(n.dados_jogadores()+"\n");
		}
	}

	public static  boolean isEmpty_jogador(){ // verificar se lista esta fazia
		if(prim_jogador == null)
			return true;
		else
			return false;
	}

	public static String search_jogador_nome(String n){//Procurar na lista pelo nome
		for(Cadastro_Jogador i = prim_jogador; i != null; i = i.getProx_jogador()){
			if(i.getInfo_nome_jogador()==n){
				return i.dados_jogadores();
			}
		}
		return null; 
	}

	public static String search_jogador_CPF(String n){//Procurar na lista pelo CPF
		for(Cadastro_Jogador i = prim_jogador; i != null; i = i.getProx_jogador()){
			if(i.getInfo_CPF_jogador()==n){
				return i.dados_jogadores();
			}
		}
		return null; 
	}

	public static void remove_jogador_nome(String n){ //Remover elemento conforme o nome
		Cadastro_Jogador anterior = null;
		Cadastro_Jogador p = prim_jogador;
		while(p != null && p.getInfo_nome_jogador() != n){
			anterior = p;
			p = p.getProx_jogador();
		}
		if(p == null){
			return;
		}
		if(anterior == null){
			prim_jogador = p.getProx_jogador();
		}
		else{
			anterior.setProx_jogador(p.getProx_jogador());
		}
	}
public static void remove_jogador_CPF(String n){ //Remover elemento conforme o CPF
	Cadastro_Jogador anterior = null;
	Cadastro_Jogador p = prim_jogador;
	while(p != null && p.getInfo_CPF_jogador() != n){
		anterior = p;
		p = p.getProx_jogador();
	}
	if(p == null){
		return;
	}
	if(anterior == null){
		prim_jogador = p.getProx_jogador();
	}else{
		anterior.setProx_jogador(p.getProx_jogador());
	}
}
}

