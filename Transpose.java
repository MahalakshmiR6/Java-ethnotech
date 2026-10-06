class Transpose {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
//if diff rows and columns then use this code
/*
class Transpose {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
//Another way to transpose a matrix is to create a new matrix and fill it with the transposed values. Here is an example:
//not space efficientsince it uses extra space for the new matrix


/*public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int columns = arr[0].length;

        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        for (int[] row : transpose) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}



*/









/*public class Transpose {
    public static void main(String[] args) {
int[][] arr=
    {
{1,2,3},
{4,5,6},
{7,8,9}
};
int n=arr.length;
for(int i =n-1;i>=0;i--){
   for(int j=n-1;j>=0;j--){
System.out.print(arr[i][j] + " ");
}
System.out.println();
}

}
}
*/