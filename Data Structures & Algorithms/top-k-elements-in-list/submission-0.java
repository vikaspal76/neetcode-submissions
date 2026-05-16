class Solution {

    class Pair{
        int ele;
        int freq;
        Pair(int ele,int freq){
            this.ele=ele;
            this.freq=freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer>  map= new HashMap<>();
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->a.freq-b.freq);
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int key:map.keySet()){
            Pair p= new Pair(key,map.get(key));
            pq.add(p);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int ans[]= new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().ele;
        }
        return ans;


        
    }
}
