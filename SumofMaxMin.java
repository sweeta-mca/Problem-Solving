import java.util.ArrayList;

public class SumofMaxMin {
    public int solve(ArrayList<Integer> A) { 
        int min = A.get(0);
        int max = A.get(0);
        for(int i =1 ; i<A.size();i++)
        {
            if(A.get(i)>max)
            {
                max = A.get(i);
            }

            if(A.get(i)<min)
            {
                min = A.get(i);
            }
        }

        return (min + max);
    }
}
