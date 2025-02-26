package Materi;

import java.util.*;

public class Anggrek extends Tanaman {
    Random rand = new Random();
    int random = rand.nextInt(4);
    public Anggrek(int xPos, int yPos) {
        super(6, xPos, yPos,800, 500, "a", "A");
        if (random == 0) { //ATAS
            this.arahPrioritasX[0] = 0;
            this.arahPrioritasY[0] = -1;
        } else if (random == 1) { //BAWAH
            this.arahPrioritasX[0] = 0;
            this.arahPrioritasY[0] = 1;
        } else if (random == 2) { //KIRI
            this.arahPrioritasX[0] = -1;
            this.arahPrioritasY[0] = 0;
        } else { //KANAN
            this.arahPrioritasX[0] = 1;
            this.arahPrioritasY[0] = 0;
        }
    }
}
