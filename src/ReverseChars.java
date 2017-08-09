/**
 * Created by Administrator on 2017/8/9.
 */

/***
 * 给定一个字符串，要求将字符串前面的若干个字符移动到字符串的尾部。
 * example:
 *   将字符串"abcdefg"的前3个字符移动至字符串的后面，得到对应的字符串为"defgabc".
 * */
public class ReverseChars {

    //三步反转
    /**
     * @param strs: 需要反转的字符串
     * @param startIndex:反转操作的起始位置
     * @param endIndex:反转操作的结束位置
     * */
    public void reverse(char[] strs, int startIndex, int endIndex){
        while(startIndex<endIndex){
            char tmp = strs[startIndex];
            strs[startIndex++] = strs[endIndex];
            strs[endIndex--] = tmp;
        }
    }

    /***
     * 反转字符串
     * @param strs:待反转的字符串
     * @param m: 需要反转的前m个字符；
     *
     * */
    public void reverseChars(char[] strs, int m){
        reverse(strs, 0, m-1);
        reverse(strs, m, strs.length-1);
        reverse(strs, 0, strs.length-1);
    }

    //test;
    public static void main(String [] args){
        ReverseChars test = new ReverseChars();

        char[] testStr = "HelloWorld".toCharArray();
        test.reverseChars(testStr, 3);
        System.out.println("strs:"+new String(testStr));

        char[] testStr2 = "HelloWorldabcdefghijklmnopqrstuvwxyz".toCharArray();
        test.reverseChars(testStr2, 15);
        System.out.println("strs:"+new String(testStr2));
    }
}
