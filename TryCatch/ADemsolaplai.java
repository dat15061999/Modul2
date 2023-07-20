package TryCatch;

public class ADemsolaplai {
    public static void main(String[] args) {
        System.out.println(encodeString("aaabbccaa"));
    }
    public static String encodeString(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char ch = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            } else {
                sb.append(ch);
                sb.append(count);
                ch = str.charAt(i);
                count = 1;
            }
        }
        sb.append(ch);
        sb.append(count);
        return sb.toString();
    }
}
