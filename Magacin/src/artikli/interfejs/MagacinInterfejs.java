package artikli.interfejs;

import artikli.Artikal;

public interface MagacinInterfejs {

	public void dodajArtikal(Artikal a, Artikal magacin);
	public void izbaciArtikal(Artikal a, Artikal magacin);
	public String vratiInfo(int sifraArtikla,Artikal magacin);

	
}
