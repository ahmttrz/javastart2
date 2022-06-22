package day08;

import java.util.Scanner;

public class KutsalGun01 {

	public static void main(String[] args) {
		/*Kullanıcıdan bır gun alın eger gun "cuma" ıse "Muslumanlar Icin Kutsal Gun"
		 * "CUMARTESİ" ise "yahudiler icin kutsal gun" 	
		 * "PAZAR" ise" hiristiyanlar icin kutsal gun"
		 * diger gunler icin "kutsal gun degil " yazdırın.
		 */

		Scanner scan= new Scanner(System.in);
		System.out.println("GUN GIRIN");
		String g = scan.next();
		
		if(g.equalsIgnoreCase("cuma")) {       //equalsIgnoreCase() KUCUKbuyuk harf dikkate alamdan yapar
		  System.out.println("Muslumanlar Icin Kutsal Gun");	
		}else if(g.equalsIgnoreCase("CUMARTESİ")) {
			System.out.println("yahudiler icin kutsal gun");
		}else if(g.equalsIgnoreCase("PAZAR")){
			System.out.println(" hiristiyanlar icin kutsal gun");
		}else {
			System.out.println(" kutsal gun degil");
		}

	}

}
