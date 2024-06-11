package erena;

public class Serena {
  public String nome;
  public int idade;
  public String sexo;
  public String genero;
  public String raca;
  public String cor;
  public String ocupacao;
  private Cabelo  e ;
  private Calda  c ;
  private Acessorios a;
  public String escala;

  public Serena(String novoNome, int novaIdade, String novoSexo, String novoGenero, String novaRaca, String novaCor,
      String novaOcupacao,  Cabelo cabelo, Calda calda, Acessorios acessorios, String novaEscala) {
    this.nome = novoNome;
    this.idade = novaIdade;
    this.sexo = novoSexo;
    this.genero = novoGenero;
    this.raca = novaRaca;
    this.cor = novaCor;
    this.ocupacao = novaOcupacao;
    this.e = Cabelo;
    this.c = Calda;
    this.a = Acessorios;
    this.escala = novaEscala;
  }
    public void setCabelo (Cabelo cabelo) {
        this.e = cabelo;
    }
    
    public void setCalda (Calda calda) {
    	this.c = calda;
    }

  public void setAcessorios (Acessorios acessorios) {
    	this.a = acessorios;
    }
  
  public String dialogar(boolean perguntaUm, boolean perguntaDois) {
    if (perguntaUm == true) {
      return "eu não quero corja com os saqueadores";
    } else if (perguntaDois == true) {
      return "sim";
    } else {
      return "-Essa pergunta não é valida";
    }
  }

  public String pintar() {
    return "- Serena está pintando.";
  }

  public String toString() {
    return "O meu nome é: " + this.nome + "\nTenho: " + this.idade + " anos" + "\nDa escala: " + this.escala
        + "\nSou do sexo: " + this.sexo + "\nMeu genero é: " + this.genero + " \nda raça: " + this.raca + "\nsou: "
        + this.ocupacao + " neu cabelo é  " + + e.toString() + "\n Calda" + c.toString()+ a.toString() + ".";
  }

}


