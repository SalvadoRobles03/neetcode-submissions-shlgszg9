class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        strsLoop:
        for(String s:strs){

            if(result.size() == 0){
                result.add(new ArrayList<>());
                result.get(0).add(s);
                continue;
            }else{
                for(List<String> sub:result){
                    if(isAnagram(sub.get(0),s)){
                        sub.add(s);
                        continue strsLoop;
                    }
                }
                result.add(new ArrayList<>());
                result.get(result.size()-1).add(s);
            }

        }



        return result;

        
    }

    private Boolean isAnagram(String x, String y){

        if(x.length() != y.length()){
            return false;
        }

        Map<Character,Integer> countX = new HashMap<>();
        Map<Character,Integer> countY = new HashMap<>();

        for(char c:x.toCharArray()){
            if(countX.containsKey(c)){
                countX.put(c,countX.get(c)+1);
            }else{
                countX.put(c, 1);
            }
        }
        for(char c:y.toCharArray()){
            if(countY.containsKey(c)){
                countY.put(c,countY.get(c)+1);
            }else{
                countY.put(c, 1);
            }
        }

        if(countX.equals(countY)){
            return true;
        }

        return false;
    }
}
