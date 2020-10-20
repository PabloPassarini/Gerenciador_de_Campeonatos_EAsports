import java.util.Scanner;
public class testes {

	public static void main(String[] args) {
		int aux=0;
		Scanner ler = new Scanner(System.in);



		Lista_equipe lista = new Lista_equipe();
		lista.criaLista_equipe();

		while(aux!=5)
		{
			System.out.println("1->Add; 2->Print; 3->Search; 4->Remove; 5->Exit");
			aux=ler.nextInt();
			if(aux==1)
			{
				String aa="tomaz";//adiciona equipe com o nome tomaz
				String bb="pablo";//adiciona equipe com o nome pablo
				
				
				lista.add_equipe(aa);
				lista.add_equipe(bb);
			}
			if(aux==2)
			{
				lista.print_equipe();
			}
			if(aux==3)
			{
				String aa="tomaz";//procura equipe com o nome tomaz
				Equipe x=lista.search_equipe(aa);
				System.out.println(x.getnome_equipe());
			}
			if(aux==4)
			{
				String bb="pablo"; // remove equipe com o nome pablo
				lista.remove_equipe(bb);
			}
			}
		}
	}