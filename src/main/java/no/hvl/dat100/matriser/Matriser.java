package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println("");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String streng = "";

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {

				streng += (matrise[i][j] + " ");
			}
			streng += ("\n");

		}
		return streng;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] skalert = matrise;

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {

				skalert[i][j] = tall * matrise[i][j];
			}
		}
		return skalert;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {

				if (a[i][j] != b[i][j]) {
					lik = false;
					return lik;
				}
			}
		}

		return lik;

	}

	// e) VALGFRI
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f) VALGFRI
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
