package CheckBrackets;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        String math = "s * (s – a) * (s – b) * (s – c)";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < math.length(); i++) {
            char c = math.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ']' || c == ')' || c == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Khong dung");
                    break;
                }
                char top = stack.pop();
                if ((c == ']' && top != '[') || (c == ')' && top != '(') || (c == '}' && top != '{')) {
                    System.out.println("Khong dung");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Dung");
        } else {
            System.out.println("Khong dung");
        }
    }
}

