import java.util.Arrays;

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int max = 0;
        int maxIndex = 0;

        for(int i = 0; i < mat.length; i++) {

            //at time of implementation.. didn't know this was slower in actuality than just a for loop...
            int sum = Arrays.stream(mat[i]).sum();
            System.out.println("sum: " + sum + " at row: " + i);

            if(sum > max) { maxIndex = i; }
            max = Math.max(max, sum);
        }
        return new int[]{maxIndex, max};
    }
}