package methods;

public class main {

	public static void main(String[] args) {
		
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int sayilar[] = new int[] { 1, 2, 5, 7, 9 };
		int aranacak = 9;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			} else {
				varMi = false;
			}
		}
		System.out.println(varMi);
	}
}
