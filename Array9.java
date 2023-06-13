import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        String str = "Mot cong mot bang hai" + "\n Hai cong hai bang bon";
        int counta = 0;
        String[] number = new String[str.length()];
            String a ="";
        for (int i = 0; i < str.length(); i++) {
            a =("" + str.charAt(i));
            for (int j = 0; j < str.length(); j++) {
                if(a.equals(""+ str.charAt(j))) {
                    counta++;
                }
                 number[i]= a + ":" + counta;
            }
                counta = 0;
        }
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        String [] numbers1 = new String[number.length];
        int numbers1Count = 0;
        for (int i = 0; i < number.length; i++) {
            if ((i == 0 || (number[i] != number[i - 1]))) {
                numbers1[numbers1Count++] = number[i];
            }
        }
        for (int i = 0; i < numbers1Count; i++) {
            System.out.println(numbers1[i]);
        }

//        for (char a: number ) System.out.println(a);


    }
}
