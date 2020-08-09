package com.company;

public class Zad1 {

    public static void main(String[] args) {
    float sum = 0;
    int[] tablica = {9,7,3,1,9,7,3,1,9,7};
    int[] number = {4,4,0,5,1,4,0,1,3,5,8};

	int i;
	for (i=0; i<tablica.length; i++){
	    sum += number[i] * tablica[i];

    }
        System.out.println(sum % 10);
    }
}
