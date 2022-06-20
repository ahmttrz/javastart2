package day03;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /* dairenin alanı ve ceresi buluma pragramı
  * pi= 3.14159
  * alan = 3.14159*radius*radius
   cevre= 2*3.14159*radius
	*/
	
    Scanner scan = new Scanner(System.in);
    
    System.out.println("DAIRENIN YARI CAPINI GIRIN");
		
	double pi= 3.14159;
	double radius = scan.nextDouble();
	
	System.out.println(pi * radius *radius);
	
	System.out.println(pi * radius *2);
	
		
		
	}

}
