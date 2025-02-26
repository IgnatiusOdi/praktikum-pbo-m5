package Tugas;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
	    Scanner scanint = new Scanner(System.in);
	    ArrayList<Player> player = new ArrayList<>();
        do {
            System.out.println("#-#-#-#-#-#-#-#");
            System.out.println("#             #");
            System.out.println("#   Space     #");
            System.out.println("#  Invaders   #");
            System.out.println("#             #");
            System.out.println("#-#-#-#-#-#-#-#");
            System.out.println("---Main Menu---");
            System.out.println("1. Play Game");
            System.out.println("2. Scoreboard");
            System.out.println("3. Exit");
            System.out.print(">> ");
            int menu = scanint.nextInt();
            if (menu == 1) {
                ArrayList<Enemy> enemy = new ArrayList<>();
                ArrayList<Shield> shield = new ArrayList<>();
                ArrayList<Bullet> bullet = new ArrayList<>();
                String[][] space = new String[10][17];
                // SHIELD KIRI
                shield.add(new Shield(3,7));
                shield.add(new Shield(3,8));
                shield.add(new Shield(4,7));
                shield.add(new Shield(5,7));
                shield.add(new Shield(6,7));
                shield.add(new Shield(6,8));
                // SHIELD KANAN
                shield.add(new Shield(11,7));
                shield.add(new Shield(11,8));
                shield.add(new Shield(12,7));
                shield.add(new Shield(13,7));
                shield.add(new Shield(14,7));
                shield.add(new Shield(14,8));

                String difficulty;
                System.out.println("--Choose Your Difficulty--");
                System.out.println("1. Easy");
                System.out.println("2. Medium");
                System.out.println("3. Hard");
                System.out.println("--------------------------");
                do{
                    System.out.print(">> ");
                    menu = scanint.nextInt();
                }while(menu < 1 || menu > 3);
                System.out.print("Masukkan Nama Anda : ");
                String nama = scan.nextLine();
                player.add(new Player(nama));
                Player active = player.get(player.size()-1);
                if (menu == 1) {
                    difficulty = "Easy";
                    //BAWAH 5X
                    enemy.add(new X(6,2));
                    enemy.add(new X(7,2));
                    enemy.add(new X(8,2));
                    enemy.add(new X(9,2));
                    enemy.add(new X(10,2));

                    //TENGAH 4Y
                    enemy.add(new Y(7,1));
                    enemy.add(new Y(8,1));
                    enemy.add(new Y(10,1));
                    enemy.add(new Y(11,1));

                    //ATAS 5Z
                    enemy.add(new Z(6,0));
                    enemy.add(new Z(7,0));
                    enemy.add(new Z(8,0));
                    enemy.add(new Z(9,0));
                    enemy.add(new Z(10,0));
                }
                else if (menu == 2) {
                    difficulty = "Medium";
                    //BAWAH 7X
                    enemy.add(new X(5,2));
                    enemy.add(new X(6,2));
                    enemy.add(new X(7,2));
                    enemy.add(new X(8,2));
                    enemy.add(new X(9,2));
                    enemy.add(new X(10,2));
                    enemy.add(new X(11,2));

                    //TENGAH 8Y
                    enemy.add(new Y(2,1));
                    enemy.add(new Y(3,1));
                    enemy.add(new Y(4,1));
                    enemy.add(new Y(5,1));
                    enemy.add(new Y(11,1));
                    enemy.add(new Y(12,1));
                    enemy.add(new Y(13,1));
                    enemy.add(new Y(14,1));

                    //ATAS 9Z
                    enemy.add(new Z(4,0));
                    enemy.add(new Z(5,0));
                    enemy.add(new Z(6,0));
                    enemy.add(new Z(7,0));
                    enemy.add(new Z(8,0));
                    enemy.add(new Z(9,0));
                    enemy.add(new Z(10,0));
                    enemy.add(new Z(11,0));
                    enemy.add(new Z(12,0));
                }
                else {
                    difficulty = "Hard";
                    //BAWAH 4X 2Y
                    enemy.add(new X(6,2));
                    enemy.add(new X(7,2));
                    enemy.add(new X(10,2));
                    enemy.add(new X(11,2));

                    enemy.add(new Y(8,2));
                    enemy.add(new Y(9,2));

                    //TENGAH 4X 4Y
                    enemy.add(new X(5,1));
                    enemy.add(new X(6,1));
                    enemy.add(new X(11,1));
                    enemy.add(new X(12,1));

                    enemy.add(new Y(7,1));
                    enemy.add(new Y(8,1));
                    enemy.add(new Y(9,1));
                    enemy.add(new Y(10,1));

                    //ATAS 14Z
                    enemy.add(new Z(2,0));
                    enemy.add(new Z(3,0));
                    enemy.add(new Z(4,0));
                    enemy.add(new Z(5,0));
                    enemy.add(new Z(6,0));
                    enemy.add(new Z(7,0));
                    enemy.add(new Z(8,0));
                    enemy.add(new Z(9,0));
                    enemy.add(new Z(10,0));
                    enemy.add(new Z(11,0));
                    enemy.add(new Z(12,0));
                    enemy.add(new Z(13,0));
                    enemy.add(new Z(14,0));
                    enemy.add(new Z(15,0));
                }
                int maxY = 0;
                int maxX = 0;
                int minX = 99;
                int arah = rand.nextInt(2);
                if (arah == 0) arah = -1;
                boolean gantiarah = false;
                do{
                    //FILL MAP AGAIN
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 17; j++) {
                            space[i][j] = " ";
                        }
                    }
                    for (Shield s : shield) {
                        space[s.getY()][s.getX()] = s.getSimbol();
                    }
                    for (Bullet b : bullet) {
                        space[b.getY()][b.getX()] = b.getSimbol();
                    }
                    for (Enemy e : enemy) {
                        space[e.getY()][e.getX()] = e.getSimbol();
                    }
                    System.out.println("  Difficulty "+difficulty);
                    System.out.println("#.................#");
                    for (int i = 0; i < 10; i++) {
                        System.out.print("#");
                        for (int j = 0; j < 17; j++) {
                            if (active.getX() == j && active.getY() == i) {
                                System.out.print(active.getSimbol());
                            } else {
                                System.out.print(space[i][j]);
                            }
                        }
                        System.out.println("#");
                    }
                    System.out.println("#.................#");
                    System.out.println("Score : "+active.getScore());
                    System.out.print("Life : ");
                    for (int i = 0; i < active.getLife(); i++) {
                        System.out.print("♥ ");
                    }
                    System.out.println();
                    System.out.print(">> ");
                    String input = scan.nextLine();
                    if (input.equals("hesoyam")) {
                        active.setLife(3);
                    }
                    else if (input.equals("end game")) {
                        break;
                    }
                    else if (input.equals("s")) {
                        //TRACKER
                        for (Enemy e : enemy) {
                            e.setY(e.getY()+1);
                            if (maxY < e.getY()){
                                maxY = e.getY();
                            }
                        }
                    }
                    else if (input.equals("w") || input.equals("a") || input.equals("d")) {
                        //PLAYER MOVE LEFT
                        if (input.equals("a")) {
                            if (active.getX() > 0) {
                                if (space[9][active.getX()-1].equals(" ")) {
                                    active.setX(active.getX()-1);
                                }
                            }
                        }
                        //PLAYER MOVE RIGHT
                        else if (input.equals("d")) {
                            if (active.getX() < 16) {
                                if (space[9][active.getX()+1].equals(" ")) {
                                    active.setX(active.getX()+1);
                                }
                            }
                        }
                        //PLAYER SHOOT
                        else {
                            bullet.add(new Bullet(active.getPeluru(),active.getX(),active.getY()));
                        }
                        //ENEMY
                        //ARAH
                        if ((minX == 0 || maxX == 16) && gantiarah) {
                            gantiarah = false;
                            arah*=-1;
                            for (Enemy e : enemy) {
                                e.setY(e.getY()+1);
                                if (maxY < e.getY()){
                                    maxY = e.getY();
                                }
                            }
                        }
                        //MOVE
                        else {
                            gantiarah = true;
                            minX = 99;
                            maxX = 0;
                            maxY = 0;
                            for (Enemy e : enemy) {
                                //MOVE
                                e.setX(e.getX()+arah);
                                if (maxY < e.getY()) {
                                    maxY = e.getY();
                                }
                                if (maxX < e.getX()) {
                                    maxX = e.getX();
                                }
                                if (minX > e.getX()) {
                                    minX = e.getX();
                                }
                                //CHECK SHIELD
                                int counter = 0;
                                while (counter < shield.size()) {
                                    Shield check = shield.get(counter);
                                    if (e.getX() == check.getX() && e.getY() == check.getY()) {
                                        shield.remove(check);
                                        break;
                                    } else {
                                        counter++;
                                    }
                                }
                            }
                        }
                        //SHOOT
                        for (Enemy e : enemy) {
                            if (e.getY() == maxY) {
                                int random = rand.nextInt()%10;
                                if (e instanceof X && random < 3) {
                                    bullet.add(new Bullet(e.getPeluru(),e.getX(),e.getY()));
                                } else if (e instanceof Y && random < 4) {
                                    bullet.add(new Bullet(e.getPeluru(),e.getX(),e.getY()));
                                } else if (e instanceof Z && random < 5){
                                    bullet.add(new Bullet(e.getPeluru(),e.getX(),e.getY()));
                                }
                            }
                        }

                        //BULLET
                        int counter = 0;
                        while (counter < bullet.size()) {
                            Bullet now = bullet.get(counter);
                            //PLAYER
                            if (now.getSimbol().equals("|")) {
                                if (now.getY() == 0) {
                                    bullet.remove(now);
                                } else {
                                    //CHECK SHIELD
                                    int counter2 = 0;
                                    boolean ada = false;
                                    while (counter2 < shield.size()) {
                                        Shield check = shield.get(counter2);
                                        if (now.getX() == check.getX() && now.getY()-1 == check.getY()) {
                                            ada = true;
                                            shield.remove(check);
                                            bullet.remove(now);
                                            break;
                                        } else {
                                            counter2++;
                                        }
                                    }
                                    if (!ada) {
                                        //CHECK ENEMY BULLET
                                        counter2 = 0;
                                        while (counter2 < bullet.size() && counter != counter2) {
                                            Bullet check = bullet.get(counter2);
                                            if (now.getX() == check.getX() && now.getY()-1 == check.getY()) {
                                                ada = true;
                                                bullet.remove(check);
                                                bullet.remove(now);
                                                break;
                                            } else {
                                                counter2++;
                                            }
                                        }
                                        if (!ada) {
                                            //CHECK ENEMY
                                            counter2 = 0;
                                            while (counter2 < enemy.size()) {
                                                Enemy check = enemy.get(counter2);
                                                if (now.getX() == check.getX() && now.getY()-1 == check.getY()) {
                                                    ada = true;
                                                    active.setScore(active.getScore()+check.getScore());
                                                    enemy.remove(check);
                                                    bullet.remove(now);
                                                    break;
                                                } else {
                                                    counter2++;
                                                }
                                            }
                                            if (!ada) {
                                                //EMPTY AHEAD
                                                now.setY(now.getY()-1);
                                                counter++;
                                            }
                                        }
                                    }
                                }
                            }
                            //ENEMY
                            else {
                                if (now.getY() == 9) {
                                    bullet.remove(now);
                                } else {
                                    //CHECK PLAYER BULLET
                                    int counter2 = 0;
                                    boolean ada = false;
                                    while (counter2 < bullet.size() && counter != counter2) {
                                        Bullet check = bullet.get(counter2);
                                        if (now.getX() == check.getX() && now.getY()+1 == check.getY()) {
                                            ada = true;
                                            bullet.remove(check);
                                            bullet.remove(now);
                                            break;
                                        } else {
                                            counter2++;
                                        }
                                    }
                                    if (!ada) {
                                        //CHECK SHIELD
                                        counter2 = 0;
                                        while (counter2 < shield.size()) {
                                            Shield check = shield.get(counter2);
                                            if (now.getX() == check.getX() && now.getY()+1 == check.getY()) {
                                                ada = true;
                                                shield.remove(check);
                                                bullet.remove(now);
                                                break;
                                            } else {
                                                counter2++;
                                            }
                                        }
                                        if (!ada) {
                                            //CHECK PLAYER
                                            if (now.getX() == active.getX() && now.getY()+1 == active.getY()) {
                                                ada = true;
                                                active.setLife(active.getLife()-1);
                                                bullet.remove(now);
                                            }
                                            if (!ada) {
                                                //EMPTY AHEAD
                                                now.setY(now.getY()+1);
                                                counter++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    //CHECK LOWEST ENEMY Y
                    if (maxY == active.getY() || active.getLife() == 0 || enemy.size() == 0) {
                        System.out.println("GAME OVER");
                        break;
                    }
                }while(true);
            } else if (menu == 2) {
                System.out.println("========Highscore========");
                if (player.size() > 0) {
                    // HIGHSCORE
                    ArrayList<Player> leaderboard = new ArrayList<>();
                    // FILL LEADERBOARD
                    for (Player p : player) {
                        leaderboard.add(new Player(p.getNama(),p.getScore()));
                    }
                    // SORT
                    for (int i = 0; i < leaderboard.size(); i++) {
                        for (int j = i+1; j < leaderboard.size(); j++) {
                            if (leaderboard.get(i).getScore() < leaderboard.get(j).getScore()) {
                                Player temp = new Player(leaderboard.get(i).getNama(),leaderboard.get(i).getScore());
                                leaderboard.set(i, leaderboard.get(j));
                                leaderboard.set(j, temp);
                            }
                        }
                    }
                    // PRINT
                    for (Player l : leaderboard) {
                        System.out.println(leaderboard.indexOf(l)+1+". "+l.getNama()+" - "+l.getScore());
                    }
                } else {
                    System.out.println("Tidak ada highscore saat ini!");
                }
                System.out.println("=========================");
            }
            else if (menu == 3) {
                //EXIT GAME
                break;
            }
        }while(true);
    }
}
