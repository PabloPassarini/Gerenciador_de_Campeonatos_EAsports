public class Lista_jogador { // Esboço
	private Nodo prim;


	public void criaLista_jogaodr(){//Cria uma lista
		prim = null;
	}

	public void add_jogador(int i){//adiciona elemento na lista
		Nodo novo = new Nodo();
		novo.setInfo(i);
		novo.setProx(prim);
		prim = novo;
	}

	public void print_jogador(){ //imprime lista
		for(Nodo n = prim; n != null; n = n.getProx()){
			System.out.println(n.getInfo());
		}
	}

	public boolean isEmpty_jogador(){ // verificar se lista esta fazia
		if(prim == null)
			return true;
		else
			return false;
	}

	public Nodo search_jogador(int i){//Procurar na lista
		for(Nodo n = prim; n != null; n = n.getProx()){
			if(n.getInfo()==i){
				return n;
			}
		}
		return null; 
	}
	
	public void remove_jogador(int i){ //Remover elemento
		Nodo anterior = null;
		Nodo p = prim;
		while(p != null && p.getInfo() != i){
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

