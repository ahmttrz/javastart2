package day07;

public class IfStatement03 {

	public static void main(String[] args) {
		/*bir char variable olusturun ve butuk bır harf atayın
		 * eger atanan deger, haftanın gunlerinden herhangi birinin harfi ise o gunleri yazdırın
		 * eger atanan deger haftanın gunlerınden herhangı bırının ilk harfi ise ekrna "boyle bır gun yok" yazdır. 
		 */

		char c1 ='k';
		 
		if(c1 == 'P') {
			System.out.println("Pazartesi Persembe Pazar");
		}
		if(c1 == 'S') {
			System.out.println("Sali");
		}
			System.out.println("Cuma Cumartesi");
		
		if (c1 !='P' || c1 !='S'  || c1 !='C' ) {        // veya nin israti || dir
			                                             // ve nin isareti && dir
			System.out.println("Boyle Bir Gun Yok");
		}
		
	
	}
	

}
