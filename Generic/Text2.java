package Generic;

public class Text2<T,U> {
    private T first;
    private U second;

    public Text2(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Text2<String,Double> numbers1 = new Text2<>("Hello",4.0);
        System.out.println("First " + numbers1.getFirst() + " second " + numbers1.getSecond());
        Text2<Double,Integer> numbers2 = new Text2<Double, Integer>(4.0,5);
        System.out.println("First " + numbers2.getFirst() + " second " + numbers2.getSecond());
    }
}
