package day04;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* kullanıcıdan ad  ve soy ad alan ve yazdıran bır program yazalım
		 * String kullan
		 * 
		 * 
		 * 
		 * 
		 * */
		  Scanner scan = new Scanner(System.in);
		  System.out.println("lutfen adınızı ve soyadınzı gırın");
		
		  String isim = scan.nextLine();// Stringleri kullanıcıdan almak ıcın next yada nextlıne kullanırz.
		                                // next() tek kelime icin
		                                // nextline() tüm cümleyi almak ıcın kullanılır.
		                             
		  System.out.println(isim);
                                          		  
		  
	}

}
