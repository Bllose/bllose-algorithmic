package bllose.leetcode;

public class IntegerInversion{

//    int max = 2147483647; // Integer.MAX_VALUE
//    int min = -2147483648;
    //           2147447412;

    /**
     * 执行耗时:2 ms,击败了14.88% 的Java用户
     * 内存消耗:38.7 MB,击败了56.48% 的Java用户
     * @param x
     * @return
     */
    public int reverse_provide(int x){
        if(x == Integer.MIN_VALUE){
            return 0;
        }

        StringBuffer sb = new StringBuffer(String.valueOf(Math.abs(x)));
        sb = sb.reverse();

        if(sb.length() == 10){
            if(Integer.valueOf(sb.substring(0, 9)) > 214748364){
                return 0;
            }
        }

        if(x < 0){
            return Integer.valueOf("-" + sb);
        }
        return Integer.valueOf(sb.toString());
    }

    /**
     * 执行耗时:2 ms,击败了14.88% 的Java用户
     * 内存消耗:38.9 MB,击败了27.85% 的Java用户
     */
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE){
            return 0;
        }

        boolean isMinus = false;
        if(x < 0){
            isMinus = true;
        }

        String origin = String.valueOf(Math.abs(x));

        StringBuffer sb = new StringBuffer(origin);
        sb = sb.reverse();

        if(sb.length() == 10){
            if(sb.charAt(0) > '2'){
                return 0;
            }else if(sb.charAt(0) == '2'){
                int temp = Integer.valueOf(sb.substring(1));
                if(isMinus && temp > 147483648){
                    return 0;
                }else if( !isMinus && temp > 147483647){
                    return 0;
                }
            }
        }

        if(isMinus){
            return Integer.valueOf("-" + sb);
        }
        return Integer.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        IntegerInversion ii = new IntegerInversion();
//        System.out.println(ii.reverse_provide(-2147483648));
//        System.out.println(ii.reverse_provide(-2147483647));
        System.out.println(ii.reverse_provide(1534236469));
    }

}
