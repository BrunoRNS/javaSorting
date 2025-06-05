// This is the implementation of a counting sort method for lower case strings, findable in: 
// https://www.geeksforgeeks.org/problems/counting-sort/1

import java.util.Scanner;

public class CountingSort {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        String input = sc.nextLine();

        char max = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {

            if (max < input.charAt(i)) {

                max = input.charAt(i);

            }

        }

        int[] count = new int[((int) max) + 1];

        for (int i = 0; i < input.length(); i++) {

            count[(int) input.charAt(i)] += 1;

        }

        int k = 0;

        char[] output = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {

            while (count[k] == 0) {

                k++;
            }

            output[i] = (char) k;

            count[k]--;

        }

        System.out.println(new String(output));

    }
    
}
