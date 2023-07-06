package String;

public class First_NonRepeated_Char {

	public static void main(String[] args) {
		String input = "ssassy";
		char firstNonRepeatedChar = findFirstNonRepeatedChar(input);

		if (firstNonRepeatedChar != '\0') {
			System.out.println("First non-repeated character: " + firstNonRepeatedChar);
		} else {
			System.out.println("No non-repeated character found.");
		}
	}

	public static char findFirstNonRepeatedChar(String str) {
		char[] chars = str.toCharArray();
		int n = chars.length;
		char prior = 0;
		// Iterate over each character
		for (int i = 0; i < n; i++) { // ssassy ssama sam
			boolean isUnique = true;
			if (chars[i] == prior)
				continue; // to reduce iterations ie recomparing 's' multiple times

			// Compare the character with all other characters
			for (int j = 0; j < n; j++) {
				// Skip comparing the character with itself
				if (i != j) {
					// If a match is found, the character is not unique
					if (chars[i] == chars[j]) {
						isUnique = false;
						prior = chars[i];
						break;
					}
				}
			}

			// Return the first unique character found
			if (isUnique) {
				return chars[i];
			}
		}

		// If no unique character found
		return '\0';
	}

}
