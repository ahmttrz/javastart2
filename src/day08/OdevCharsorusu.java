package day08;

import java.util.Scanner;

public class OdevCharsorusu {

	public static void main(String[] args) {
		/* KULLANICIDAN BIR CHARAZTER ALIN EGER CHARACTER BIR HARF ISE EKRANA "HARF" YAZDIRIN.
		 * DIGER DURUMLARDA EKRANA HARF DEGIL YAZDIRIN.
		 * 
		 */

 Scanner scan = new Scanner(System.in);
 
		System.out.println("Bir karakter yazin");
		char ch = scan.next().charAt(0);// kullanıcan char almak icın bu kodu kullanırız.
		                                 // bilmedigimiz kodları google dan bak.
		
		if ((ch>=97 && ch<=122) || (ch<=90 && ch>=65)) {
			System.out.println("hafr");
		}else {
			System.out.println("harf degil");
		}
		
		
	}

}
