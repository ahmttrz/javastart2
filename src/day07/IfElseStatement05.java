package day07;

import java.util.Scanner;

public class IfElseStatement05 {

	public static void main(String[] args) {
		/*kullanıcan "Sinav notunu tam olarak gir "mesını ısteyın
		 * negatıf gırerse ekrana "Yanlis deger girdiniz" yazın
		 * 0>=n ve n<50 ise ekrana "Kaldidizç" yazdırın
		 * n>=50 ve n<=80 ise ekrana "Gectiniz" yazdırın.
		 * n>=80 ve n<= 100 ise ekarana "Tebrikler" yazdırın. 
		 */
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Sinav notunu tam olarak gir ");
	int n = scan.nextInt();
	if(n<0 || n>100) {
		System.out.println("Yanlis deger girdiniz");
	}else 
	if(0>=n || n<50 ) {
		System.out.println("Kaldidiz.");
	}else if (n>=50 && n<=80 ) {
		System.out.println("Gectiniz");
	}else if(n>=80 && n<= 100) {
		System.out.println("Tebrikler");
		
	}
	
	
	
	
	}

	
	
	
	
}
