/*
        *
       ***
      *****
     *******
    *********
 */
package StarPatterns;

import java.util.Scanner;

public class Triangle3 {
    public static void main(String args[]){
        System.out.println("Enter number of rows: ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();

        // for(int i=0;i<n;i++)
        for(int i=1;i<=n;i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++){

                        System.out.print("*");
            }
            System.out.println();
        }

     }
}
