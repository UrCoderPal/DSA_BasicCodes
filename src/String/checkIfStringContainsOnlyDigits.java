package String;

public class checkIfStringContainsOnlyDigits {

	public static void main(String[] args) {
		check("01239");
	}

	public static void check(String str) {
		char c[] = str.toCharArray();
		boolean flag = true;
		for (int i = 0; i < c.length; i++) {
			if (c[i] < '0' || c[i] > '9') // can use either < '0'(implicit ascii value) or <48 (explicit ascii value)
			{
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Contains only digits");
		else
			System.out.println("Not all chars are digits");
	}

}
