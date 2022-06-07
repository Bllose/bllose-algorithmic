package bllose.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atoi {

    /**
     * 执行耗时:12 ms,击败了5.07% 的Java用户
     * 内存消耗:41.4 MB,击败了33.63% 的Java用户
     * @param s
     * @return
     */
    public static int myAtoi(String s) {
        s = s.trim();
        String regex = "^(([-+])?[\\d]+)[^\\d]?.*$";
        boolean isMinus = false;

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.matches()){
            String result = m.group(1);
            if(result.startsWith("-")){
                isMinus = true;
                result = result.substring(1);
            }else if(result.startsWith("+")){
                result = result.substring(1);
            }

            while(result.startsWith("0") && result.length() > 0){
                result = result.substring(1);
            }

            if(result.length() > 10){
                if(isMinus){
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }else if(result.length() == 10){
                int edge = Integer.valueOf(result.substring(0, 9));
                if( edge > 214748364){
                    if(isMinus){
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }else if(edge == 214748364){
                    int end = Integer.valueOf(result.substring(9, 10));
                    if(isMinus){
                        if(end > 8){
                            return Integer.MIN_VALUE;
                        }
                    }else{
                        if(end > 7){
                            return Integer.MAX_VALUE;
                        }
                    }
                }
            }else if(result.length() == 0){
                return 0;
            }

            if(isMinus){
                return Integer.valueOf("-" + result);
            }
            return Integer.valueOf(result);
        }

        return 0;
    }

    public static void main(String[] args) {
//        System.out.println(myAtoi("words and 987"));
//        System.out.println(myAtoi("   000947"));
//        System.out.println(myAtoi("4193 with words"));
//        System.out.println(myAtoi("42"));
//        System.out.println(myAtoi(" 0000000000012345678"));
//        System.out.println(myAtoi("-2147483648"));
//        System.out.println(myAtoi("2147483648"));
        System.out.println(myAtoi(" 1192820738r2"));
    }
}
