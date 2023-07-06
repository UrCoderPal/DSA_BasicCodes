package String;

public class StringReverseUsingRecursion {

	public static void main(String[] args) {

		String str = "hello";

		rev(str, ' ');
	}

	static int i = 0; // M.V.P

	public static void rev(String str, char c) {
		if (i == str.length())
			return;
		char res = str.charAt(i++); // temp var to store char is rqrd only otherwise we wont b able to print chars
		rev(str, res);
		System.out.print(res);
	}
}