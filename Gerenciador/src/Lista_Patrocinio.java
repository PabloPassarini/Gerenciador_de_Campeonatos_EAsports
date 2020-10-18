
public class Lista_Patrocinio {
	private patrocinio prim_patrocinio;


	public void criaLista_patrocinio(){//Cria uma lista
		prim_patrocinio = null;
	}

	public void add_patrocinio(String e,int n,double v){//adiciona elemento na lista
		patrocinio novo = new patrocinio();
		novo.setInfo_patrocinio(e,n,v);
		novo.setProx_patrocinio(prim_patrocinio);
		prim_patrocinio = novo;
	}

	public void print_patrocinio(){ //imprime lista
		for(patrocinio n = prim_patrocinio; n != null; n = n.getProx_patrocinio()){
			n.dados_patrocinio();
			System.out.println("\n");
		}
	}

	public boolean isEmpty_patrocinio(){ // verificar se lista esta fazia
		if(prim_patrocinio == null)
			return true;
		else
			return false;
	}

	public patrocinio search_patrocinio_nome(String n){//Procurar na lista pela empresa
		for(patrocinio i = prim_patrocinio; i != null; i = i.getProx_patrocinio()){
			if(i.getInfo_Empresa_patrocinio()==n){
				return i;
			}
		}
		return null; 
	}

	public void remove_patrocinio(String n){ //Remover elemento conforme o nome da empresa
		patrocinio anterior = null;
		patrocinio p = prim_patrocinio;
		while(p != null && p.getInfo_Empresa_patrocinio() != n){
			anterior = p;
			p = p.getProx_patrocinio();
		}
		if(p == null){
			return;
		}
		if(anterior == null){
			prim_patrocinio = p.getProx_patrocinio();
		}
		else{
			anterior.setProx_patrocinio(p.getProx_patrocinio());
		}
	}
}
