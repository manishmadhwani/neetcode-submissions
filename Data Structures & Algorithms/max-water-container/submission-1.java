class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j= heights.length-1;
        int maxWater= 0;
        while (i< j) {
            int water= heights[i]<heights[j]
                ? heights[i]* (j-i)
                : heights[j]* (j-i);
            // System.out.println(water);
            maxWater= Math.max(maxWater, water);
            if (heights[i]<heights[j]) i++;
            else j--;
        }
        return maxWater;
    }
}
