package ismagicsquare;

public class Magic {

    public boolean isMagicSquare(int[][] arr) {
        int sum = 0;
        boolean b = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr.length) {
                b = false;
            }
        }
        for(int j = 0; j < arr[0].length; j++) {
            sum += arr[0][j];
        }
        if (getRow(arr, sum)) {
            return false;
        }
        if (getColumn(arr, sum)) {
            return false;
        }
        Integer diag = getDiag(arr, sum);
        if (diag == null) {
            return false;
        }
        return diag == sum;
    }

    private Integer getDiag(int[][] arr, int sum) {
        int diag = 0;
        for(int i = 0; i < arr.length; i++) {
            diag += arr[i][i];
        }
        if(diag != sum) {
            return null;
        }
        diag = 0;
        for(int i = 0; i < arr.length; i++) {
            diag += arr[arr.length - i - 1][i];
        }
        return diag;
    }

    private boolean getColumn(int[][] arr, int sum) {
        for (int j = 0; j < arr.length; j++) {
            int colSum = 0;
            for (int i = 0; i < arr.length; i++) {
                colSum += arr[i][j];
            }
            if (colSum != sum) {
                return true;
            }
        }
        return false;
    }

    private boolean getRow(int[][] arr, int sum) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i].length != arr[0].length) {
                return true;
            }
            int rowSum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            if(rowSum != sum) {
                return true;
            }
        }
        return false;
    }
}
