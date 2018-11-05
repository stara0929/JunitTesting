import java.io.*;
import java.math.*;
import java.util.*;

public class Brbb {
    int N;
    int cnt = 3;
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    ArrayList<Integer> finalarr = new ArrayList<Integer>(N);

    void run() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        printCombinations(N, 0, 0, cnt);
    }

    void printCombinations(int target, int from, int index, int cnt) {
        if (target == 0)
        {
            if(index == 3)
            {
                for (int i = 0; i < index; i++) {
                    System.out.print(finalarr.get(i) + " ");
                }

                System.out.println();
            }
        }

        else if (target < 0 || from >= arr.length || cnt == 0) {

            return;
        }

        else {

            finalarr.add(index, arr[from]);
            printCombinations(target - arr[from], from, index + 1, cnt - 1);
            printCombinations(target, from + 1, index, cnt);


        }
    }
    public static void main(String[] args)
    {
        new Brbb().run();
    }
}
