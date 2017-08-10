package sort;

/**
 * Created by Administrator on 2017/8/10.
 */


/****
 * QuickSort
 *
 */

public class QuickSort {

    private int partition(int [] arrays, int low ,int high){
        if (arrays == null || arrays.length == 0){
            return 0;
        }

        int pvior = arrays[low];
        while(low < high){
            while(low < high && pvior < arrays[high])
                high--;
            arrays[low] = arrays[high];
            while(low <high && pvior > arrays[low])
                low++;
            arrays[high] = arrays[low];
        }
        arrays[low] = pvior;
        return low;

    }

    public void sort(int [] arrays, int low, int high){
        if(arrays == null || arrays.length == 0){
            return;
        }
        if(low<high) {
            int len = arrays.length;
            int part = partition(arrays, low, high);
            sort(arrays, 0, part - 1);
            sort(arrays, part + 1, high);
        }
    }

    public static void main(String [] args){
        QuickSort sort = new QuickSort();

        int [] arrs = new int[]{101,22,106,3,895,452,751,562,451,25,368,256,5555,411,0,12};
        sort.sort(arrs, 0 , arrs.length - 1);
        for(int a :arrs){
            System.out.print(" "+a);
        }

        System.out.println();
    }
}
