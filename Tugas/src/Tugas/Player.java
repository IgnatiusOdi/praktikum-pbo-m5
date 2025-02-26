package Tugas;

public class Player extends Benda {
    private String nama, peluru;
    private int life, score;

    public Player(String nama) {
        super("^", 8, 9);
        this.nama = nama;
        this.peluru = "|";
        this.life = 3;
        this.score = 0;
    }

    public Player(String nama, int score) {
        super("^",8,9);
        this.nama = nama;
        this.score = score;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPeluru() {
        return peluru;
    }

    public void setPeluru(String peluru) {
        this.peluru = peluru;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
