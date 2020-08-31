package exemploArrayList;

import java.util.ArrayList;

public class Main {
	
		
	public static void main (String [] args) {
		ArrayList <String> nomes = new ArrayList<>();
		nomes.add("Amanda De Carli");
		nomes.add("Claudia Roseli");
		nomes.add("Antonio De Carli");
		nomes.add("Maria");
		
		nomes.remove(0); //apaga o nome Amanda pela primeira posição
		nomes.remove("Antonio De Carli");//apaga pelo conteúdo
		//nomes.clear(); //apaga todas as posições
		
		System.out.println(nomes.toString());
		System.out.println(nomes.get(1));
		System.out.println(nomes.isEmpty());// retornou falso pois exite nome
		System.out.println(nomes.contains("Claudia Roseli"));//verifica se existe este nome no array
		System.out.println(nomes.size());//verifica o tamanho do meu array
		System.out.println(nomes.indexOf("Maria"));//retorna a posição de Maria 
	}
}
