class Solution {

    public String encode(List<String> strs) {

        StringBuffer buffer =  new StringBuffer();
        strs.forEach(str -> buffer.append(str.length()+"#"+str)) ;
        System.out.println(buffer.toString());
        return buffer.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        StringBuffer buffer = new StringBuffer();
        int i=0;
        while(i< str.length()){
            if(str.charAt(i) == '#'){
                int len = Integer.valueOf(buffer.toString());
                result.add(str.substring(i+1, i+1+ len));
                i = i + 1 + len;
                buffer = new StringBuffer();
            }else{
                buffer.append(str.charAt(i));
                ++i;
            }
            
        }
       return result; 
    }
}
