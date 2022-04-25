/*
This program prints the below output:
*****
****
***
**
*

 */
package StarPatterns;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String args[]){
        System.out.println("Enter number of rows to be printed: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i=0;i<n;i++){
            // This loop is to print n-i stars in each row
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
