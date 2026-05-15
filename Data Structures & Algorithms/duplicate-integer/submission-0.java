class Solution {
    public boolean hasDuplicate(int[] nums) {
        // approch 1 crete hashset 
        // if no duplicate size of array==side of hashset
        HashSet<Integer> set= new HashSet<>();
        for(int ele:nums) set.add(ele);
        return nums.length!=set.size();
    }
}