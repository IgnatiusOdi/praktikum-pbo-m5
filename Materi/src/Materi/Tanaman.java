package Materi;

public class Tanaman {
    int currentHariSiram;
    int hariSiapPanen;
    int xPos;
    int yPos;
    boolean sudahSiram; //F belum, T sudah
    int[] arahPrioritasX;
    int[] arahPrioritasY;
    int hargaBibit;
    int hargaHasilPanen;
    String simbolKecil;
    String simbolBesar;

    public Tanaman(int hariSiapPanen, int xPos, int yPos, int hargaBibit, int hargaHasilPanen, String simbolKecil, String simbolBesar) {
        this.currentHariSiram = 0;
        this.hariSiapPanen = hariSiapPanen;
        this.xPos = xPos;
        this.yPos = yPos;
        this.sudahSiram = false;
        this.hargaBibit = hargaBibit;
        this.hargaHasilPanen = hargaHasilPanen;
        this.simbolKecil = simbolKecil;
        this.simbolBesar = simbolBesar;
    }

    void panen() {

    }

    void siram() {

    }

    void beriPupuk() {

    }

    void tambahHari() {

    }

    public int getCurrentHariSiram() {
        return currentHariSiram;
    }

    public void setCurrentHariSiram(int currentHariSiram) {
        this.currentHariSiram = currentHariSiram;
    }

    public int getHariSiapPanen() {
        return hariSiapPanen;
    }

    public void setHariSiapPanen(int hariSiapPanen) {
        this.hariSiapPanen = hariSiapPanen;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public boolean isSudahSiram() {
        return sudahSiram;
    }

    public void setSudahSiram(boolean sudahSiram) {
        this.sudahSiram = sudahSiram;
    }

    public int[] getArahPrioritasX() {
        return arahPrioritasX;
    }

    public void setArahPrioritasX(int[] arahPrioritasX) {
        this.arahPrioritasX = arahPrioritasX;
    }

    public int[] getArahPrioritasY() {
        return arahPrioritasY;
    }

    public void setArahPrioritasY(int[] arahPrioritasY) {
        this.arahPrioritasY = arahPrioritasY;
    }

    public int getHargaBibit() {
        return hargaBibit;
    }

    public void setHargaBibit(int hargaBibit) {
        this.hargaBibit = hargaBibit;
    }

    public int getHargaHasilPanen() {
        return hargaHasilPanen;
    }

    public void setHargaHasilPanen(int hargaHasilPanen) {
        this.hargaHasilPanen = hargaHasilPanen;
    }

    public String getSimbolKecil() {
        return simbolKecil;
    }

    public void setSimbolKecil(String simbolKecil) {
        this.simbolKecil = simbolKecil;
    }

    public String getSimbolBesar() {
        return simbolBesar;
    }

    public void setSimbolBesar(String simbolBesar) {
        this.simbolBesar = simbolBesar;
    }
}
