package sort;

/**
 * Created by Administrator on 2017/8/10.
 */

import java.util.Comparator;

/**
 * 冒泡排序
 * 时间复杂度位o(n2);
 *
 * */
public class BubbleSort<T> {

    public <T> void sort(T [] arrays, Comparator<T> comparator){
        if(arrays == null || arrays.length == 0){
            return;
        }

        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < (arrays.length - i -1); j++){
                if(comparator.compare(arrays[j], arrays[j+1]) > 0){
                    T tmp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = tmp;
                }
            }
        }
    }


    public static void main(String [] args){
        BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>();


        Integer [] arrInt = new Integer[]{120, 150,12,32,869,54,999,10,56,32,85,654,145};
        bubbleSort.sort(arrInt, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return 1;
                } else if(o1 <o2){
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for(int a : arrInt){
            System.out.print(" "+a);
        }
        System.out.println();

        Float [] arrFloat = new Float []{0.01f, 0.24f, 3.56f, 5663.98f, 120f, 125.65f, 120000.f, 0.00253f, 4512.90f, 530.45f };
        BubbleSort<Float> floatBubbleSort = new BubbleSort<>();
        floatBubbleSort.sort(arrFloat, new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                if(Float.compare(o1, o2) > 0){
                    return 1;
                } else if(Float.compare(o1, o2) <0){
                    return  -1;
                } else {
                    return 0;
                }
            }
        });

        for(float a : arrFloat){
            System.out.print(" "+a);
        }
        System.out.println();

    }

}
