class MinStack {

    private Stack<Integer> stac;
    private Stack<Integer> min;

    public MinStack() {
        stac = new Stack<Integer>();
        min = new Stack<Integer>();
    }
    
    public void push(int val) {
        stac.push(val);
        if(min.isEmpty()){
            min.push(val);
        }else if(val <= min.peek()){
            min.push(val);
        }
    
        
    }
    
    public void pop() {
       if(!stac.isEmpty() && !min.isEmpty()){
            if(stac.peek().equals(min.peek())){
                min.pop();
            }
            stac.pop();
       }
    }
    
    public int top() {
        return !stac.isEmpty() ? stac.peek() : null;
    }
    
    public int getMin() {
        return !min.isEmpty() ? min.peek() : null;
    }
}
