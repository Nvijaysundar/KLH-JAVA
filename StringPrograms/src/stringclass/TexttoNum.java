package stringclass;

public class TexttoNum {
	public static void main(String[] args) {
		String st = "4575-abc-54r";
		st = st.toUpperCase().replaceAll("[ABC]", "2")
				.replaceAll("[DEF]","3")
				.replaceAll("[GHI]","4")
				.replaceAll("[JKL]","5")
				.replaceAll("[MNO]","6")
				.replaceAll("[PQRS]","7")
				.replaceAll("[TUV]","8")
				.replaceAll("[WXYZ]","9");
		System.out.println(st.toString());
	}
}
