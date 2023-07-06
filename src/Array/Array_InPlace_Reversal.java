package Array;

public class Array_InPlace_Reversal {

	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 6, 4, 8 };
		for (int x : a)
			System.out.print(x + " ");
		rev(a);
		System.out.println("After rev");
		System.out.println();
		for (int x : a)
			System.out.print(x + " ");
	}

	public static void rev(int a[]) {
		int L = a.length;
		for (int i = 0; i < L / 2; i++) {
			int temp = a[i];
			a[i] = a[L - 1 - i];
			a[L - 1 - i] = temp;
		}
	}
}
