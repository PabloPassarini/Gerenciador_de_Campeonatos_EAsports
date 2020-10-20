public class Lista_Patrocinio {


	private static patrocinio prim;

	public void criaLista_patrocinio(){
		prim = null;
	}


	public void add_patrocinio(double i,String  n){
		patrocinio novo = new patrocinio();
		novo.setValor_patrocinio(i);
		novo.setEmpresa_patrocinio(n);
		novo.setProx(prim);
		prim = novo;
	}


	public void print_patrocinio(){
		for(patrocinio n = prim; n != null; n = n.getProx()){
			System.out.println("Nome: "+n.getEmpresa_patrocinio());
			System.out.println("Contribuiçao: "+n.getvalor_patrocinio());
		}
	}


	public static  patrocinio search_patrocinio(String i){
		for(patrocinio n = prim; n != null; n = n.getProx()){
			if(n.getEmpresa_patrocinio().equals(i)){
				return n;
			}
		}
		return null;
	}    

	public void remove_patrocinio(String i){
		patrocinio anterior = null;
		patrocinio p = prim;
		while(p != null && p.getEmpresa_patrocinio() != i){
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
