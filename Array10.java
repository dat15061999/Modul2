import java.util.HashMap;

public class Array10 {
    public static void main(String[] args) {
        String str = "Mot cong mot bang hai" + "\n Hai cong hai bang bon";
        HashMap<Character,Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                int count = charCount.get(c);
                charCount.put(c, count + 1);
            } else {
                charCount.put(c, 1);
            }
        }

            for (char c : charCount.keySet()) {
                int count = charCount.get(c);
                System.out.println(c + ": " + count);
            }
    }
}
