package org.rd;

public enum Gezegen {
    Gezegen1(1,1,1,1),
    Gezegen2(2,2,2,2),
    Gezegen3(3,3,3,3);

    int siralama, uzaklik, yari_cap, donme_suresi;

    Gezegen (int siralama, int uzaklik, int yari_cap, int donme_suresi){
        this.siralama = siralama;
        this.uzaklik = uzaklik;
        this.yari_cap = yari_cap;
        this.donme_suresi = donme_suresi;
    }

}



