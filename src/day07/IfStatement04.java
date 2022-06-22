package day07;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		/*BIR TANE STRING VARIABLE OLUSTURUN VE ISMINI KUCUK HARFLERLE DEGER OLARAK ATAYIN
		 *EGER ATADIGINIZ DEGER HAFTA ICI GUNLERDEN BIRI ISE EKRANA "HAFTA ICI" YAZDIR.
		 * EGER ATADIGINIZ DEGER HAFTA SONU GUNLERDEN BIRI ISE EKRANA "HAFTA SONU" YAZDIR.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir Gun Yazın");
		String g = scan.next();
		
		 
      if (g.equals("pazartesi") || g.equals("sali")  || g.equals("carsamba")   ||g.equals("persembe")  || g.equals( "cuma" ) ){
			System.out.println("HAFTA ICI");
		}
		
		if (g.equals("cumartesi") ||g.equals( "pazar" )) {
					System.out.println("HAFTA SONU");
				}
	
	
	}

}
