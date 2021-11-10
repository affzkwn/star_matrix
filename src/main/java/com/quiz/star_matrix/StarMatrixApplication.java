package com.quiz.star_matrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class StarMatrixApplication {

	public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [][] arr = new String [n][n];
        
        for (int x = 0; x < n; x++) {
            for(int y = 0; y < n; y++) {
                if (y == x) {
                    arr[x][y] = ("*");
                }
                else if (x == (n-1)/2) {
                    arr[x][y] = ("*");
                }
                else if (y == (n-1)/2) {
                    arr[x][y] = ("*");
                }
                else if (y + x == n-1) {
                    arr[x][y] = ("*");
                }
                else
                arr[x][y] = (".");
            }
        }
        
        for (int x = 0; x < n; x++) {
            for(int y = 0; y < n; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println("");
        }
		scan.close();
	}

}
