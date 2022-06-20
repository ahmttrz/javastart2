package day05;

import java.util.Scanner;

public class modulus03 {

	public static void main(String[] args) {
		// kullanıcıdan 3 basamaklı syı lan ve rakammlarıı toplayan bır program yazınız.
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("3 BASAMAKLI BIR SAYI GIRIN");
		
		int sayı = scan.nextInt();
		
		int sonRakam = sayı%10;
		int ortaRakam = (sayı%100)/10;
    	int ilkRakam = sayı/100;
		System.out.println("rakamlari toplami");
		System.out.println(sonRakam+ortaRakam+ilkRakam);
		
		

	}

}
