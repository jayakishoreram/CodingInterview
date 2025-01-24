package com.java11;

public class MatrixChallange {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        printMatrix(matrix);
        rotateMatrix(matrix, 0, 3);
        System.out.println("--------------------------------------");
        printMatrix(matrix);
    }

    private static void rotateMatrix(int[][] matrix, int indexTop, int indexBottom){
        if(indexTop >= indexBottom){
            return;
        }
        int[] topRow = new int[indexBottom + 1];
        copyTopRow(topRow, matrix, indexTop, indexBottom);
        shiftLeftToTop(matrix, indexTop,indexBottom);
        shiftBottomToLeft(matrix, indexTop,indexBottom);
        shiftLeftToBottom(matrix, indexTop,indexBottom);
        putTempToRight(topRow, matrix, indexTop, indexBottom);
        rotateMatrix(matrix, indexTop + 1, indexBottom - 1);


    }

    private static void copyTopRow(int[] topRow, int[][] matrix, int indexTop, int indexBottom){
        for(int i = indexTop; i <= indexBottom; i++){
            topRow[i] = matrix[indexTop][i];
        }
    }
    private static void shiftBottomToLeft(int[][] matrix, int indexTop, int indexBottom){
        for(int i = indexTop; i <= indexBottom ; i++){
            matrix[i][indexTop] = matrix[indexBottom][i];
        }
    }

    private static void shiftLeftToTop(int[][] matrix, int indexTop, int indexBottom){
        for(int i = indexTop, j = indexBottom; i <= indexBottom; i++, j--){
            matrix[indexTop][j] = matrix[i][indexTop];
        }
    }

    private static void shiftLeftToBottom(int[][] matrix, int indexTop, int indexBottom){
        for(int i = indexBottom, j = indexTop; i >= indexTop; i--, j++){
            matrix[indexBottom][j] = matrix[i][indexBottom];
        }
    }

    private static void putTempToRight(int[] topRow, int[][] matrix, int indexTop, int indexBottom){
        for(int i = indexBottom; i >= indexTop; i--){
            matrix[i][indexBottom] = topRow[i];
        }
    }



    private static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
