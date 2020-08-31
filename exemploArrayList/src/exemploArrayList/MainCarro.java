package exemploArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainCarro {
	ArrayList<Carro> cadastro = new ArrayList<>();
	
	public static void main (String [] args) {
		
		MainCarro objeto = new MainCarro();
		objeto.cadastro.add(new Carro("Fiesta", "Ford", 2018));
		objeto.cadastro.add(new Carro("Ka", "Ford", 2016));
		
		//JOptionPane.showMessageDialog(null, objeto.cadastro.get(0).nome);//verifica a posição
		
		for(int i = 0 ; i < objeto.cadastro.size(); i ++ ) {
			//System.out.println(i);
			JOptionPane.showMessageDialog(null, objeto.cadastro.get(i).nome);
		}
	}
	
	

}
