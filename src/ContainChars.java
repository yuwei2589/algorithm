/**
 * Created by Administrator on 2017/8/10.
 */


/**
 * 给定一个长字符串a和一个短字符串b.请问如何快速的判断出短字符串b中所有的字符是否都在a中出现？
 * example:
 *     假设输入的字符串都是大写的字母A~Z,
 *     如果长字符串为"AZFG", 短字符串为"AGF", 则返回true;
 *     如果长字符串为"AZFG", 短字符串为"AZZH", 则返回false;
 *
 *     采用类似的hash表示，在此题中，因为简化了题目，以一个int变量的32位bit，即可表示；
 *
 * */
public class ContainChars {


    /**
     * @param strs: 输入的字符数组
     * @return mask:
     * **/
    private int generateMask(char [] strs){
        int mask = 0;
        for(int index = 0; index <strs.length; index++){
            mask |= 0x01<<(strs[index] - 'A');
        }

        return mask;

    }

    /**
     * @param lStrs: 长字符数组
     * @param sStrs:短字符数组
     * @return 如果长字符数组包含短字符数组，则返回true,否则返回false;
     * **/
    public boolean stringContain(char [] lStrs, char [] sStrs){
        int lMask = generateMask(lStrs);
        int sMask = generateMask(sStrs);
        if((lMask & sMask) == sMask){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String [] args){
        ContainChars test = new ContainChars();

        boolean t1 = test.stringContain("ABCDEFG".toCharArray(), "ABCD".toCharArray());
        System.out.println("t1:"+t1);
        boolean t2 = test.stringContain("ABCDEFG".toCharArray(), "ABCDH".toCharArray());
        System.out.println("t2:"+t2);

        boolean t3 = test.stringContain("ABCDEFG".toCharArray(), "ABCDEFG".toCharArray());
        System.out.println("t3:"+t3);
    }
}
