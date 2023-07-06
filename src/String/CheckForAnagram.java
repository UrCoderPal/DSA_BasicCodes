package String;

public class CheckForAnagram {

	public static void main(String[] args) {
		boolean res = anagram("kneel", "kenel");
		System.out.println(res);
	}

	public static boolean anagram(String a, String b) {
		char c1[] = a.toCharArray();
		char c2[] = b.toCharArray();
		boolean isAn = false;
		if (c1.length == c2.length) // firstly both strings must have same length
		{
			for (int i = 0; i < c1.length; i++) // choose char by char from str1 to compare with all chars of str2
			{
				isAn = false; // assume no anagram
				for (int j = 0; j < c2.length; j++) {
					if (c1[i] == c2[j]) // if any one char in c2 matches c1 we stop(break) further searches n pick
										// another i
										// ie char in c1
					{
						isAn = true;
						break;
					}
				}
				if (isAn == false) // say if some(any one) char in c1 wasnt found in c2 isAn wont b true in above
									// if which is being refreshed for every iteration of i as false so it'll remain
									// false n in that case where even if one char is not present in c2 as in c1 we
									// dont look further n stop(break) the whole search then n there
					break;
			}
		}
		return isAn;

	}
}
