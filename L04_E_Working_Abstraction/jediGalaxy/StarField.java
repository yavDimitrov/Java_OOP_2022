package L04_E_Working_Abstraction.jediGalaxy;

public class StarField {
    private int[][] starsFild;

    public StarField(int rows, int cols) {
        this.starsFild = new int[rows][cols];
        this.fillInStarsField(rows,cols);
    }

    private void fillInStarsField(int rows, int cols) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                this.starsFild[row][col] = value++;
            }
        }
    }
}
