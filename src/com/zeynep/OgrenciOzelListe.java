package com.zeynep;

public class OgrenciOzelListe {

	String[] ogrenciDizisi;
	int boyut = 0;

	public void add(String isim) {
		String[] tmp;
		if (ogrenciDizisi == null) {
			ogrenciDizisi = new String[1];
			ogrenciDizisi[0] = isim;
		} else {
			tmp = new String[boyut + 1];
			for (int i = 0; i < boyut; i++)
				tmp[i] = ogrenciDizisi[i];
			tmp[boyut] = isim;
			ogrenciDizisi = tmp;
		}
		boyut++;
	}

	public String[] getList() {

		return ogrenciDizisi;

	}

}
