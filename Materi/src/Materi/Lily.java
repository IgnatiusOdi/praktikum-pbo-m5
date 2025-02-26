package Materi;

public class Lily extends Tanaman {
    public Lily(int xPos, int yPos) {
        super(4, xPos, yPos,200, 300, "l", "L");
        this.arahPrioritasX[0] = -1; //KIRI
        this.arahPrioritasY[0] = 0;
        this.arahPrioritasX[1] = 1; //KANAN
        this.arahPrioritasY[1] = 0;
    }
}
