class Solution {
    public boolean hasDuplicate(int[] nums) {
        // approch 1 crete hashset 
        // if no duplicate size of array==side of hashset
        /*HashSet<Integer> set= new HashSet<>();
        for(int ele:nums) set.add(ele);
        return nums.length!=set.size();
        */

        // using hashmap
        // check frequency of any element is 
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
           
        }
        for(int key:map.keySet()){
            if(map.get(key)>1) return true;
        }
        return false;


    }
}