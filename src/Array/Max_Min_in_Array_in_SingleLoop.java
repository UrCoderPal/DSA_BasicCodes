package Array;

public class Max_Min_in_Array_in_SingleLoop {

	public static void main(String[] args) {
		int a[] = { -1, -2, 45, 87, -98, 576, 98 };
		method(a);
	}

	public static void method(int a[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			else if (a[i] < min)
				min = a[i]; // if or else if here wud work the same
		}
		System.out.println("Max is: " + max + " whereas Min is: " + min);
	}

}
