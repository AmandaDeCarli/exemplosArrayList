package exemploArrayList;

public class Carro {
	
	public String nome; 
	public String marca;
	public int ano;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Carro(String nome, String marca, int ano) {
		this.nome = nome;
		this.marca = marca;
		this.ano = ano;
		
	}
	
}
