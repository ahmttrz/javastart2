package day07;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan yasini alın
		 * yas 13 ten kucukse ekrana "Calisamaz" yazdır.
		 * yas 13 ten 65 e kadarsa ekrana "Calisabilirsin" yazdır.
		 * yas 65 den buyukse ekrana "Emekli"yazdır
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("YASINIZI GIRIN");
		 int age = scan.nextInt();
		
		 if (age<13) {
			 System.out.println("CALISAMAZ");
		 }else if (age<=65) {
			 System.out.println("CALISABILIR");

		 }else if (age>65) {
			 System.out.println("EMEKLI");

		 }
		
		
		
		
	}

}
