package artikli;

import java.util.LinkedList;

import artikli.interfejs.MagacinInterfejs;

public class KlasaZaImplementaciju implements MagacinInterfejs {

	@Override
	public void dodajArtikal(Artikal a, Artikal magacin) {
		if(a==null) throw new RuntimeException("Dodali ste artikal koji je prazan");
		LinkedList<Artikal> lista = magacin.getListaArtikal();
		if(lista.contains(a)) {
			for (Artikal artikal : lista) {
				if(a.getClass().equals(artikal.getClass())) artikal.setKolicina(artikal.getKolicina()+1);
			}
		}else {
			lista.add(a);
		}
		magacin.setListaArtikal(lista);
	}

	@Override
	public void izbaciArtikal(Artikal a, Artikal magacin) {
		if(a==null) throw new RuntimeException("Dodali ste artikal koji je prazan");
		LinkedList<Artikal> lista = magacin.getListaArtikal();
		if(lista.contains(a)) {
			for (Artikal artikal : lista) {
				if(a.getClass().equals(artikal.getClass())) artikal.setKolicina(artikal.getKolicina()-1);
			}
		}else {
			throw new RuntimeException("Artikal ne postoji u magacinu, druga verzija");
		}
		magacin.setListaArtikal(lista);
		
	}

	@Override
	public String vratiInfo(int sifraArtikla, Artikal magacin)  {
		LinkedList<Artikal> lista = magacin.getListaArtikal();
		if(lista.get(sifraArtikla)!=null) {
			Artikal a = lista.get(sifraArtikla);
			return a.toString();
		}else{
			throw new RuntimeException("Greska, indeks koji ste uneli ne postoji kao artikal.");
		}
	}

}
