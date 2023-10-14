import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack valid = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(!valid.empty() && valid.peek().equals('(')){
                    valid.pop();
                }else{
                    valid.push(s.charAt(i));
                }
            }else if(s.charAt(i)=='}'){
                if(!valid.empty() && valid.peek().equals('{')){
                    valid.pop();
                }else{
                    valid.push(s.charAt(i));
                }
            }else if(s.charAt(i)==']'){
                if(!valid.empty() && valid.peek().equals('[')){
                    valid.pop();
                }else{
                    valid.push(s.charAt(i));
                }
            }else{
                valid.push(s.charAt(i));
            }
        }
        return valid.isEmpty();
    }
}