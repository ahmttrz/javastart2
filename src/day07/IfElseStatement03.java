package day07;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		/*KULLANICIDAN ALACAGIURUN MIKTARINI VE FIYATLARINI ALALIM
		 * EGER KULLANICI 1000 DEN FAZLA URUN ALIRSA %20 İNDİRİM YAP
		 * ODEME MİKTTARINI EKRANA YAZDIR.
		 * EGER KULLANICININ URUN MIKTARI1000=< İSE İNDİRİM YAPMA 
		 * ODEME MİKTTARINI EKRANA YAZDIR.
		 */

		Scanner scan= new Scanner(System.in);
		System.out.println("LUTFEN URUN MIKTARINI GIRINIZ");
		int m = scan.nextInt();
		
		System.out.println("LUTFEN URUN FIYATINI GIRINIZ");
		double f = scan.nextDouble();
		
		if(m>1000) {
			System.out.println((m*f) -( m*f*20/100 ) + "TL" );
		}else {
			System.out.println(f*m);
		}
		
	}

}
