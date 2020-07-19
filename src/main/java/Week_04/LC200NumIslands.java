package Week_04;

/**
 * Created by tianguoxing on 2020/7/19 22:28.
 */
public class LC200NumIslands {
    public int cols;
    public int rows;

    public int numIslands(char[][] grid) {
        int count = 0;
        rows = grid.length;
        if (rows == 0) return 0;
        cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') return;
        grid[i][j] = '0';
        // 递归该格子上下左右的4个格子，全部将1修改为0
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}
