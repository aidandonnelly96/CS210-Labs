package lab2;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Tree implements Comparable<Tree> {
	public int frequency;
	public char ch;

	public Tree(int num, char a) {
		frequency = num;
		ch = a;
	}

	public int compareTo(Tree object) {
		// compare the cumulative frequencies of the tree
		// must return -1,0, or 1
		if (frequency - object.frequency < 0) {
			return 1;
		} else if (frequency - object.frequency > 0) {
			return -1;
		} else {
			if(ch < object.ch){
				return -1;
			}
			else{
				return 1;
			}
				// return 0 if they're the same
		}
	}

}
