package Easy;

import java.util.Stack;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty() || (st.peek() == '(' && c != ')') || (st.peek() == '{' && c != '}') || (st.peek() == '[' && c != ']')) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses_20 test = new ValidParentheses_20();
        String s = "([)]";
        System.out.println(test.isValid(s));
    }
}
