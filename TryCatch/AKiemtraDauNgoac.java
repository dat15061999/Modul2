package TryCatch;

public class AKiemtraDauNgoac {
    public static void main(String[] args) {
        System.out.println(areBracketsBalanced("([{abc}])"));
    }

    public static boolean areBracketsBalanced(String str) {
        //Your code here
        java.util.Stack<Character> stack = new java.util.Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
