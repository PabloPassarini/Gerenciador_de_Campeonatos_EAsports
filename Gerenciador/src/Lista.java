public class Lista {
	private Nodo prim;


	public void criaLista(){//Cria uma lista
		prim = null;
	}

	public void add(int i){//adiciona elemento na lista
		Nodo novo = new Nodo();
		novo.setInfo(i);
		novo.setProx(prim);
		prim = novo;
	}

	public void print(){ //imprime lista
		for(Nodo n = prim; n != null; n = n.getProx()){
			System.out.println(n.getInfo());
		}
	}

	public boolean isEmpty(){ // verificar se lista esta fazia
		if(prim == null)
			return true;
		else
			return false;
	}

	public Nodo search(int i){//Procurar na lista
		for(Nodo n = prim; n != null; n = n.getProx()){
			if(n.getInfo()==i){
				return n;
			}
		}
		return null; 
	}
	
	public void remove(int i){ //Remover elemento
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

