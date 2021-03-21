//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1].
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // use HashMap to store the answer
        Map<Integer, Integer> map = new HashMap<>();
        //loop through the array
        for (int i = 0; i < nums.length; i++) {
            //get the value of x
            int x = target - nums[i];
            //try to find x is in the array
            if (map.containsKey(x)) {
                //if x is in they array, return a new array which are index of those two number
                return new int[]{i, map.get(x)};
            }
            //store value and index into map, key = current number, value = index of current number
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


