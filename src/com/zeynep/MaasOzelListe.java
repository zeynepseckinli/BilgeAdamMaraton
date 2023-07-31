package com.zeynep;

public class MaasOzelListe {
	double[] maasDizisi;
	int boyut = 0;

	public void add(double maas) {
		double[] tmp;
		if (maasDizisi == null) {
			maasDizisi = new double[1];
			maasDizisi[0] = maas;
		} else {
			tmp = new double[boyut + 1];
			for (int i = 0; i < boyut; i++)
				tmp[i] = maasDizisi[i];
			tmp[boyut] = maas;
			maasDizisi = tmp;
		}
		boyut++;
	}

	public double[] getList() {

		return maasDizisi;

	}
}
