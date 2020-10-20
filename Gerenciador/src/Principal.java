import java.util.Scanner;
public class Principal {

/*	public static void main(String[] args) {
		int aux=0;
		 Scanner ler = new Scanner(System.in);



		 Lista_Patrocinio lista = new Lista_Patrocinio();
		 lista.criaLista_patrocinio();

		while(aux!=5)
		{
			System.out.println("1->Add;2->Print;3->Search;4->Remove;5->Exit");
			aux=ler.nextInt();
			if(aux==1)
			{
				String aa="tomaz";
				String bb="pablo";
				lista.add_patrocinio(2000,aa);
				lista.add_patrocinio(500,bb);
			}
			if(aux==2)
			{
				lista.print_patrocinio();
			}
			if(aux==3)//Funciona
			{
				String aa="tomaz";
				patrocinio x=Lista_Patrocinio.search_patrocinio(aa);
				System.out.println(x.getEmpresa_patrocinio());
				System.out.println(x.getvalor_patrocinio());
		}
			if(aux==4)
			{
				String bb="pablo";
				lista.remove_patrocinio(bb);
			}
	}
		}
	}*/


	public static void main(String[] args) {
		int aux=0;
		Scanner ler = new Scanner(System.in);



		Lista_Patrocinio lista = new Lista_Patrocinio();
		lista.criaLista_patrocinio();
		while(aux!=5)
		{
			System.out.println("1->Add;2->Print;3->Search;4->Remove;5->Exit");
			aux=ler.nextInt();
			if(aux==1)
			{
				String bb;
				double aa;
				System.out.println("Digite o nome da Empresa");
				bb=ler.next();
				System.out.println("Digite o valor contribuido pela empresa");
				aa=ler.nextDouble();
				lista.add_patrocinio(aa,bb);
			}
			if(aux==2)
			{
				lista.print_patrocinio();
			}
			if(aux==3)//nao funciona
			{
				String  aa;
				System.out.println("Digite o nome da Empresa");
				aa=ler.next();
				System.out.println(lista.search_patrocinio(aa).getvalor_patrocinio());
			}
			if(aux==4)//nao funciona
			{
				String bb;
				System.out.println("Digite o nome da empresa que deseje remover");
				bb=ler.next();
				lista.remove_patrocinio(bb);
			}
		}
	}
}
