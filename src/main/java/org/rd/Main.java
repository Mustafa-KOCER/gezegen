package org.rd;


public class Main {
    public static void main(String[] args) {

        for (Gezegen gezegen : Gezegen.values()) {
            System.out.println(gezegen +" siralama:"+ gezegen.siralama +" uzaklik:"+ gezegen.uzaklik +" yari cap:"+ gezegen.yari_cap +" donme suresi: "+ gezegen.donme_suresi);
        }
    }
}