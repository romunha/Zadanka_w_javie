package com.company;

public class Main {

    public static void main(String[] args) {
        String zdanie = "Heerllor world!  ororororo!!";
        String slowo = "or";
        String male_zdanie = zdanie.toLowerCase();
        String male_slowo = slowo.toLowerCase();
        int j;
        var ilosc_wyswietlen = 0;
        for (int i=0; i<male_zdanie.length(); i++){
            for (j=0; j<male_slowo.length(); j++){
                if (male_zdanie.charAt(i + j) != male_slowo.charAt(j)){
                    break;
                }

            }
            if (male_slowo.length() == j){

                ilosc_wyswietlen += 1 ;
            }
        }
        System.out.println("słowo: " + slowo + " w tym slowie wystąpiło: " + ilosc_wyswietlen + "razy");
    }
    }
