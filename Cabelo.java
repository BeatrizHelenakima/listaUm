package erena;

public class Calda {
   private String tipoCabelo;
   private String corCabelo;
   private double tamanhoCabelo;
   private boolean cabeloPintado;
   
   
   public Calda(String tipoCabelo, String corCabelo, double tamanhoCabelo, boolean cabeloPintado) {
		    this.tipoCabelo = tipoCabelo;
		    this.corCabelo = corCabelo;
		    this.tamanhoCabelo = tamanhoCabelo;
		    this.cabeloPintado = cabeloPintado;
		    
   }
  
   public String getTipoCabelo() {
		return tipoCabelo;
   }
   public String getCorCabelo() {
		return corCabelo;
  }
   public double getTamanhoCabelo() {
		return tamanhoCabelo;
 }
  
   public void setTipoCabelo (String novoTipoCabelo) {
		this.tipoCabelo = novoTipoCabelo;
	}  
   public void setCorCabelo (String novoCorCabelo) {
		this.corCabelo = novoCorCabelo;
	}  	
   public void setTamanhoCabelo ( double novoTamanhoCabelo) {
		this.tamanhoCabelo = novoTamanhoCabelo;
	}  
   
   
   public String toString() {
	    return "seu cabelo é " + this.corCabelo + " com a curvatura " + this.tipoCabelo + ", com tamanho " + this.tamanhoCabelo;
	}
}
