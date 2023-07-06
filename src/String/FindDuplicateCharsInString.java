package String;

//pending
public class FindDuplicateCharsInString {

	public static void main(String[] args) {
		dupes("fgdejhgfgshvhaaaaaaaaaaaaa"); // masteras
		System.out.println();
		kattaMethod("fgdejhgfgshvhaaaaaaaaaaaaa");
	}

	public static void dupes(String str) {
		char rep[] = new char[10];
		int count = 0;
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++)
			for (int j = 0; j < c.length; j++) {
				if (i != j && c[i] == c[j]) {
					boolean flag = true;
					for (int k = 0; k < rep.length; k++) {
						if (c[i] == rep[k]) {
							flag = false;
							break;
						}
					}
					if (flag)
						rep[count++] = c[i];
				}
			}
		for (int i = 0; i < count; i++)
			System.out.print(rep[i] + " ");
	}

//	METHOD 2 
	public static void kattaMethod(String str) {
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int count = 0;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j])
					count++;
			}
			if (count == 1) {
				System.out.println(c[i] + " is repeated");
			}
		}
	}

}

/*
 * Readme: approach was 1: pick a letter index wise using i loop until all
 * elements are compared 2:compare using j loop right from 0th until last index
 * so that we dont miss earlier repeatations of a letter(ex masteras) say if we
 * had j set i+1 at init it wud compare only elements ahead of it and the last s
 * even tho s being repeated wud b considered non repeated 3: i!=j cz otherwise
 * unique letters will also be considered repeated cz o on 1st index will be
 * compared to j=1 wala iteration n marked repeated then && c[i]==c[j] cz we
 * want only repeated letters 4:flag is to check if repeated (say second a) is
 * already in the array of repeated we've made of size 10 if it already exists
 * (ie first occurance of a stored in rep) then we set flag false break and
 * avoid it storing in rep again cz we want rep to be array of repeated chars in
 * string but rep itself will be unique chars 5: count has a vital role to keep
 * a track of nos of elements found and also sets them at those index and help
 * us with printing too
 * 
 */