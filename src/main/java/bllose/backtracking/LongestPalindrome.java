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