package StringOfLength;

public class Welcome {
    public static void main(String[] args) {
        String str = "Wielcome";
        StringBuilder list = new StringBuilder();
        list.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)>list.charAt(list.length()-1)){
                list.append(str.charAt(i));
            }
        }
        System.out.println(list);
    }
}
