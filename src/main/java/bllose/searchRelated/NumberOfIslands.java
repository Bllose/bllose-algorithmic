package bllose.searchRelated;

public class NumberOfIslands {
    
    public int findIslands(char[][] map){
        int num = 0;
        if(null == map || map.length == 0) return num;

        int horizental = map.length;
        int vertical = map[0].length;
        for(int h = 0 ; h < horizental; h ++){
            for(int v = 0; v < vertical; v ++){
                if(map[h][v] == '1') {
                    dfs(map, h, v, horizental, vertical);
                    num ++;
                }
            }
        }

        return num;
    }

    private void dfs(char[][] map, int h, int v, int horizental, int vertical) {
        if(h >= horizental || v >= vertical 
            || h < 0 || v < 0 || map[h][v] == '0') return;
        map[h][v] = '0';
        dfs(map, h + 1, v, horizental, vertical);
        dfs(map, h, v + 1, horizental, vertical);
        dfs(map, h - 1, v, horizental, vertical);
        dfs(map, h, v - 1, horizental, vertical);
    }

    
}
