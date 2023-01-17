import java.util.ArrayList;

public class ReverseInRange {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        while(B<C && C<A.size() )
        {
            Integer t = A.get(B);
            A.set(B, A.get(C));
            A.set(C, t);
            B++;
            C--;
        }
        return A;
    }

    
    
}
