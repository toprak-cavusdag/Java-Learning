package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		
		// Değişken isimlendirmeleri camelCase yazılır
		
		String  ortaMetin = "İlginizi çekebilir";
		String  AltMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);

		
		int vade = 12;
		
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		
		if (dolarBugun < dolarDun) {
			
			okYonu = "down.svg";
			System.out.println(okYonu);
		} 
		
		else {
			okYonu = "up.svg";
			System.out.println(okYonu);

		}
		
		
	}
}
