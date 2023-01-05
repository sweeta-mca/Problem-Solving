/**
 * FindFactors
 */
public class FindFactors {

    // find factors
    // N iterations
    public int factorsCount(int A) {
        int count = 0;
        for(int i=1; i<=A;i++)
        {
            if(A%i == 0){                
                 count = count+1;                
            }
           
        }        
        return count;
    }

    // find factors optimized
    // sqrt(N) iterations
    public int factorsOptimizedCount(int A) {
        int count = 0;
        System.out.println("pairs");
        for(int i=1; i*i<=A;i++)
        {
            if(A%i == 0){
                System.out.println("("+i+","+(A/i)+")");
                if(i == A/i)
                {
                    count = count+1;   
                }else {
                    count = count+2;
                }
            }
           
        }
        return count;
    }
}