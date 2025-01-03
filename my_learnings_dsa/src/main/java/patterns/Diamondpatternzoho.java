package org.patterns;

public class Diamondpatternzoho {
    public static void main(String[] args) {
            diamondpattern(3);
    }
    static void diamondpattern(int n){
        int star = 1;
        //row
        for(int i = 1; i<=n; i++){
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 1; j<=star; j++){
                System.out.print("*");
            }
            star = star + 2;
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        lowertriangle(n-1);

    }

    static void lowertriangle(int n){
        int star = 3;
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            star = star - 2;

            //space
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println();


        }
    }
}
