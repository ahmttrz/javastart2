package day03;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {

		
		//kullanıcı ıkı tam sazı versın 
				// Program bu tamsayıları toplamını ve carpımını ekrana yazdırsın.
			    Scanner  scan = new Scanner(System.in);
				//Scannner i import ettik yukRIDA
				
				System.out.println("Lütfen iki tamsayı giriniz.");
				
				int sayi1 = scan.nextInt();
				int sayi2 = scan.nextInt();
				
				System.out.println(sayi1 + sayi2);
				System.out.println(sayi1 - sayi2);
				System.out.println(sayi1 * sayi2);
				System.out.println(sayi1 / sayi2);
	}

}
