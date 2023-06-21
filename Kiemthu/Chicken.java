package Kiemthu;

public class Chicken extends Animal implements Edible{
    @Override
    public String makesound() {
        return "Iam a chicken";
    }

    @Override
    public String howtoeat() {
        return "Chip Chip";
    }
}
