package org.patterns;

public class SnakePattern {
    public static void main(String[] args) {
            snakepattern(4);
    }

    static void snakepattern(int n){
        int number = 1;
        for(int i=1; i<=n; i++){
            // to print the column
           if(i%2 != 0){
               for(int j = 1; j<=n; j++){
                   System.out.print(number++ + " ");
               }
           }else{
               int temp = number + n - 1;
               for (int j = 1; j<=n; j++){
                   System.out.print(temp -- + " ");
               }
               number = number + n;
           }
           System.out.println();

        }
    }
}
