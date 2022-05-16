package bllose.backtracking;

public class LongestPalindrome {
    
    public String bruteForce(String target){
        String result = "";

        if(null == target || target.trim().length() == 0) return result;

        char[] tarChar = target.toCharArray();
        for(int i =0; i < tarChar.length; i ++){
            for(int j = tarChar.length -1; j >= i ; j --){
                int curHead = i;
                int curTail= j;
                for(; curTail > curHead;){
                    if(tarChar[curHead] == tarChar[curTail]){
                        curHead ++;
                        curTail --;
                    }else{
                        break;
                    }
                }
                if(curHead >= curTail){
                    if((j == i && result.length() == 0)
                        || j-i >= result.length()){
                        result = target.substring(i, j + 1);
                    }
                }
            }
        }
        return result;
    }

    public String dynamicProgramming(String s){
        if(null == s || s.length() == 0) return "";
        int len = s.length();
        if(len == 1) return s;

        Boolean[][] recorder = new Boolean[len][len];

        for(int i = 0 ; i < len; i ++){
            recorder[i][i] = true;
        }
        
        int begin = 0;
        int length = 1;
        
        char[] sChar = s.toCharArray();
        for(int curLen = 2; curLen <= len; curLen ++){
            for(int left = 0; left < len; left ++){
                int right = left + curLen - 1;
                if(right >= len) break;
                if(sChar[left] != sChar[right]){
                    recorder[left][right] = false;
                }else{
                    if(curLen <= 3){
                        recorder[left][right] = true;
                    }else{
                        recorder[left][right] = recorder[left+1][right-1];
                    }
                }
                if(recorder[left][right] && curLen>length){
                    begin = left;
                    length = curLen;
                }
            }
        }
        
        return s.substring(begin, begin + length);
    }

    public String centralExtension(String s){
        if(s==null || s.length() == 0) return "";
        if(s.length()==1) return s;

        char[] sChar = s.toCharArray();
        int begin = -1;
        int end = -2; // 初始化时， 极端场景下应该确保 end - begin + 1 应该为0
        for(int center = 1; center < sChar.length; center ++){
            if(sChar[center - 1] == sChar[center]){
                int left = center - 1;
                int right = center;
                int radius = traversal(sChar, left, right);
                if(end - begin + 1 < radius * 2 || end - begin <= 0){ // end - begin 为数组下标间隔，比实际长度短 1
                    begin = left - radius + 1; // 由于拓展时，首先从相同的两个字母开始，所以第一个半径时不需要加入计算的
                    end = right + radius - 1;
                }
            }else{
                int left = center - 1;
                int right = center + 1;
                int radius = traversal(sChar, left, right);
                if(end - begin + 1 < radius * 2 + 1){
                    begin = center - radius;
                    end = center + radius;
                }
            }
        }

        return s.substring(begin, end + 1); // begin, end为数组下标， 在实际长度中，尾部应该加一
    }

    private int traversal(char[] sChar, int left, int right){
        if(right >= sChar.length || sChar[left] != sChar[right]) return 0;
        if(left - 1 < 0 || right + 1 > sChar.length) return 1;
        return 1 + traversal(sChar, left - 1, right + 1);
    }

    public static void main(String[] args) {
        String target = "Bllose";
        System.out.println(target.length());
        System.out.println(target.substring(0, 6));
        char[] tarChar = target.toCharArray();
        System.out.println(tarChar[5]);
        Boolean[] a = new Boolean[]{null, true};
        if(a[0]){
            System.out.println("1");
        }
    }
}
