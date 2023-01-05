public class App {
    public static void main(String[] args) throws Exception {
        // Question1 : Find factors count of a Number A
        FindFactors f = new FindFactors();
        System.out.println("Factors count = "+f.factorsCount(4));
        System.out.println("Optimized");
        System.out.println("Factors count = "+f.factorsOptimizedCount(4));
    }
}
