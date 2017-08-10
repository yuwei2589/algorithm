package sort;

/**
 * Created by Administrator on 2017/8/10.
 */

/**
 * 选择排序
 * 时间复杂度位O(n2);
 * */
public class SelectSort {

    public void sort(int [] arrays){
        if(arrays == null || arrays.length == 0){
            return;
        }

        int len = arrays.length;

        /**
         * 思想：先遍历数组，找出最小值与arrays[0]交换，接着在遍历数组的[1,2,...,n-1]，依次找出最小值，与第一个位置交换；
         *
         * */

        //k为最小值的下标;
        int k = 0;
        for(int i = 0;  i < len ; i++) {
            k = i;
            for (int j = i; j < len ; j++) {
                if (arrays[k] > arrays[j]) {
                    k = j;
                }
            }

            int tmp = arrays[k];
            arrays[k] = arrays[i];
            arrays[i] = tmp;
        }
    }

    public static void main(String [] args){
        SelectSort sort = new SelectSort();
        int [] arrs = new int[]{101,22,106,3,895,452,751,562,451,25,368,256,5555,411,0,12};
        sort.sort(arrs);
        for(int a :arrs){
            System.out.print(" "+a);
        }

        System.out.println();
    }
}
