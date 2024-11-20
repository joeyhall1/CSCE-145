/*
 * Written by Joey Hall
 */

package Matrix;
import java.util.Scanner;
public class Matrixaddition {

	public static void main(String[] args) {
		
		//setting up scanner for code
		Scanner keyboard= new Scanner(System.in);
        System.out.println("Welcome to the matrix adder program!");
		
        //Making sure we have the correct dimensions for the matrix
        System.out.print("Enter the number of rows: ");
        int rows = keyboard.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = keyboard.nextInt();

        // Getting matrix one and matrix two set up based on rows and columns
        int[][] matrixOne = new int[rows][cols];
        int[][] matrixTwo = new int[rows][cols];

        // Allowing to put numbered values for first matrix
        System.out.println("Enter values for Matrix One:");
        fillMatrix(keyboard, matrixOne);

        // Allowing to use numbered values for second matrix
        System.out.println("Enter values for Matrix Two:");
        fillMatrix(keyboard, matrixTwo);

  
        int[][] resultMatrix = new int[rows][cols];

        // for-loop to add matrix one and matrix two together
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        // The added matrixes
        System.out.println("The result of the two matrixes added together is:");
        printMatrix(resultMatrix);

       
        keyboard.close();
        
    }

    public static int getPositiveInteger(Scanner keyboard, String message) {
        int num;
        do {
            System.out.println(message);
            num = keyboard.nextInt();
            if (num <= 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (num <= 0);
        return num;
    }
    private static void fillMatrix(Scanner keyboard, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = keyboard.nextInt();
            }
        }
    }

   
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}