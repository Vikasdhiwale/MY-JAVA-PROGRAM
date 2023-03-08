package Com.question;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = new int[10];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 2;
		arr[3] = 1;
		arr[4] = 9;
		arr[5] = 88;
		arr[6] = 44;
		arr[7] = 4;
		arr[8] = 7;
		arr[9] = 3;
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			
			// System.out.println(arr[i]);
			 
		}System.out.println(list);
	}
}
