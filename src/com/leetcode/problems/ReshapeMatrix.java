package com.leetcode.problems;


public class ReshapeMatrix {
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r<=0 || c<=0 || mat.length*mat[0].length != r*c){
            return(mat);
        }
        int [][] newMat = new int[r][c];
        int rowCounter = 0;
        int colCounter = 0;
        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                newMat[rowCounter][colCounter] = ints[j];
                colCounter += 1;
                if (colCounter == c) {
                    colCounter = 0;
                    rowCounter++;
                }
            }
        }
        return(newMat);
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}, {5,6}};
        int r = 2;
        int c = 3;
        int [][] result;
        result = matrixReshape(mat, r, c);
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(" " + result[i][j]);
            }
            System.out.println();
        }
    }
}
