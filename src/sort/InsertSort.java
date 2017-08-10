package sort;

/**
 * Created by Administrator on 2017/8/10.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 插入排序
 * 时间复杂度位O(n2)
 *
 * */
public class InsertSort {

    public void sort(int [] arrays){

        if(arrays == null || arrays.length == 0){
            return;
        }

        /**
         *  i 表示要插入的数字下标
         *
         * */
        int j = 0;
        for(int  i = 1; i < arrays.length; i++){
            int tmp = arrays[i];
            for(j = i-1; j >= 0; j--){
                if(tmp < arrays[j]){
                    arrays[j+1] = arrays[j];
                } else {
                    break;
                }
            }
            arrays[j+1] = tmp;
        }
    }


    public static void main(String [] args){
        InsertSort sort = new InsertSort();

        int [] arrays = new int []{100, 29, 20, 10,998, 78, 876, 192, 1000, 89, 56, 23789, 929};
        sort.sort(arrays);
        for(int a : arrays){
            System.out.print(" "+a);
        }
        System.out.println();

        List<Integer> list = new ArrayList<>();
        Random random = new Random(47);
        int  i = 0;
        while(i++ < 10000){
            list.add(random.nextInt(20000));
        }
        int [] array = new int[10000];
        for(int index = 0; index <10000; index++){
            array[index] = list.get(index);
        }
        sort.sort(array);
        for(int a : array){
            System.out.print(" "+a);
        }
        System.out.println();
    }
}
