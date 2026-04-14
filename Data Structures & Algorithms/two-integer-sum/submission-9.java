class Solution {
    public int[] twoSum(int[] nums, int target) {
        int difference = 0;
        int[] summ = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];
            if(map.containsKey(difference)){
                summ[1] = i;
                summ[0] = map.get(difference);
                return summ;
            }
            else {
                map.put(nums[i],i);
            }
        }
        return summ;
    }
}
