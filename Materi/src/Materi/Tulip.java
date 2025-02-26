package Materi;

public class Tulip extends Tanaman {
    public Tulip(int xPos, int yPos) {
        super(5, xPos, yPos,300, 400, "t", "T");
        this.arahPrioritasX[0] = -1; //KIRI ATAS
        this.arahPrioritasY[0] = -1;
        this.arahPrioritasX[1] = 1; //KANAN ATAS
        this.arahPrioritasY[1] = -1;
        this.arahPrioritasX[2] = -1; // KIRI BAWAH
        this.arahPrioritasY[2] = 1;
        this.arahPrioritasX[3] = 1; // KANAN BAWAH
        this.arahPrioritasY[3] = 1;
    }
}
