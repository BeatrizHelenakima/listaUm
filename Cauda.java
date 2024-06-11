public class Cauda {
	private double tamanhoCauda;
	  public String tipoCauda;
	  public String corCauda;
	  
	  public Cauda(double tam, String tip, String cor) {
		  this.tamanhoCauda = tam;
		  this.tipoCauda = tip;
		  this.corCauda = cor;
	  }
	  
	  public double getTamanhoCauda() {
		  return tamanhoCauda;
	  }
	  
	  public String getTipoCauda() {
		  return tipoCauda;
	  }
	  
	  public String corCauda() {
		  return corCauda;
	  }
	  
	  public void setTamanhoCauda(double tamanhoCauda) {
		  this.tamanhoCauda = tamanhoCauda;
	  }
	  
	  public void setTipoCauda(String tipoCauda) {
		  this.tipoCauda = tipoCauda;
	  }
	  
	  public void setCorCauda(String corCauda) {
		  this.corCauda = corCauda;
	  }
	  
	  public String toString() {
		  return "\n\n" + "Tamanho: " + this.tamanhoCauda + "\nTipo: " + this.tipoCauda + "\nCor: " + this.corCauda;
	  }
}
