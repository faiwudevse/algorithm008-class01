class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }

        Map<String, List> hm = new HashMap<>();
        int[] count = new int[26];
        for(String s : strs) {
            Arrays.fill(count, 0);

            for(char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for (int num : count) {
                sb.append(num);
            }

            String key = sb.toString();
            
            if(!hm.containsKey(key)) {
                hm.put(key, new ArrayList());
            }

            hm.get(key).add(s);
        }

        return new ArrayList(hm.values());
    }
}