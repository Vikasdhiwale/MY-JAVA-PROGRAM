package Com.question;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List.*;
public class ReverseString {
	public static void main(String[] args) {
		
	
		String Mc = "Rupesh Sadavarte";
		String rev = ""; 
		  
//		StringBuilder sb = new StringBuilder(Mc);
//		sb.reverse();
//		System.out.println(sb);
		ArrayList<String> lis = new ArrayList<>();
		
		int len = Mc.length();
		System.out.println(len);
		for (int i = len-1 ; i>= 0; i--) {
			rev = rev + Mc.charAt(i);
			lis.add(rev);
		}
		System.out.println("Reverse String : " + rev);
		System.out.println(lis);
		Collections.reverse(lis);
		System.out.println(lis);
		
		
}
}