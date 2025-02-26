package Materi;

public class Mawar extends Tanaman {
    public Mawar(int xPos, int yPos) {
        super(4, xPos, yPos, 200, 250, "m", "M");
        this.arahPrioritasX[0] = -1; //KIRI
        this.arahPrioritasY[0] = 0;
        this.arahPrioritasX[1] = 1; //KANAN
        this.arahPrioritasY[1] = 0;
        this.arahPrioritasX[2] = 0; //ATAS
        this.arahPrioritasY[2] = -1;
        this.arahPrioritasX[3] = 0; // BAWAH
        this.arahPrioritasY[3] = 1;
    }
}
