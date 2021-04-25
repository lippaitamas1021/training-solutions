package matrixadd;

public class Matrix {

    public Object[] matrixAdd(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
}
