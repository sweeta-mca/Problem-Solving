/*
 * Given two integers A and B. A represents the count of mangoes and B represent the count of slices of mangoes. 
 * Mango can be cut into three slices of mangoes. A glass of mango shake can be formed by two slices of mangoes.
 * Find the maximum number of glasses of mango shakes you can make with A mangoes and B slices of mangoes initially.
 */

public class MakeIt {
    public int solve(int A, int B) {
    
        int shakesCount =0; 
        int slicesCount = 3*A; // slices from given mangoes
        int remainingSlices = slicesCount%2; // Remaining slices after making shakes
        int shakeFromExcessSlices = (remainingSlices+B)/2; // Add slices from user
        shakesCount = (slicesCount/2) + shakeFromExcessSlices; // mango shakes made

        return shakesCount;
    
    }
}
