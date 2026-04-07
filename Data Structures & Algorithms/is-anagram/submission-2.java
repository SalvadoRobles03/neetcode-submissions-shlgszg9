class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> chars = new HashMap<>();
        for (char c : s.toCharArray()) {
                if(chars.containsKey(c)){
                    chars.put(c,chars.get(c)+1);
                }else{

                chars.put(c, 1);
                }
        }
        for (char c : t.toCharArray()) {
                if(chars.containsKey(c)){
                    if(chars.get(c) > 0){
                        chars.put(c,chars.get(c)-1);
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
        }

        return true;

    }
}
