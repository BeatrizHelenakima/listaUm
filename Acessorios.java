package Serana;

public class Acessorios {
	
	private String nome;
	private String acessorioUm;
	private String acessorioDois;
	private String atributos;
	private String material;
	
	public Acessorios(String novoNome, String novoAcessorioUm, String novoAcessorioDois,String novoAtributo, String novoMaterial) {
		this.nome = novoNome;
		this.acessorioUm = novoAcessorioUm;
		this.acessorioDois = novoAcessorioDois;
		this.atributos = novoAtributo;
		this.material = novoMaterial; 
	}
	
	public String getAtributos() {
		return atributos;
	}

	public void setAtributos(String atributos) {
		this.atributos = atributos;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getAcessorioUm() {
		return acessorioUm;
	}

	public String getAcessorioDois() {
		return acessorioDois;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setAcessorioUm(String acessorioUm) {
		this.acessorioUm = acessorioUm;
	}
	public void setAcessorioDois(String acessorioDois) {
		this.acessorioDois = acessorioDois;
	}
	
	// TOSTRING

	public String toString() {
		return "nome: " + this.nome + "Acessorio 1: " + this.acessorioUm + "Acessorio 2: " + this.acessorioDois + "Atributo: " + this.atributos + "Material: " + this.material;         
	}
}
