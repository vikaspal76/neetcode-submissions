class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]= new int[2*n];


        for(int j=0;j<2*n;j++){
            if(j>=n){
                ans[j]=nums[j-n];
            }
            else{
                ans[j]=nums[j];
            }
        }
        return ans;
        
    }
}