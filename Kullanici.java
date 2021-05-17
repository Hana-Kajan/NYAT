package com.B191210556;

import java.sql.SQLOutput;

public class Kullanici implements IObserver {
    String kullaniciadi;
    String sifre;

    public Kullanici(String kullaniciadi, String sifre){
        this.kullaniciadi = kullaniciadi;
        this.sifre = sifre;
    }

    //Gözlemci uyarıldığında çalışan fonksiyon.
    @Override
    public void update(boolean sogutucuDurumu) {
        System.out.println("Soğutucu " + (sogutucuDurumu ? "Açıldı" : "Kapatıldı") );
    }
}

