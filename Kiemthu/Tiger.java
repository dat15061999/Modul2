package Kiemthu;

public class Tiger extends Animal implements Edible{
    @Override
    public String makesound() {
        return "HUHU I am a Tiger";
    }

    @Override
    public String howtoeat() {
        return "Gao gao";
    }
}
