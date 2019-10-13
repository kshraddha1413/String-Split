
public class SplitString {

	public static void main(String[] args) {
		String str = "My name is Super Khan";
		StringBuilder stringBuilder = new StringBuilder();
		String[] starr = str.split(" ");// split string ny white spaces
		for (int i = starr.length - 1; i >= 0; i--) {
			if (i == 0) {
				stringBuilder = stringBuilder.append(starr[i]);
			} else {
				stringBuilder = stringBuilder.append(starr[i]).append(" ");
			}
		}
		System.out.println(stringBuilder);

		String str1 = "I am @ office @ michigan";
		String[] arr = str1.split("@");
		for (String s : arr) {
			System.out.println(s);
		}

	}

}
