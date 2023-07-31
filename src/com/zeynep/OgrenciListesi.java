package com.zeynep;

import java.util.Arrays;
import java.util.Scanner;

public class OgrenciListesi {

	public void uygulama() {
		int secilen;
		do {
			ekranaYazdir();
			secilen = secim();
			if (secilen == 0)
				System.err.println("ÇIKIŞ YAPILDI");
			else
				menu(secilen);
		} while (secilen != 0);

	}

	MaasOzelListe maasOzelListe = new MaasOzelListe();
	OgrenciOzelListe ogrenciOzelListe = new OgrenciOzelListe();

	public void menu(int secim) {
		boolean[][] hobiler = new boolean[ogrenciOzelListe.boyut][4];
		switch (secim) {

		case 1:
			Scanner sc = new Scanner(System.in);
			System.out.print("Kaç öğrenci tanımlayacaksınız...: ");
			int sayac = sc.nextInt();
			sc.nextLine();

			for (int i = 0; i < sayac; i++) {
				System.out.print((i + 1) + ". öğrencinin adını giriniz: ");
				String isim = sc.nextLine();
				ogrenciOzelListe.add(isim);
			}

			System.out.println(Arrays.toString(ogrenciOzelListe.getList()));
			break;

		case 2:
			sc = new Scanner(System.in);

			System.out.print("Öğrenci seçiniz...: ");
			String ogrenci = sc.nextLine();

			for (int i = 0; i < ogrenciOzelListe.boyut; i++) {
				if (ogrenciOzelListe.ogrenciDizisi[i].equalsIgnoreCase(ogrenci)) {

					System.out.print("Yürümekten hoşlanır mısın[E/H]?");
					String kontrol = sc.nextLine();
					if (sc.nextLine().equalsIgnoreCase("e")) {
						hobiler[i][0] = true;
					}
					System.out.print("Kitap Okumaktan hoşlanır mısın[E/H]?");
					if (sc.nextLine().equalsIgnoreCase("e")) {
						hobiler[i][1] = true;
					}
					System.out.print("Spor rutinlerin var mı[E/H]?");
					if (sc.nextLine().equalsIgnoreCase("e")) {
						hobiler[i][2] = true;
					}
				}
				System.out.print("Kod yazmaktan hoşlanır mısın[E/H]?");
				if (sc.nextLine().equalsIgnoreCase("e")) {
					hobiler[i][3] = true;
				}

			}

			break;

		case 3:
			sc = new Scanner(System.in);
			for (int i = 0; i < ogrenciOzelListe.boyut; i++) {
				System.out.print((i + 1) + ". Öğrenci " + ogrenciOzelListe.ogrenciDizisi[i] + " 'in beklentisi...: \t");
				double maas = sc.nextInt();
				maasOzelListe.add(maas);
			}
			System.out.println(Arrays.toString(maasOzelListe.getList()));
			break;

		case 4:
			System.out.println("No\t| Ad\t\t\t| Hobileri\t\t\t\t\t| Maaş Beklentisi");
			for (int i = 0; i < ogrenciOzelListe.boyut; i++) {
				System.out.print(i + 1 + "\t ");
				System.out.print(ogrenciOzelListe.ogrenciDizisi[i] + "\t\t ");
				if (hobiler[i][0] == true)
					System.out.print("Yürümek ");
				if (hobiler[i][1] == true)
					System.out.print("Kitap Okuma ");
				if (hobiler[i][2] == true)
					System.out.print("Spor ");
				if (hobiler[i][3] == true)
					System.out.print("Kod Yazma ");
				System.out.print(maasOzelListe.maasDizisi[i] + "\t\t");

				System.out.println();
			}
			break;

		default:
			System.err.println("Lütfen geçerli bir seçim yapınız.\n");
		}
	}

//	public boolean[][] hobileriSor(String isim, String cevap){
//		OgrenciOzelListe ogrenciOzelList = new OgrenciOzelListe();
//		boolean[][] hobiler= new boolean[ogrenciOzelList.boyut][4];
//		return hobiler[][];
//	}

//	public boolean[][] hobiKontrol(String kontrol,int index,int i){
//		boolean[][] array=new boolean[ogrenciOzelListe.boyut][4];
//		if (kontrol.equalsIgnoreCase("e")) {
//			array[index][i] = true;
//		} 
//		return array;
//	}

	public int secim() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seçiniz...: ");
		int secilen = sc.nextInt();
		sc.nextLine();
		return secilen;
	}

	public void ekranaYazdir() {

		System.out.println("*****************************");
		System.out.println("*** ÖĞRENCİ BİLGİ SİSTEMİ ***");
		System.out.println("*****************************");
		System.out.println();
		System.out.println("1- Sınıf arkadaşı tanımla");
		System.out.println("2- Hobilerini gir");
		System.out.println("3- Maaş beklentilerini gir");
		System.out.println("4- Sınıf Listesi");
		System.out.println("0- Ç I K I Ş");

	}
}
