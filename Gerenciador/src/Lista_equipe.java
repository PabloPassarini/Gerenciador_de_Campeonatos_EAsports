
public class Lista_equipe {

	private  Equipe prim;



	public void criaLista_equipe(){
		prim = null;
	}



	public void add_equipe(String ne){
		Equipe novo = new Equipe();
		novo.setnome_equipe(ne);
		novo.setProx(prim);
		prim = novo;
	}



	public void print_equipe(){
		for(Equipe n = prim; n != null; n = n.getProx()){
			System.out.println(n.getnome_equipe());
		}
	}



	public Equipe search_equipe(String i){
		for(Equipe n = prim; n != null; n = n.getProx()){
			if(n.getnome_equipe()==i){
				return n;
			}
		}
		return null;
	}


	public void remove_equipe(String i){
		Equipe anterior = null;
		Equipe p = prim;

		while(p != null && p.getnome_equipe() != i){
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
}
