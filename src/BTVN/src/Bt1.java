import java.util.Stack;

public class Bt1 {
    public static boolean checkBracket(String expression) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char left = expression.charAt(i);
            if (left == '(') myStack.push(left);
            else if (left == ')')
                if (myStack.isEmpty()) return false;
                else {
                    char right = myStack.pop();
                    if (right != '(') return false;
                }
        }
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "((1+(1)))";
        System.out.println(checkBracket(expression));
    }
}
