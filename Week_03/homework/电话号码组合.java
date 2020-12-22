class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        LinkedList<String> res = new LinkedList<>();
        search("", 0, res, digits, map);
        return res;

    }

    private void search(String s, int i, LinkedList<String> res, String digits, HashMap<Character, String> map) {
        if (i == digits.length()) {
            res.add(s);
            return;
        }
        String temp = map.get(digits.charAt(i));
        for (int j = 0; j < temp.length(); j++) {
            search(s+temp.charAt(j),i+1,res,digits,map);
        }

    }
}