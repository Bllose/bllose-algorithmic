package bllose.arithmetic.ludengwenti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    static {
        try {
            System.setIn(new FileInputStream("src\\main\\java\\bllose\\arithmetic\\ludengwenti\\source.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        in.nextLine();
        String input = in.nextLine();
        System.out.println(noLightLength(input, total));
    }

    private static int noLightLength(String areas, int total){
        int lenWithNoLight = 0;
        int totalLength = (total - 1) * 100;

        Integer[] each = Stream.of(areas.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        List<Integer[]> recorder = new ArrayList();
        for(int i = 0; i < total; i ++){
            int left = i * 100 - each[i];
            int right = i * 100 + each[i];
            if(recorder.size() == 0){
                recorder.add(new Integer[]{left, right});
                continue;
            }
            for(int j = 0; j < recorder.size(); j ++){
                Integer[] light = recorder.get(j);
                if(light[0] < left && light[1] > right){
                    break;
                }else if(light[1] > left && light[1] < right){
                    recorder.set(j, new Integer[]{light[0], right});
                }else{
                    recorder.add(new Integer[]{left, right});
                    break;
                }
            }
        }

        for(int right = 1; right < recorder.size(); right ++){
            int left = right - 1;
            lenWithNoLight += recorder.get(right)[0] - recorder.get(left)[1];
        }

        if(recorder != null && recorder.size() > 0){
            int end = totalLength - recorder.get(recorder.size() - 1)[1];
            if(end > 0){
                lenWithNoLight += end;
            }
        }

        return lenWithNoLight;
    }
}
