class Solution {
    public boolean isValid(String message) {

        Stack<Character> myStack = new Stack<>();

        for(int i=0; i<message.length(); i++) {
            char c = message.charAt(i);

            if(c == '(' || c =='[' || c == '{') {
                myStack.push(c);
            }

            //else if closing bracket doesn't match or stack is empty
            else if(c == ')') {
                if(myStack.empty() || myStack.peek() != '(') {
                    return false;
                }
                //otherwise just pop valid parenthesis
                else {
                    myStack.pop();
                }
            }
            else if(c == ']') {
                if(myStack.empty() || myStack.peek() != '[') {
                    return false;
                }
                else {
                    myStack.pop();
                }
            }
            else if(c == '}') {
                if(myStack.empty() || myStack.peek() != '{') {
                    return false;
                }
                else {
                    myStack.pop();
                }
            }
        }

        //check for remaining in stack
        if(myStack.empty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
