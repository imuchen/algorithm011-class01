package Week_07;

/**
 * Desc:
 *
 * @Author Created by tiangx
 * @Date 2020/8/9 21:25
 */
public class LC36IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null) {
            return false;
        }
        if (board.length != 9) {
            return false;
        }
        int[] map = new int[9];
        for (int y = 0; y < 9; y++) {
            if (board[y] == null || board[y].length != 9) {
                return false;
            }
            for (int i = 0; i < 9; i++) {
                int key = board[y][i] - '1';
                if (key >= 0 && key <= 8) {
                    int index = (1 << i)
                            | (1 << (y + 9))
                            | (1 << (i / 3 + y / 3 * 3 + 18));
                    int old = map[key];
                    if ((old & index) == 0) {
                        map[key] = old | index;
                    } else
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
