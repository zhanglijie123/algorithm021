class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {
            if(strs.length ==0){
                return new ArrayList<>();
            }
            HashMap<String, ArrayList> map  = new HashMap<>();
            for(String s : strs){
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String str = String.valueOf(chars);
              
                if(!map.containsKey(str)){
                    map.put(str,new ArrayList());
                }
                map.get(str).add(s);
            }
            return new ArrayList(map.values());
        }
    
}