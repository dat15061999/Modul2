package Kiemthu;

public class Text2 {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Banana();
        for (Fruit fruit :fruits) {
            System.out.println(fruit.howtoeat());
        }
    }
}
