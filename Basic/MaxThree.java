public class MaxThree {
    public static void main(String[] args) {
        System.out.println(maxBetweenThree(10,21,7));
    }

    private static int maxBetweenThree(int i, int j, int k) {
        int max = i;
        if (j > max) {
            max = j;
        }
        if (k > max) {
            max = k;
        }
        return max;
    }
}
