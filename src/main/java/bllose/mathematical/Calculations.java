package bllose.mathematical;

import java.lang.Math;

public class Calculations {

    public String decimalToOther(Double input, int radix){
        StringBuffer sb = new StringBuffer();
        sb.append("0.");
        while(sb.length() < 12 && input > 0){
            input *= radix;
            int currectNum = (int) Math.floor(input);
            sb.append(currectNum);
            input -= currectNum;
        }
        return sb.toString();
    }
}
