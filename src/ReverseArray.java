import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public ArrayList<Integer> solve(final List<Integer> A) { 
        ArrayList<Integer> B = new ArrayList<>(A);
        int i = 0;
        int j = A.size()-1;
        while(i<j)
        {
            Integer t = B.get(i);
            B.set(i, B.get(j));
            B.set(j, t);
            i++;
            j--;
        }
        return B;
    }
}
