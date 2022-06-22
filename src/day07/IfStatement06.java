package day07;

import java.util.Scanner;

public class IfStatement06 {

	public static void main(String[] args) {
		/*
		 * 
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Yasiyi girseya");
		 int yas = scan.nextInt();
		 System.out.println("Cinsiyetini yaz e/k");
		 String cins= scan.next();
		
		 if(yas>20 && yas<40  ) {
			 System.out.println("---yasi askerlige uygun. ");;
		 }else {
				 System.out.println("---yasi askerlige uygun degil");
		 }
		 if(yas>18 ) {
			 System.out.println("---oy kullanir");
		 }else {
			 System.out.println("---oy kullanamaz");
		 }
		 if(yas>60 && cins== "e" ) {
			 System.out.println("---seferberlige katilmaz");
		 }
		 if (yas>54 ) {
			 System.out.println("---emekli");
		 }else {
			 System.out.println("---emekli olamasiy");
		 }
		 if(yas>64) {
			 System.out.println("---Ucretsiz seyahat karti alabilir");
		 }else {
			 System.out.println("---seyahat karti yok");
		 }
		 
		 if(cins.contentEquals("e") ) {
			 System.out.println("---askerlik yapar ");
		 }else {
			 System.out.println("---cinsiyet askerlige uygun degil. ");
		 }
		 
	}

}
