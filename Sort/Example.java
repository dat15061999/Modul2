package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{1,1,2,3,3,3})));

    }
    public static int[] sort(int [] nums) {
        int[] cnt = new int[201];
        List<Integer> t = new ArrayList<>();
        for (int v : nums) {
            v += 100;
            ++cnt[v];
            t.add(v);
        }
        t.sort((a,b)->cnt[a]==cnt[b]?b-a:cnt[a]-cnt[b]);
        int[] result = new int [nums.length];
        int i = 0;
        for (int v : t) {
            result[i++] = v-100;
        }
        return result;
    }
}
