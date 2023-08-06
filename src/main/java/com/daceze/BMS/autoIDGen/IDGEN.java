package com.daceze.BMS.autoIDGen;

public class IDGEN {
    private String randCharStr() {
        char[] charStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] randStr = "9876543210abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

        String strg = "";
        String strg2 = "";
        int count = 0, count2 = 0;
        while (count < 4) {
            int randNum = (int) Math.floor(Math.random() * charStr.length);
            strg += charStr[randNum];
            count++;
        }
        while (count2 < 6) {
            int randNum = (int) Math.floor(Math.random() * randStr.length);
            strg2 += randStr[randNum];
            count2++;
        }
        return strg + strg2;

    }

    public String idAuth(){
        String id;
        do{
            id = randCharStr();

        }while(
                id.length() != 10
        );

        return id;
    }
}
