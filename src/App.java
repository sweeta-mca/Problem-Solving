import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Question1 : Find factors count of a Number A
        /*
        FindFactors f = new FindFactors();
        System.out.println("Factors count = "+f.factorsCount(4));
        System.out.println("Optimized");
        System.out.println("Factors count = "+f.factorsOptimizedCount(4));
         */
         // Question2 : Is Number A prime
         /*
         System.out.println("Is Prime");
         IsPrime p = new IsPrime();
         System.out.println(p.solve(99990000000L));
        */

         // Question3 : perfect square
         /*
         System.out.println("perfect square");
         PerfectSquareRoot ps = new PerfectSquareRoot();
         System.out.println(ps.solve(625));
          */

        // Question4 : count of primes
        /*
        System.out.println("Count of Primes");
        CountOfPrimes cp = new CountOfPrimes();
        System.out.println("count ="+cp.solve(19));
         */

        // Question5 : Perfect Number
        /*
        System.out.println("Perfect Number");
        PerfectNumber p = new PerfectNumber();
        System.out.println("isperfect ="+p.solve(6));  
         */

        // Question5 : Perfect Number        
       /* System.out.println("Make It");
        MakeIt m = new MakeIt();
        System.out.println("Number of shakes  ="+m.solve(7,1));  
         */
        /*
         System.out.println("reverse");
         ReverseInRange r = new ReverseInRange();
         ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,5,6));
         ArrayList<Integer> result = r.solve(A, 0, 2);
         System.out.println(result.toString());

        */
        /*
         System.out.println("reverse");
         ReverseArray r = new ReverseArray();
         ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,1,10));
         ArrayList<Integer> result = r.solve(A);
         System.out.println(result.toString());
 */
         // RotateArray

         /*
         System.out.println("rotate");
         RotateArray r = new RotateArray();
         ArrayList<Integer> A = new ArrayList<>(Arrays.asList(7, 4, 2, 10, 5));
         ArrayList<Integer> result = r.solve(A,12);
         System.out.println(result.toString());
         */

         SumofMaxMin r = new SumofMaxMin();
         ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-2,1,-4,5,3));
         System.out.println(r.solve(A));
         
    }
}
