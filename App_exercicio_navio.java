package exercicio_navio;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException; 
import java.util.List;
import java.util.ArrayList;

public class App_exercicio_navio {

	static Scanner ler = new Scanner(System.in);
	static List<Viagem> listaViagem = new ArrayList<Viagem>();
	static List<Navio> listaNavio = new ArrayList<Navio>();
	static List<Carga> listaCarga = new ArrayList<Carga>();
	
	
	public static void main(String[] args) throws ParseException {
		
		Navio_Graneleiro ng1 = new Navio_Graneleiro(1, "Xablau", 4, 40000, 6);
		Navio_Graneleiro ng2 = new Navio_Graneleiro(2, "Rarirau", 6, 50000, 8);
		Navio_Container nc1 = new Navio_Container(3, "Xablau", 4, 35000, 5, 5);
		
		listaNavio.add(nc1);
		listaNavio.add(ng2);
		listaNavio.add(ng1);
		
		while(true) {
			
			System.out.println("*** Exercício Navio ***");
			System.out.println("Digite [1] para registrar uma viagem");
			System.out.println("Digite [2] para inserir uma carga na viagem");
			System.out.println("Digite [3] para consultar uma viagem");
			System.out.println("Digite [4] para finalizar o programa");	
			
			int opcao = ler.nextInt();
			
			switch(opcao) {
			
			case 1:
				registrarViagem();
				break;
				
			case 2:
				inserirCarga();
				break;
			
			case 3:
				consultarViagem();
				break;
			
			case 4:
				System.out.println("Finalizando programa...");
				return;
				
			default:
				System.out.println("Opção inexistente. Tente novamente");
				continue;
			}
		}
		
	}


public static void registrarViagem() throws ParseException {
	
	while(true) {
		
		System.out.println("*** REGISTRO DE VIAGENS ***\n");
		System.out.println("Informe o id do navio que fará a viagem: [0] para sair");
		int id = ler.nextInt();
		
		if(id == 0) {
			System.out.println("Retornando ao Menu inicial...");
			return;
		}
		
		ler.nextLine();
		
		Navio navioParaViagem = pesquisarNavio(id);
		
		if(navioParaViagem == null) {
			System.out.println("Navio não cadastrado!");
			continue;
		}
		
		else {
			System.out.println("Informe a data de viagem do navio [dd/mm/aaaa]: ");
			String dataRecebida = ler.nextLine();
			
			SimpleDateFormat dataParaFormatar = new SimpleDateFormat("dd/mm/yyyy");
			Date dataFormatada = dataParaFormatar.parse(dataRecebida);
			
			Viagem v1 = new Viagem(dataFormatada, navioParaViagem);
			listaViagem.add(v1);
			System.out.println("Viagem registrada com sucesso!");
			System.out.println();
			System.out.println(v1.toString());
			
		}
		
	}
	
	
}

public static void inserirCarga() {
	
	while(true) {
		
		System.out.println("*** INSERÇÃO DE CARGAS ***\n");
		System.out.println("Digite o Id do navio onde a carga será transportada - [0] para sair: ");
		int id = ler.nextInt();
		
		if(id == 0) {
			System.out.println("Retornando ao menu...");
			return;
		}
		
		Navio navioParaCarga = pesquisarNavio(id);
		
		if(navioParaCarga == null) {
			System.out.println("Navio não cadastrado!");
			return;
		}
		
		else {
			
			System.out.println();
			
		}
		
	}
	
}

public static void consultarViagem() {
	
}

public static Viagem pesquisarViagem(int id) {
	
	for(Viagem viagemPesquisada: listaViagem) {
		if(viagemPesquisada.getId() == id) {
			return viagemPesquisada;
		}
	}
	
	return null;
	
}

public static Carga pesquisarCarga(int id) {
	
	for(Carga cargaPesquisada: listaCarga) {
		if(cargaPesquisada.getId() == id) {
			return cargaPesquisada;
		}
	}
	
	return null;
}

public static Navio pesquisarNavio(int id) {

	for(Navio navioPesquisado: listaNavio) {
		if(navioPesquisado.getId() == id) {
			return navioPesquisado;
		}
	}
	
	return null;
}

}
