package Materi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);
        int day = 1;
        Inventory inventory = new Inventory();
        String[][] kebun = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                kebun[i][j] = " ";
            }
        }
        ArrayList<Tanaman> t = new ArrayList<>();

        do{
            System.out.println(" ~~ Harvest Moon ~~");
            System.out.println("DAY : "+day);
            System.out.println("Coins : "+inventory.getCoins()+"C");
            System.out.println("---------------------");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("|"+kebun[i][j]);
                }
                System.out.println("|");
            }
            System.out.println("---------------------");
            System.out.println("1. Tanam bibit");
            System.out.println("2. Beri pupuk");
            System.out.println("3. Shop");
            System.out.println("4. Panen");
            System.out.println("5. Jual hasil panen");
            System.out.println("6. Siram tanaman");
            System.out.println("7. Ganti hari");
            System.out.println("8. Lihat list tanaman pada kebun");
            System.out.println("0. Quit");
            System.out.print(">> ");
            int input = scanint.nextInt();
            if (input == 0) {
                //QUIT
                break;
            } else if (input == 1) {
                //TANAM BIBIT
                do{
                    System.out.println("Pilih bibit yang mau ditanam :");
                    System.out.println("1. Bibit Anggrek - "+inventory.getJumlahBibitAnggrek());
                    System.out.println("2. Bibit Tulip - "+inventory.getJumlahBibitTulip());
                    System.out.println("3. Bibit Lily - "+inventory.getJumlahBibitLily());
                    System.out.println("4. Bibit Mawar - "+inventory.getJumlahBibitMawar());
                    System.out.println("0. Batal");
                    System.out.print(">> ");
                    input = scanint.nextInt();
                    if (input == 0) {
                        break;
                    } else if (input == 1) {
                        //ANGGREK
                        System.out.print("Masukkan koordinat(x,y) : ");
                        String temp = scan.nextLine();
                        String[] koordinat = temp.split(",");
                        int x = Integer.parseInt(koordinat[0]);
                        int y = Integer.parseInt(koordinat[1]);
                        x--; y--;
                        if (x >= 0 && x <=9 && y >= 0 && y <= 9) {
                            if (kebun[y][x].equals(" ")) {
                                t.add(new Anggrek(x,y));
                                kebun[y][x] = "A";
                                inventory.setJumlahBibitAnggrek(inventory.getJumlahBibitAnggrek()-1);
                            }
                        } else {
                            System.out.println("Koordinat invalid");
                        }
                    } else if (input == 2) {
                        //TULIP
                        System.out.print("Masukkan koordinat(x,y) : ");
                        String temp = scan.nextLine();
                        String[] koordinat = temp.split(",");
                        int x = Integer.parseInt(koordinat[0]);
                        int y = Integer.parseInt(koordinat[1]);
                        x--; y--;
                        if (x >= 0 && x <=9 && y >= 0 && y <= 9) {
                            if (kebun[y][x].equals(" ")) {
                                t.add(new Tulip(x,y));
                                kebun[y][x] = "T";
                                inventory.setJumlahBibitTulip(inventory.getJumlahBibitTulip()-1);
                            }
                        } else {
                            System.out.println("Koordinat invalid");
                        }
                    } else if (input == 3) {
                        //LILY
                        System.out.print("Masukkan koordinat(x,y) : ");
                        String temp = scan.nextLine();
                        String[] koordinat = temp.split(",");
                        int x = Integer.parseInt(koordinat[0]);
                        int y = Integer.parseInt(koordinat[1]);
                        x--; y--;
                        if (x >= 0 && x <=9 && y >= 0 && y <= 9) {
                            if (kebun[y][x].equals(" ")) {
                                t.add(new Lily(x,y));
                                kebun[y][x] = "L";
                                inventory.setJumlahBibitLily(inventory.getJumlahBibitLily()-1);
                            }
                        } else {
                            System.out.println("Koordinat invalid");
                        }
                    } else if (input == 4) {
                        //MAWAR
                        System.out.print("Masukkan koordinat(x,y) : ");
                        String temp = scan.nextLine();
                        String[] koordinat = temp.split(",");
                        int x = Integer.parseInt(koordinat[0]);
                        int y = Integer.parseInt(koordinat[1]);
                        x--; y--;
                        if (x >= 0 && x <=9 && y >= 0 && y <= 9) {
                            if (kebun[y][x].equals(" ")) {
                                t.add(new Mawar(x,y));
                                kebun[y][x] = "M";
                                inventory.setJumlahBibitMawar(inventory.getJumlahBibitMawar()-1);
                            }
                        } else {
                            System.out.println("Koordinat invalid");
                        }
                    }
                }while(true);
            } else if (input == 2) {
                System.out.println("Pilih jenis pupuk yang ingin diberikan : ");
                System.out.println("1. Pupuk kompos - "+inventory.getJumlahPupukKompos());
                System.out.println("2. Pupuk kandang - "+inventory.getJumlahPupukKandang());
                System.out.println("3. Pupuk kimia - "+inventory.getJumlahPupukKimia());
                System.out.println(">> ");
                input = scanint.nextInt();
                if (input == 1) {
                    if (inventory.getJumlahPupukKompos() > 0) {

                    } else {
                        System.out.println("Jumlah pupuk kurang");
                    }
                } else if (input == 2) {
                    if (inventory.getJumlahPupukKandang() > 0) {

                    } else {
                        System.out.println("Jumlah pupuk kurang");
                    }
                } else if (input == 3) {
                    if (inventory.getJumlahPupukKimia() > 0) {

                    } else {
                        System.out.println("Jumlah pupuk kurang");
                    }
                }
            } else if (input == 3) {
                //SHOP
                do{
                    System.out.println("<- Shop ->");
                    System.out.println("1. Beli bibit");
                    System.out.println("2. Beli pupuk");
                    System.out.println("0. Kembali");
                    System.out.print(">> ");
                    input = scanint.nextInt();
                    if (input == 1) {
                        System.out.println("Pilih bibit yang ingin dibeli : ");
                        System.out.println("1. Bibit Anggrek - 800C");
                        System.out.println("2. Bibit Tulip - 300C");
                        System.out.println("3. Bibit Lily - 200C");
                        System.out.println("4. Bibit Mawar - 200C");
                        System.out.print(">> ");
                        input = scanint.nextInt();
                        if (input == 1) {
                            System.out.print("Jumlah yang ingin dibeli : ");
                            int jumlah = scanint.nextInt();
                            if (inventory.getCoins() >= 800*jumlah) {
                                inventory.setCoins(inventory.getCoins()-800*jumlah);
                                inventory.setJumlahBibitAnggrek(inventory.getJumlahBibitAnggrek()-jumlah);
                                System.out.println("Berhasil membeli "+jumlah+" Bibit Tulip!");
                            }
                        } else if (input == 2) {
                            System.out.print("Jumlah yang ingin dibeli : ");
                            int jumlah = scanint.nextInt();
                            if (inventory.getCoins() >= 300*jumlah) {
                                inventory.setCoins(inventory.getCoins()-300*jumlah);
                                inventory.setJumlahBibitAnggrek(inventory.getJumlahBibitAnggrek()-jumlah);
                                System.out.println("Berhasil membeli "+jumlah+" Bibit Tulip!");
                            }
                        } else if (input == 3) {

                        } else if (input == 4) {

                        }
                    } else if (input == 2) {

                    } else if (input == 0) {
                        break;
                    }
                }while(true);
            } else if (input == 4) {

            } else if (input == 5) {

            } else if (input == 6) {
                //SIRAM TANAMAN
            } else if (input == 7) {
                //GANTI HARI
                day++;
            } else if (input == 8) {
                System.out.println("** List Tanaman pada Kebun **");
                for (int i = 0; i < t.size(); i++) {
                    Tanaman temp = t.get(i);
                    System.out.println("- ("+temp.getxPos()+","+temp.getyPos()+")");
                }
            }
        }while(true);
    }
}
