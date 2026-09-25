class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length * 2;
        int[] output = new int[n];
        for (int i = 0; i < n; i++) 
            output[i] = nums[i % nums.length];
        return output;
    }
}