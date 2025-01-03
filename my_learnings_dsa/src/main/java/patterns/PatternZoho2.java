package org.practiseagain;

/****
 *    1    
 *   3 2
 *  6 5 4
 * 10 9 8 7
 * 10 9 8 7
 *  6 5 4
 *   3 2
 *    1
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * ***/

public class PatternZoho2 {
    public static void main(String[] args) {
            patternZoho2(4);
    }

    static void patternZoho2(int n){
        int number = 1;
        int numpattern= n-2;
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // star
            for(int j=1; j<=i; j++){
                System.out.print(number -- + " ");
            }
            number++;
            number = number + numpattern;
            numpattern += 2;



            // space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
        lowerTriangle(n);
    }

    static void lowerTriangle(int n){
        int number = 10;
        int numpattern = 1;
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }


            //star
            for(int j=1; j<=n-i+1; j++){
                System.out.print(number -- + " ");

            }
            number ++;
            number = number-numpattern;





            //space
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
