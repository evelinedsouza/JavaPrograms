/*
Prints the following output:
*
**
***
****
*****
 */

package StarPatterns;

import java.util.Scanner;

public class Triangle1 {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int n= in.nextInt();

        //Outer loop is for printing the rows and inner loop is for printing the columns
        for(int i=0;i<n;i++){
            // this loop will run till 'i' number of stars are printed
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
