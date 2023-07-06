package Array;

public class Unique_Array {

	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 3, 2, 4, 1, 2, 5, 7, 3 };
		unique(a);

	}

	public static void unique(int a[]) {
		int L = a.length;
		for (int i = 0; i < L - 1; i++)
			for (int j = i + 1; j < L; j++) {
				if (a[i] == a[j]) {
					for (int k = j; k < L - 1; k++) {
						a[k] = a[k + 1];
					} // end of k
					j--;
					L--;
				} // end of if
			} // end of j goes back to i where i has a single cycle to run j loop
		for (int i = 0; i < L; i++)
			System.out.print(a[i] + " ");
	}
}
