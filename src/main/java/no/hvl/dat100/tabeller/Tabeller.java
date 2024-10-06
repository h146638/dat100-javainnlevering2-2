package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i <= tabell.length - 1; i++)
			System.out.println(tabell[i]);

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String a = ("[");

		for (int i = 0; i <= tabell.length - 1; i++) {
			a += String.valueOf(tabell[i]);
			if (i < tabell.length - 1) {
				a += (",");
			}

		}
		a += ("]");
		return a;
	}

	// c)
	public static int summer(int[] tabell) {

		int a = 0;

		for (int i : tabell) {
			a += i;

		}
		return a;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean a = false;
		for (int i : tabell) {

			if (i == tall) {
				a = true;
				return a;
			}
		}

		return a;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int a = -1;

		for (int i = 0; i <= tabell.length - 1; i++) {

			if (tall == tabell[i])
				return i;
		}
		return a;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] revers = new int[tabell.length];
		int l = tabell.length;
		for (int i = 0; i <= tabell.length - 1; i++) {
			revers[l - 1] = tabell[i];
			l = l - 1;
		}
		return revers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sort = true;
		if (tabell.length > 0) {
			int a = 0;
			a = tabell[0] - 1;
			for (int i : tabell) {
				if (i < a) {
					sort = false;
					return sort;
				} else {
					a = i;
				}
			}
		}
		return sort;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int l1 = tabell1.length;
		int l2 = tabell2.length;
		int[] sammen = new int[l1 + l2];

		for (int i = 0; i <= l1 - 1; i++) {
			sammen[i] = tabell1[i];
		}
		for (int i = 0; i <= l2 - 1; i++) {
			sammen[i + l1] = tabell2[i];
		}

		return sammen;

	}
}
