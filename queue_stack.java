class MyQueue {
    Stack<Integer> pushStack = new Stack<>();
    Stack<Integer> popStack = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
          pushStack.add(x);
    }
    
    public int pop() {
        transferItems();
        return popStack.pop();
        
    }
      private void transferItems() {
        if (popStack.isEmpty()) {
            // Transfer elements onto the pop stack
            while (!pushStack.isEmpty()) {
                popStack.add(pushStack.pop());
            }
        }
    }
    
    public int peek() {
         transferItems();
        return popStack.peek();
        
    }
    
    public boolean empty() {
        
        transferItems();
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}
