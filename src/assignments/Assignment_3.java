package assignments;

public class Assignment_3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print(" *");
			}
			System.out.println();
		}

		System.out.println("\n\n\n");

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
