public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int [][] matrix =    {{2,2,3},
                              {5,8,9},
                              {1,3,6}};
         for(int i =0;i<matrix.length;i++){
             for(int j =0;j<matrix[i].length;j++){
                 System.out.print(matrix[i][j] + " ");
             }
             System.out.println();
         }
    }
}
