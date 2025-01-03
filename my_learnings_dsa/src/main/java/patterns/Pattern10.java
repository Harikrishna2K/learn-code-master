package patterns;

public class Pattern10 {
	  public static void main(String args[]) {
	        pattern(5);
	        lowerPattern(5);
	    
	  }
	  
	  static void pattern(int n){
	      //row
	      for(int i = 1 ; i <= n; i++){
	        //space
	        for(int j = 1; j<=n-i+1; j++){
	            System.out.print(" ");
	        }
	        // Star
	        for(int j = 1; j<=(2*i)-1 ; j++){
	            System.out.print("*");
	        }

	        //space
	        for(int j = 1; j<=n-i+1; j++){
	            System.out.print(" ");
	        }
	        System.out.println();
	        
	      }
	  }
	  
	  static void lowerPattern(int n){
	      //row
	      for(int row = 1; row<=n ; row++){
	          //space
	          for(int col = 1; col <= row; col ++){
	              System.out.print(" ");
	          }
	          
	          //star
	          for(int col = 1; col <= (2*n)-(2*row)+1 ; col++){
	              System.out.print("*");
	          }
	          //space
	          for(int col = 1; col <= row; col ++){
	              System.out.print(" ");
	          }
	          System.out.println();
	      }
	  }
	}