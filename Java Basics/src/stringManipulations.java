import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class stringManipulations {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		
		

		int iI=123;
		
		int R=iI%100;
		int Q=iI/100;
		
		System.out.println(R);
		System.out.println(Q);
		
		
		
		
		// To input string only that is Word scan.next();
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING to revers");
		String Sname = scan.next();

		// To scan whole line
		/*
		 * InputStreamReader IRS = new InputStreamReader(System.in); String
		 * lo0ng= IRS.read();
		 */

		System.out.println("ENTER the words to know number of occurance");
		// To scan characters needs bufferedInputReader Stream
		BufferedInputStream bis = new BufferedInputStream(System.in);
		char searchWord = 0;
		try {
			searchWord = (char) bis.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// REGEX "\\b" to replace exact words in string using replaceAll()
		// System.out.println(s.replaceAll("\\bIS","SEXY"));
		String rev = "";
		int count = 0;
		String StringsplitResult = "";

		for (int i = Sname.length()-1; i >= 0; i--) {
			rev = rev + Sname.charAt(i);

		}

		// hardcode --->char dup = Sname.charAt(2);
		for (int i = 0; i <= Sname.length() - 1; i++) {

			if (searchWord == Sname.charAt(i)) {

				count = count + 1;
			}
		}

		for (int i = 0; i <= Sname.length() - 1; i++) {

			if (Sname.charAt(i) == 'A') {

				countA = countA + 1;

			}

			if (Sname.charAt(i) == 'B') {

				countB = countB + 1;

			}

			if (Sname.charAt(i) == 'C') {

				countC = countC + 1;

			}

			if (Sname.charAt(i) == 'D') {

				countD = countD + 1;

			}
		}

		/*
		 * String [] splits=s.split(""); for(int j=0;j<=splits.length-1;j++) {
		 * 
		 * System.out.println(splits[j]);
		 * 
		 * }
		 */

		System.out.println(Sname);

		String sub = "IS";
		int pos = Sname.indexOf(sub);

		// System.out.println(pos);
		// System.out.println(Sname.charAt(pos+sub.length()));
		// String rep=Sname.replace(Sname,"TEACHER");
		// System.out.println(rep);
		System.out.println(rev);
		System.out.println();
		//
		System.out.println("LETTER A COUNT::" + count);
		System.out.println(countA);
		System.out.println(countB);
		System.out.println(countC);
		System.out.println(countD);

	}

}