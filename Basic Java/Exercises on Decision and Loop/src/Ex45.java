
public class Ex45 {
	public static void main(String[] args) {
		int lowerbound = 1;
		int upperbound= 110;
		int cnt = 0;
		for (int i = lowerbound; i <= upperbound; i++) {
			if (i % 15 == 0) {
				System.out.print("CozaLoza ");
			} else if (i % 5 == 0) {
				System.out.print("Loza ");
			} else if (i % 3 == 0) {
				System.out.print("Coza ");
			} else if (i % 7 == 0) {
				System.out.print("Woza ");
			} else {
				System.out.print(i + " ");
			}
			++cnt;
			if (cnt % 11 == 0) {
				System.out.println();
			}
		}
	}
}
