package StackTest;

public class GenericStackClient {
    public static void main(String[] args) {
        stackOfStrings();
        stackOfIntegers();
    }
    public static void stackOfStrings() {
        MyGenericStack<String> list = new MyGenericStack<>();
        list.push("Con");
        list.push("cho");
        list.push("thich");
        list.push("chui");
        list.push("nhau");
        list.push("khong");
        list.push("!!!!!");
        System.out.println(list.size());

        while (!list.isEmpty()) {
            System.out.printf("%s",list.pop());
        }
        System.out.println(list.size());
    }
    public static void stackOfIntegers() {
        MyGenericStack<Integer> newList = new MyGenericStack<>();
        newList.push(1);
        newList.push(2);
        newList.push(10);
        newList.push(11);
        newList.push(5);
        newList.push(7);
        newList.push(8);
        newList.push(9);
        newList.push(3);
        newList.push(2);
        System.out.println(newList.size());
        while (!newList.isEmpty())
            System.out.printf("%d \n",newList.pop());
        System.out.println("Size after "+newList.size());

    }
}
