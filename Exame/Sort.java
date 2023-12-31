package Exame;

public abstract class Sort {
    static ESort sortBy;
    public static void setSortBy( int choose) {
        if(choose == 1) {
            sortBy = ESort.ASC;
        } else{
            sortBy = ESort.DESC;
        }

    }
    protected abstract int[] sort(int[] arr);

    protected static boolean compare( int num1, int num2){
        if(sortBy == ESort.ASC){
            return num1 < num2;
        }
        return num1 >= num2;
    }
    protected abstract void printSort(int[] arr);


}
