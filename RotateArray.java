import java.util.ArrayList;

public class RotateArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int n= A.size();
        if(B>n) 
        {
            B = B%n;
        }   
        reverseInRange(A, 0, n-1);
        reverseInRange(A, 0, B-1);
        reverseInRange(A, B, n-1);

        return A;
    }

    public ArrayList<Integer> reverseInRange(ArrayList<Integer> A, int B, int C) {
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
