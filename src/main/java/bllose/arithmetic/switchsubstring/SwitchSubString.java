package bllose.arithmetic.switchsubstring;

import java.util.Scanner;

public class SwitchSubString {
    static {
        System.setIn(SwitchSubString.class.getResourceAsStream("src/main/java/bllose/arithmetic/switchsubstring/Letters.txt"));
    }

    /**
     * 给定一个字符串，只包含大写字母，求在包含同一字母的子串中，长度第 k 长的子串的长度，相同字母只取最长的那个子串。
     * AAAAHHHBBCDHHHH
     * 3
     * -> 2
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] target = in.nextLine().toCharArray();
        char[] letter = new char[target.length];
        int[] counter = new int[target.length];

        for(Character cur: target){
            int position = match(letter, cur);
            if(position > -1){
                counter[position] ++;
            }else{
                position = add(letter, cur);
                counter[position] ++;
            }
        }

    }

    private static int add(char[] letter, Character cur) {
        for(int i = 0 ; i < letter.length; i ++){
            if(letter[i] == 0){
                letter[i] = cur;
                return i;
            }
        }
        return -1;
    }

    public static int match(char[] origin, char target){
        for(int i = 0 ; i < origin.length; i ++){
            if(origin[i] == target) return i;
        }
        return -1;
    }
}
