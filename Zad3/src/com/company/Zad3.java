package com.company;

import javax.swing.*;
import java.awt.image.ImageProducer;
import java.util.*;

public class Zad3 {

    public static void main(String[] args) {


        String slowo = "Ala ma Kota i 3 psy i sie nie klopota";

        slowo = slowo.toLowerCase();

        Map<Character, Integer> pustaMapa = new HashMap<>();





        for(int numerLitery=0; numerLitery < slowo.length(); numerLitery++) {

            Character kolejnaLitera = slowo.charAt(numerLitery);
            Character klucze = kolejnaLitera;

            if(!Character.isLetter(kolejnaLitera))
                continue;

            int wartosci;
            if (pustaMapa.containsKey(klucze)) {
                wartosci = pustaMapa.get(klucze) + 1;
            }
            else {
                wartosci = 1;
            };

            pustaMapa.put(klucze, wartosci);


        }

        System.out.println("Iterowanie po kluczach i wartosciach");
        for (Map.Entry<Character, Integer> entry : pustaMapa.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);


        }
    }
}
