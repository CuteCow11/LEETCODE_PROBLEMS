class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] cp = new int[10];
        int[] cp2 = new int[10];
        int[] cp3 = new int[10];
        boolean f = false;

        for (int i = 0; i < 9; i++) {

            int[] rowCheck = new int[10];
            int[] colCheck = new int[10];

            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (rowCheck[board[i][j] - '0'] == 0) {
                        rowCheck[board[i][j] - '0'] = -1;
                    } else {
                        return f;
                    }
                }
            }
            for (int k = 0; k < 9; k++) {
                if (board[k][i] != '.') {
                    if (colCheck[board[k][i] - '0'] == 0) {
                        colCheck[board[k][i] - '0'] = -1;
                    } else {
                        return f;
                    }
                }
            }
            if (i % 3 == 0) {
                cp = new int[10];
                cp2 = new int[10];
                cp3 = new int[10];
            }
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != '.') {
                    if (cp[board[i][j] - '0'] == 0) {
                        cp[board[i][j] - '0'] = -1;
                    } else {
                        return f;
                    }
                }
            }
            for (int j = 3; j < 6; j++) {
                if (board[i][j] != '.') {
                    if (cp2[board[i][j] - '0'] == 0) {
                        cp2[board[i][j] - '0'] = -1;
                    } else {
                        return f;
                    }
                }
            }
            for (int j = 6; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (cp3[board[i][j] - '0'] == 0) {
                        cp3[board[i][j] - '0'] = -1;
                    } else {
                        return f;
                    }
                }
            }
        }
        return true;
    }
}