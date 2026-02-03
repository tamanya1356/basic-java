public class numberprint4 {
    public static void main(String args[]){
      int n = 5;
      // outer loop
      for (int i = 1; i <= n; i++) {
         // inner loop
         for (int j = 1; j <= i; j++) {  // when i=1; j=1; j<=i means print j up to i
            int sum = i + j;
            if (sum % 2 == 0) { // ki print hobe 
               System.out.print("1"); // even thakle 1 odd thakle 0
            } else { // odd -> 0
               System.out.print("0");
            }
         }
         System.out.println();
      }
   }
}
    

    

