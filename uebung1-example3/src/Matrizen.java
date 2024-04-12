public class Matrizen {
    public static void main(String[] args) {

        float[][] floatMatrix = new float[][] {
                { 1.0f, 2.0f, 4.3f }, { 1.0f, 2.0f, 7.8f }, { 0.4f, 2.6f, 4.5f }, { 5.3f, 2.0f, 3.4f },
        };

        printMatrix(floatMatrix);
    }

    public static void printMatrix(float[][] floatMatrix) {
        for (int i = 0; i < floatMatrix.length; i++) {
            for (int j = 0; j < floatMatrix[i].length; j++) {
                System.out.print(floatMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
