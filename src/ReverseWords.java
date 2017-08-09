/**
 * Created by Administrator on 2017/8/9.
 */


/**
 * 反转单词，输入一个英文句子，翻转句子中的单词顺序。要求单词内字符串顺序不变，句子中单词以空格隔开。
 * example:
 *    input: I am a student.
 *    output:student. a am I
 * **/
public class ReverseWords {

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

    public void reverseWords(char [] desStr) {
        if (desStr != null && desStr.length > 0) {
            int start = 0;
            int index = 0;
            while (index <= desStr.length) {
                if (index == desStr.length || Character.isSpaceChar(desStr[index])) {
                    reverse(desStr, start, index - 1);
                    index++;
                    start = index;
                } else {
                    index++;
                }
            }
        }

        reverse(desStr, 0, desStr.length - 1);
    }

    public static void main(String [] args){
        String str = "I am a student.";
        ReverseWords test = new ReverseWords();
        char [] cs = str.toCharArray();
        test.reverseWords(cs);
        System.out.println("reverseWords:"+new String(cs));
    }

}
