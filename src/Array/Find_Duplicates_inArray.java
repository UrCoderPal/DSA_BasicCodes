package Array;

import java.util.HashSet;

public class Find_Duplicates_inArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 3, 4, 1, 2, 5, 3, 7 };
		method(a);
	}

	public static void method(int a[]) {
		HashSet<Integer> set = new HashSet();
		for (int x : a) {
			if (set.contains(x))
				System.out.println("Duplicate found: " + x);
			set.add(x);
		}
		System.out.println("Unique Set is: " + set);
	}
}
