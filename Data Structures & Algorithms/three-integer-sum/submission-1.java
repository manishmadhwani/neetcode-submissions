class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> answer= new HashSet<>();
        for (int i=0; i<nums.length-1; i++) {
            for (int j= i+1; j<nums.length; j++) {
                if (binarySearch(nums, j+1, nums.length-1, -(nums[i]+nums[j]))) {
                    List<Integer> foundAnswer= new ArrayList<>();
                    foundAnswer.add(nums[i]);
                    foundAnswer.add(nums[j]);
                    foundAnswer.add(-nums[i]-nums[j]);
                    answer.add(foundAnswer);
                } 
            }
        }
        return new ArrayList<>(answer);
    }

    public static boolean binarySearch(int[] nums, int start,
                int end, int target) {
        int mid= 0;
        while (start<=end) {
            mid= (start+1+(end-1))/2;
            if (nums[mid]== target) return true;
            else if (nums[mid]> target) {
                end= mid-1;
            } else {
                start= mid+1;
            }
        }
        return false;
    }
}
