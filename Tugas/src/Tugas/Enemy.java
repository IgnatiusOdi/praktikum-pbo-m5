package Tugas;

public class Enemy extends Benda {
    protected String peluru;
    protected int score;

    public Enemy(String simbol, String peluru, int score, int x, int y) {
        super(simbol,x,y);
        this.peluru = peluru;
        this.score = score;
    }

    public String getPeluru() {
        return peluru;
    }

    public void setPeluru(String peluru) {
        this.peluru = peluru;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
