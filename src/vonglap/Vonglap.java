
package vonglap;

import java.util.Random;
import java.util.Scanner;


public class Vonglap {
    
    public static void main(String[] args) {
            System.out.println("Homer says :");
        for (int i =1 ; i<=4;i++) {
            System.out.println("I am so smart");
        }
            System.out.println("S-M-R-T... I MEAN  S-M-A-R-T");
        
        for(int i=1 ;i<=4;i++ ) {
            System.out.println(i + " squared = " + i * i );
        }
            System.out.println("Whoo!");
        
            System.out.println("T-minus ");
        for(int i=10;i>=1;i--) {
            System.out.print( i + ",");
        }
        
            System.out.println("blasstoff!");
            System.out.println("The end .");
        
        for (int i = 1; i<=5;i++) {
            for(int j = 1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
        
        Scanner console = new Scanner(System.in);
        int sum =0;
        int number =1;
        
        while (number != 0 ){
            System.out.println("Enter a number (0 to quit) :");
            number = console.nextInt();
            sum = sum +number;
        }
        System.out.println("The total is "  + sum);
        
        //random
        Random rand = new Random();
        int r = rand.nextInt(3);
        if (r ==0 ){
            System.out.println("Rock");
        } else if (r==1) {
            System.out.println("Paper");
        }else {
            System.out.println("Scissors");
        }
    }
    
}
