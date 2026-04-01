class Solution {
    public boolean isValid(String s) {

        if(s.length() % 2 !=0){
            return false;
        }
        Stack<Character> stack= new Stack<Character>();
        for(char a : s.toCharArray()){
            if(a == '(' || a== '{' || a=='['){
                stack.push(a);
            }else{
                if(stack.isEmpty()){
                    return false;
                };
                char last = stack.pop();
                if(last=='(' && a !=')'){
                    return false;
                } else if(last=='{' && a !='}'){
                    return false;
                }else if(last=='[' && a !=']'){
                    return false;
                }
            }
        }



        return stack.isEmpty();
    }
}
