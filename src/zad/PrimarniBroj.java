package zad;

import java.util.Scanner;

public class PrimarniBroj {

	private Scanner ulaz;

	public PrimarniBroj() {

		ulaz = new Scanner(System.in);
		odradiPosao();
		ulaz.close();
	}

	private void odradiPosao() {
		System.out.println("Unesite broj:");
		int x = ulaz.nextInt();
		if ((x % 2 != 0 && x % 3 != 0 && x % 5 != 0 && x % 7 != 0)
				|| (x == 3 || x == 5 || x == 7)) {
			System.out.println("Broj " + x +" je primaran");
		} else {
			System.out.println("Broj " + x +" nije primaran");
		}

	}

	public static void main(String[] args) {
		new PrimarniBroj();
	}

}
