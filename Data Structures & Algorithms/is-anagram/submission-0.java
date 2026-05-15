class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
            char ch2=t.charAt(i);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        for(char ch:map1.keySet()){
            int f1=map1.get(ch);
            if(map2.get(ch)==null) return false;
            int f2=map2.get(ch);
            if(f1!=f2) return false;

        }
        return true;





    }
}
