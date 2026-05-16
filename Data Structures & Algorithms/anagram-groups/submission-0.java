class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character, Integer>, ArrayList<String>> bigmap = new HashMap<>();

        for (String str : strs) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            if (bigmap.containsKey(map)) {
                bigmap.get(map).add(str);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                bigmap.put(map, list);
            }
        }

        return new ArrayList<>(bigmap.values());
    }
}