package lab2;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Main extends Tree {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int i = 0, j = 0;
		PriorityQueue<Tree> PQ = new PriorityQueue<Tree>();
		System.out.println("Enter string : ");
		String s1 = scan.nextLine();
		String s2 = "";

		for (i = 0; i < s1.length(); i++) {
			count = 0;
			if ((s2.indexOf(s1.charAt(i)) == -1)) {
				s2 += s1.charAt(i);
			} 
			else {
				continue;
			}
			for (j = 0; j <= s1.length() - 1; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					count++;
				}
			}

			//System.out.println(count);
			Tree myTree = new Tree(count, s1.charAt(i));
			PQ.add(myTree);
		}
		//System.out.println(s1);
		for (i = PQ.size(); i > 0; i--) {
			System.out.print((PQ.poll()).ch);
		}
	}
}