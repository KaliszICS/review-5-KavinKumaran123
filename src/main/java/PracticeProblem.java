import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double a = s.nextDouble();
		System.out.println(Math.abs(a));
		
	}

	public static void q2() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double a = s.nextDouble();
		System.out.print("Input another number: ");
		double b = s.nextDouble();
		double c = a/b;
		System.out.println(Math.floor(c));
		System.out.println(Math.ceil(c));
		
	}

	public static void q3() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double a = s.nextDouble();
		double b = Math.sqrt(a);
		System.out.println(Math.round(b));
		
	}

	public static void q4() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		int a = s.nextInt();
		System.out.print("Input another number: ");
		int b = s.nextInt();
		System.out.println(Math.pow(a,b));
		
	}

	public static void q5() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double a = s.nextDouble();
		System.out.print("Input another number: ");
		double b = s.nextDouble();
		System.out.print("Input one more number: ");
		double c = s.nextDouble();
		System.out.println(Math.max(a, Math.max(b,c)));
		System.out.println(Math.min(a, Math.min(b,c)));
		
	}
	public static void q6() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String a = s.nextLine();
		System.out.println(a.contains("on"));
		
	}
	public static void q7() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String a = s.nextLine();
		System.out.println(a.equalsIgnoreCase("mango"));
		
	}
	public static void q8() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a word: ");
		String a = s.nextLine();
		System.out.print("Input a letter: ");
		String b = s.nextLine();
		System.out.println(a.indexOf(b));
		System.out.println(a.lastIndexOf(b));
		
	}

	public static void q9() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String a = s.nextLine();
		int b = a.length();
		System.out.println("Your sentence is "+ b +" characters long");
		
	}
	public static void q10() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String a = s.nextLine();
		System.out.print("Input a word to replace: ");
		String b = s.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String c = s.nextLine();
		System.out.println(a.replaceAll(b,c));

		
		
	}

	public static void q11() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String a = s.nextLine();
		a = a.trim();
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
	}

	public static void q12() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a word: ");
		String a = s.nextLine();
		System.out.println(a.substring(0,4));
		System.out.println(a.substring(a.length()-4));
		
	}
	

}
