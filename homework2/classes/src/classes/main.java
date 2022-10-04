package classes;

import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		int[] sayilar1 = new int[] { 1, 2, 3 };

		int[] sayilar2 = new int[] { 4, 5, 6 };

		/*
		 * sayilar2 = sayilar1; sayilar1[0] = 10; System.out.println(sayilar2[0]);
		 */

		ArrayList liste1 = new ArrayList();

		ArrayList liste2 = new ArrayList();

		liste1.add(10000);
		liste2.add(20000);
		liste1 = liste2;

		System.out.println(liste1.get(0));
		System.out.println(liste2.get(0));

		
		
	}

}
