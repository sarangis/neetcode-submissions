class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();

        for(String s: strs){
            String slower = s.toLowerCase();
            int[] key = new int[26];
            for(char ch: s.toCharArray()){
                key[ch - 97] = key[ch- 97] +1;
            }
            String keyStr = Arrays.toString(key);
            if(result.containsKey(keyStr)){
                result.get(keyStr).add(s);
            }else{
                List<String>  strList = new ArrayList<>();
                strList.add(s);
                result.put(keyStr, strList);
            }

        }
       return new ArrayList<>(result.values()) ;
    }
}
