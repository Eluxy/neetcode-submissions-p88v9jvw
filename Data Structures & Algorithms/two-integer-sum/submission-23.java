class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> indices = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // j начинается с i+1, чтобы избежать i==j
                if (nums[i] + nums[j] == target) {
                    indices.add(i);
                    indices.add(j);
                    // Преобразуем Set в массив
                    int[] result = new int[indices.size()];
                    int index = 0;
                    for (int num : indices) {
                        result[index++] = num;
                    }
                    return result;
                }
            }
        }
        return new int[0]; // если не найдено (по условию всегда найдётся)
    }
}
