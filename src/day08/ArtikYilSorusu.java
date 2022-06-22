package day08;

import java.util.Scanner;

public class ArtikYilSorusu {

	public static void main(String[] args) {
		/*kullanıcıdan yıl gırmesını ıste 
		 * gırılen yıl artık yıl ıse ekrarana "artık yil" yazdır
		 *arık yıl = if yıl 100 e bolunurse 400 e ede bolunmelı
		 * yıl 100 e bolunmezse 4 bolunmelı
		 */
				 
           Scanner scan = new Scanner(System.in); 

           System.out.println("BIR YIL GIRIN");
           
		   int yıl =scan.nextInt();
		
		if((yıl%100 == 0 && yıl%400 == 0  ) || yıl%100 != 0 && yıl%4 == 0) {
			System.out.println("BU YIL ARTIKTIR");
		}else {
			System.out.println("BU YIL ARTIK YIL DEGIL");
		}

	}

}
