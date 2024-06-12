package org.rd;

public enum Gezegen {
    Merkur(10,10,10,10),
    Venüs(20,20,20,20),
    Dünya(30,30,30,30),
    Mars(40,40,40,40),
    Jüpiter(50,50,50,50),
    Satürn(60,60,60,60),
    Uranüs(70,70,70,70),
    Neptün(80,80,80,80),


    int siralama, uzaklik, yari_cap, donme_suresi;

    Gezegen (int siralama, int uzaklik, int yari_cap, int donme_suresi){
        this.siralama = siralama;
        this.uzaklik = uzaklik;
        this.yari_cap = yari_cap;
        this.donme_suresi = donme_suresi;
    }

}



