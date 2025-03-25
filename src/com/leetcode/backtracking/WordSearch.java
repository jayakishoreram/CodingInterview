package com.leetcode.backtracking;

public class WordSearch {
    public static void main(String[] args) {

    }
    public static boolean wordSearch(Character[][] board, String word){
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++ ){
               if(backtrack(board, word, row, col,0)){
                   return true;
               }else {
                   return false;
               }
            }
        }
        return false;
    }


    private static boolean backtrack(Character[][] board,  String word, int row, int col, int index){
        if(index > word.length()){
           return true;
        }
        if(
            row < 0 || row == board.length ||
                col < 0 || col == board[0].length ||
                board[row][col] != word.charAt(index)
        ){
            return false;
        }
        boolean ret = false;
        board[row][col] = '#';
        int[] rowOffsets = {0,1,0,-1};
        int[] colOffsets = {1,0,-1,0};
        for(int d = 0; d < 4; ++d){
            ret = backtrack(
                    board,
                    word,
                    row + rowOffsets[d],
                    col + colOffsets[d],
                    index + 1
                    );
            if(ret) break;
        }
        board[row][col] = word.charAt(index);
        return ret;
    }
}
