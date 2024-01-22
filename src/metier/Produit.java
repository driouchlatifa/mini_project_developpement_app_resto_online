package metier;


public class Produit {

	private int code;
	private String libelle,lien;
	private float prix;
	public String getLibelle() {
		return libelle;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	

}
