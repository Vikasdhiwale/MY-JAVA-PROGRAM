package Com.question;

import java.util.ArrayList;

public class FindAllPrimeNo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int n1 = 2;
		int n2 = 30;
	
		for (n1 = 2; n1 <= n2; n1++) {
			int count = 0;
			for (int i = 1; i <= n1; i++) {
				if (n1 % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				//System.out.println(n1 + " ");
				list.add(n1);
			}
		}
		System.out.println(list);
	}

}
