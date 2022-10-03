package biblioteka;

import java.util.LinkedList;
import java.util.Objects;

public class Knjiga {

	private String naslov;
	private LinkedList<Autor> autori;
	private String isbn;
	private String izdavac;
	private int izadanje;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", autori=" + autori + ", isbn=" + isbn + ", izdavac=" + izdavac
				+ ", izadanje=" + izadanje + "]";
	}

	public String getNaslov() {
		return naslov;
	}
	
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	
	
	public LinkedList<Autor> getAutori() {
		return autori;
	}

	public void setAutori(LinkedList<Autor> autori) {
		this.autori = autori;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getIzdavac() {
		return izdavac;
	}
	
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	
	public int getIzadanje() {
		return izadanje;
	}
	
	public void setIzadanje(int izadanje) {
		this.izadanje = izadanje;
	}
	
	
}
