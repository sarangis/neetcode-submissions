class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        int[] response = new int[26];
        for(char ch : s.toCharArray()){
            response[ch-97] = response[ch-97]+1;
        }
        for(char ch : t.toCharArray()){
            response[ch-97] = response[ch-97]-1;
        }
        for(int val : response){
            if(val != 0) {
                return false;
            }
        }
       return true;
    }
}
