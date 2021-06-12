package reduce;

public class CombineString {

	public static String combine(String a, String b) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length() || i < b.length(); i++) {
			if (i < a.length()) {
          sb.append(a.charAt(i));
			}

			if (i < b.length()) {
          sb.append(b.charAt(i));
			}
		}

		return sb.toString();
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "anckd";
		String b = "owu";
		String ans = combine(a, b);

		System.out.print(ans);
	}

}
