package Easy;

public class MatrixDiagonalSum_1572 {
    public int diagonalSum(int[][] mat) {
        int s =0;
        for(int i=0;i<mat.length;i++){
            s += mat[i][i];
            if(i != mat.length -1 -i){
                s += mat[i][mat.length -1 -i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        MatrixDiagonalSum_1572 obj = new MatrixDiagonalSum_1572();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(obj.diagonalSum(mat));
    }
}
