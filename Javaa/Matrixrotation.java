public class Matrixrotation {
    public static void main(String[] args) {

        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = matrix.length;

        int rotated[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-1-i] = matrix[i][j];
            }
        }

        System.out.print("Matrix:[[");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(rotated[i][j]);
                if(j<n-1) System.out.print(", ");
            }
            if(i<n-1) System.out.print("], [");
        }
        System.out.println("]]");
    }
}
