
public class Principal {

	public static void main(String[] args) {
		
		Cadastro_Jogador[] v = new Cadastro_Jogador[10];
		for(int i=0; i<10; i++) {
			v[i] = new Cadastro_Jogador();
		}
		v[0].nome = "Tomazzz";
		v[0].dados();
	}

}
