package bit.com;

import org.testng.annotations.Test;

public class InterveiwQuestion {

	public void test10() {
		String s = "Hi";
		String s1 = new String("hi");

		// String Buffer is synchronized and mutable class
		StringBuffer st = new StringBuffer("hi whats up");
		StringBuffer pp = st.append(" sanchita");
		System.out.println(st);
		StringBuffer vv = st.reverse();
		System.out.println(st);

		StringBuffer s3 = new StringBuffer("hi");

		System.out.println(s3.toString().equals(s1));

		// StringBuilder is not synchronized and mutable class
		StringBuilder s2 = new StringBuilder("hi");

	}

	int currentCaracter = 1;
	int maxnum = 1;
	char cd;

	public void higestOccuranceCharacter() {
		String s = "united state of america";
		char jj[] = s.toCharArray();
		for (int i = 0; i < jj.length; i++) {
			for (int j = i + 1; j < jj.length; j++) {
				if (jj[i] == jj[j]) {
					currentCaracter++;
				}

			}

			System.out.println(jj[i] + " ocurance " + currentCaracter);
			if (currentCaracter > maxnum) {
				maxnum = currentCaracter;
				cd = jj[i];

			}
			currentCaracter = 1;

		}
		System.out.println(cd + " ocurrence " + maxnum + " times and its highest");

	}

	int currentCharCount = 1;

	int maxCount = 1;

	char c;

	public void highestOccuredCharacter() {
		String s = "united state of americat";
		char[] arrs = s.toCharArray();
		for (int i = 0; i < arrs.length; i++) {
			for (int j = i + 1; j < arrs.length; j++) {
				if (arrs[i] == arrs[j]) {
					currentCharCount++;
				}
			}
			System.out.println(arrs[i] + " occured " + currentCharCount);

			if (currentCharCount > maxCount) {
				maxCount = currentCharCount;
				c = arrs[i];
			}
			currentCharCount = 1;
		}
		System.out.println(c + " occured " + maxCount + " times");

	}

	String c1 = "";

	public void cheackpalidrome() {
		String word = "maefm";

		for (int i = word.length() - 1; i >= 0; i--) {

			// why i have to use c1="" and plus to here
			c1 = c1 + word.charAt(i);

		}
		if (word.equals(c1)) {
			System.out.println("is polindrom");

		} else {
			System.out.println("is not polindrom");
		}

	}

	public void polindrom() {
		String a = "mosaddm";
		String reversed = new StringBuffer(a).reverse().toString();

		if (a.equals(reversed)) {
			System.out.println("is polindrom");

		} else {
			System.out.println("is not polindrom");

		}
	}

	public void primeNum() {
		int x = 5;
		boolean flag = false;

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				System.out.println(x + " is not prime number");
				flag = false;
				break;
			}

		}
		if (flag == false) {
			System.out.println(x + " is prime number");
		}

	}

	public void swapTwoNum() {
		int a = 7;
		int b = 5;
		System.out.println(a = a + b);
		System.out.println(b = a - b);
		System.out.println(a = a - b);
		System.out.println("a value is " + a);
		System.out.println("b value is " + b);
	}

	public void findFabonacciNumber() {

		int f1 = 1;

		int f2 = 1;

		int f3;

		for (int i = 1; i <= 10; i++) {

			f3 = f1 + f2;// 2 3 5

			f1 = f2;// 2

			f2 = f3;// 3

			System.out.println(f3);

		}

	}

	public void FactorialExample() {
		int num = 5;
		int count = 1;

		for (int i = 1; i <= 5; i++) {
			count = i * count;
		}
		System.out.println(num + " of factorial is " + count);
	}

	@Test
	public void Fabonaci() {

		int num1 = 1;
		int num2 = 2;
		int num3;

		for (int i = 1; i < 10; i++) {

			num3 = num1 + num2;
			// why we need to swap
			num1 = num2;
			num2 = num3;
			System.out.println(num3);
		}

	}
}
