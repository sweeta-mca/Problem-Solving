/**
 * Given number A is prime ? 
 *  return 1 - prime
 *  return 0 - not a prime
 */
public class IsPrime {

   public int solve(Long A){
        if(A==1) return 0;
        for(Long  i=2L;i*i<=A;i++)
        {
            if(A%i==0){
                return 0;
            }
        }
        return 1;
   }
}
