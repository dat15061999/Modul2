public class Obj4 {
    public static void main(String[] args) {
        Fan fan1 = new Fan(2,true,"yellow",10.0);
        Fan fan2 = new Fan(2,true,"yellow",10.0);
        Fan fan3 =new Fan();
        Fan[] fans = {fan1,fan2,fan3};
        for (Fan item : fans) {
            System.out.println(item.toString());
        }

    }
}
