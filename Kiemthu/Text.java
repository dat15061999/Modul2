package Kiemthu;

public class Text {
    public static void main(String[] args) {
        Animal[] convat1 = new Animal[2];
        convat1[0]= new Tiger();
        convat1[1]= new Chicken();
        for (Animal animal:convat1) {
            System.out.println(animal.makesound());

        if (animal instanceof Tiger) {
            Edible edibler = (Tiger) animal;
            System.out.println(edibler.howtoeat());
        }
    }
        }
    }

