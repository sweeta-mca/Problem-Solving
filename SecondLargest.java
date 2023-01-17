import java.util.ArrayList;

public class SecondLargest {
    public int solve(ArrayList<Integer> A) {
        if(A.size() < 2)
        return -1;
    
   
    int max = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int i=0;i<A.size();i++)
    {
        if(A.get(i) > max)
        {
            max = A.get(i);
        } 
    }

    for (int i=0;i<A.size();i++)
    {
        if(A.get(i) != max)
        {
            if(A.get(i) < max && A.get(i) > secondLargest) 
            {
                
                 secondLargest = A.get(i);
            }
           
        }
    }

    if(secondLargest == Integer.MIN_VALUE)
    {
        return -1;
    }

    return secondLargest;
    }
}
