package day07;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		/*kullanıcıdan bır dıkdortgenın eını ve boyunu al
		 * en == boy ıse "bu bır karedir" yazdır
		 * en !=boy ise "bu bır dikdorgendır" yazdır.
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("dikdorgenin enini gir");
		
		double e = scan.nextDouble();
		
		System.out.println("dikdorgenin boyunu gir");
		
		double b = scan.nextDouble();
		
		if (e == b ){
			System.out.println("Bu Bir Karedir.");
		}

			if (e != b) {
			System.out.println("Bu Bir Dikdortgendir.");
		}
			
		System.out.println("alan=" );
		
		System.out.println(e*b);

		
		System.out.println("cevre="  );
		
		System.out.println(2*(e+b) );

			
		}
		
		
	}
	


