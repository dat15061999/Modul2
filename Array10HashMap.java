import java.util.HashMap;
import java.util.Scanner;

public class Array10HashMap {
    public static void main(String[] args) {
        HashMap <String,String> user =new HashMap<>();
            user.put("username1","1234567");
            user.put("username2","1234567");
            user.put("username3","1234567");
            user.put("username4","1234567");
            user.put("username5","1234567");
            user.put("username6","1234567");
            user.put("username7","1234567");
            user.put("username8","1234567");
            user.put("username9","1234567");
            user.put("username10","1234567");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap username");
        String username = input.nextLine();
        System.out.println("Nhap password");
        String password = input.nextLine();

//        Check;
        if (!user.containsKey(username)) {
            System.out.println("Username is wrong");
        } else if (!user.containsValue(password)) {
            System.out.println("Password is wrong");
        } else
            System.out.println("Dang nhap thanh cong");

    }
}
