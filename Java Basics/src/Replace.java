public class Replace {

	/*
	 * String value = "ABCASS@HHKK"; int posi = value.indexOf("@"); value =
	 * value.substring(0, posi); posi = value.lastIndexOf("."); //seperates
	 * substrins from word(abcA) value = value.substring(posi + 3);
	 * System.out.println(value);
	 */

	public int reverseNumber(int number) {

		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String a[]) {
		Replace nr = new Replace();
		System.out.println("Result: " + nr.reverseNumber(17868));
	}
}
