package Project;



import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class kernal5X5_HU_VS_HU {
    public static int currX = 0;
    public static int currY = 0;
    private static int[][] vectors2D = {
            {0, -1, 0, -1, 0,-1,0,-1,0},
            {-1, 0, -1, 0, -1,0,-1,0,-1},
            {0, -1, 0, -1, 0,-1,0,-1,0},
            {-1, 0, -1, 0, -1,0,-1,0,-1},
            {0, -1, 0, -1, 0,-1,0,-1,0},
            {-1, 0, -1, 0, -1,0,-1,0,-1},
            {0, -1, 0, -1, 0,-1,0,-1,0},
            {-1, 0, -1, 0, -1,0,-1,0,-1},
            {0, -1, 0, -1, 0,-1,0,-1,0}
    };
    public static ArrayList<Integer> order = new ArrayList<>();
    private static int scoreOfPlayer1 = 0;
    private static int scoreOfPlayer2 = 0;

    public static void updateArrays(int index) {
        switch (index) {
            case 0: {
                vectors2D[8][1] = 1;
                currX = 8;
                currY = 1;
                break;
            }
            case 1: {
                vectors2D[8][3] = 1;
                currX = 8;
                currY = 3;
                break;
            }
            case 2: {
                vectors2D[8][5] = 1;
                currX = 8;
                currY = 5;
                break;
            }
            case 3: {
                vectors2D[8][7] = 1;
                currX = 8;
                currY = 7;
                break;
            }
            case 4: {
                vectors2D[6][1] = 1;
                currX = 6;
                currY = 1;
                break;
            }
            case 5: {
                vectors2D[6][3] = 1;
                currX = 6;
                currY = 3;
                break;
            }
            case 6: {
                vectors2D[6][5] = 1;
                currX = 6;
                currY = 5;
                break;
            }
            case 7: {
                vectors2D[6][7] = 1;
                currX = 6;
                currY = 7;
                break;
            }
            case 8: {
                vectors2D[4][1] = 1;
                currX = 4;
                currY = 1;
                break;
            }
            case 9: {
                vectors2D[4][3] = 1;
                currX = 4;
                currY = 3;
                break;
            }
            case 10: {
                vectors2D[4][5] = 1;
                currX = 4;
                currY = 5;
                break;
            }
            case 11: {
                vectors2D[4][7] = 1;
                currX = 4;
                currY = 7;
                break;
            }
            case 12: {
                vectors2D[2][1] = 1;
                currX = 2;
                currY = 1;
                break;
            }
            case 13:{vectors2D[2][3] = 1;
                currX = 2;
                currY = 3;
                break;}
            case 14:{vectors2D[2][5] = 1;
                currX = 2;
                currY = 5;
                break;}
            case 15:{vectors2D[2][7] = 1;
                currX = 2;
                currY = 7;
                break;}
            case 16:{vectors2D[0][1] = 1;
                currX = 0;
                currY = 1;
                break;}
            case 17:{vectors2D[0][3] = 1;
                currX = 0;
                currY = 3;
                break;}
            case 18:{vectors2D[0][5] = 1;
                currX = 0;
                currY = 5;
                break;}
            case 19:{vectors2D[0][7] = 1;
                currX = 0;
                currY = 7;
                break;}
            case 20:{vectors2D[1][0] = 1;
                currX = 1;
                currY = 0;
                break;}
            case 21:{vectors2D[3][0] = 1;
                currX = 3;
                currY = 0;
                break;}
            case 22:{vectors2D[5][0] = 1;
                currX = 5;
                currY = 0;
                break;}
            case 23:{vectors2D[7][0] = 1;
                currX = 7;
                currY = 0;
                break;}
            case 24:{vectors2D[1][2] = 1;
                currX = 1;
                currY = 2;
                break;}
            case 25: {
                vectors2D[3][2] = 1;
                currX = 3;
                currY = 2;
                break;
            }
            case 26: {
                vectors2D[5][2] = 1;
                currX = 5;
                currY = 2;
                break;
            }
            case 27: {
                vectors2D[7][2] = 1;
                currX = 7;
                currY =2 ;
                break;
            }
            case 28: {
                vectors2D[1][4] = 1;
                currX = 1;
                currY = 4;
                break;
            }
            case 29: {
                vectors2D[3][4] = 1;
                currX = 3;
                currY = 4;
                break;
            }
            case 30: {
                vectors2D[5][4] = 1;
                currX = 5;
                currY =4 ;
                break;
            }
            case 31: {
                vectors2D[7][4] = 1;
                currX =7 ;
                currY = 4;
                break;
            }
            case 32: {
                vectors2D[1][6] = 1;
                currX = 1;
                currY = 6;
                break;
            }
            case 33: {
                vectors2D[3][6] = 1;
                currX = 3;
                currY = 6;
                break;
            }
            case 34: {
                vectors2D[5][6] = 1;
                currX =5 ;
                currY =6 ;
                break;
            }
            case 35: {
                vectors2D[7][6] = 1;
                currX = 7;
                currY = 6;
                break;
            }
            case 36: {
                vectors2D[1][8] = 1;
                currX = 1;
                currY = 8;
                break;
            }
            case 37:{vectors2D[3][8] = 1;
                currX = 3;
                currY = 8;
                break;}

            case 38:{
                vectors2D[5][8] = 1;
                currX = 5;
                currY = 8;
                break;
            }
            case 39: {
                vectors2D[7][8] = 1;
                currX = 7;
                currY = 8;
                break;
            }


        }

    }

    public static boolean testFour(int x, int y, int player) {
        boolean isFour = false;
        //testleft
        if (x % 2 != 0 && y != 0) {
            if (vectors2D[x][y - 2] == 1 && vectors2D[x - 1][y - 1] == 1 && vectors2D[x + 1][y - 1] == 1) {
//                if (vectors2D[x - 1][y - 1] == 1 && vectors2D[x + 1][y - 1] == 1) {
                isFour = true;
                if (player == 1) {
                    scoreOfPlayer1++;
                } else {
                    scoreOfPlayer2++;
                }
//                }
            }
        }
        //testright
        if (x % 2 != 0 && y != 8) {
            if (vectors2D[x][y + 2] == 1) {
                if (vectors2D[x - 1][y + 1] == 1 && vectors2D[x + 1][y + 1] == 1) {
                    isFour = true;
                    if (player == 1) {
                        scoreOfPlayer1++;
                    } else {
                        scoreOfPlayer2++;
                    }
                }
            }
        }
        //testup
        if (x % 2 == 0 && x != 0) {
            if (vectors2D[x - 2][y] == 1) {
                if (vectors2D[x - 1][y - 1] == 1 && vectors2D[x - 1][y + 1] == 1) {
                    isFour = true;
                    if (player == 1) {
                        scoreOfPlayer1++;
                    } else {
                        scoreOfPlayer2++;
                    }
                }
            }
        }
        //testdown
        if (x % 2 == 0 && x != 8) {
            if (vectors2D[x + 2][y] == 1) {
                if (vectors2D[x + 1][y - 1] == 1 && vectors2D[x + 1][y + 1] == 1) {
                    isFour = true;
                    if (player == 1) {
                        scoreOfPlayer1++;
                    } else {
                        scoreOfPlayer2++;
                    }
                }
            }
        }
        return isFour;
    }
    public static boolean isRepeat(int index) {
        boolean isRepeat = false;
        for (int target : order) {
            if (target == index) {
                return true;
            }
        }
        return isRepeat;
    }

    public static boolean isfull(ArrayList order) {
        boolean isFull = false;
        if (order.size() == 40) {
            return true;
        }
        return isFull;
    }

    public int getRandom() {
        int random = 0;
        Random rand = new Random();
        random = rand.nextInt(40);
        return random;
    }

    public void computer1Play() {
        int index = -1;
        for (; ; ) {
            index = getRandom();
            if (isRepeat(index) == true) {
                continue;
            } else {
                kernal5X5_HU_VS_HU.updateArrays(index);
                order.add(index);
                MainFrame_5X5.getGUIedges().get(index).setFree(false);
                MainFrame_5X5.getGUIedges().get(index).setColor(Color.RED);
                MainFrame_5X5.getGUIedges().get(index).setVisible(true);
                MainFrame_5X5.getGUIedges().get(index).repaint();
                break;
            }
        }
        if (testFour(currX, currY, MainFrame_5X5.getPlayer()) == true) {

        } else {
            MainFrame_5X5.setPlayer(2);
        }

    }

    public void computer2Play() {
        int index = -1;
        for (; ; ) {
            index = getRandom();
            if (isRepeat(index) == true) {
                continue;
            } else {
                kernal5X5_HU_VS_HU.updateArrays(index);
                order.add(index);
                MainFrame_5X5.getGUIedges().get(index).setFree(false);
                MainFrame_5X5.getGUIedges().get(index).setColor(Color.BLUE);
                MainFrame_5X5.getGUIedges().get(index).setVisible(true);
                MainFrame_5X5.getGUIedges().get(index).repaint();
                break;
            }
        }
        if (testFour(currX, currY, MainFrame_5X5.getPlayer()) == true) {

        } else {
            MainFrame_5X5.setPlayer(1);
        }

    }

    public static void show(int[][] vectors2D) {
        for (int i = 0; i < vectors2D.length; i++) {
            for (int j = 0; j < vectors2D[0].length; j++) {
                System.out.printf("%-4d", vectors2D[i][j]);
                if (j == 8) {
                    System.out.print("\n");
                }
            }
        }
    }

    public void fileread() throws Exception {
        String filepath = System.getProperty("user.dir")+ "/save.txt";
        File file = new File(filepath);
        FileReader reader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(reader);
        StringBuilder buffer = new StringBuilder();
        String s = "";
        while ((s = bReader.readLine()) != null) {
            buffer.append(s + "\n");
        }
        bReader.close();
        String str = buffer.toString();
        String[] SavedOrders = str.split(" ");
        MainFrame_5X5.setPlayer(Integer.parseInt(SavedOrders[0]));
        for (int i = 1; i < SavedOrders.length; i++) {
            if (SavedOrders[i].equals("-1")) {
                break;
            }
            order.add(Integer.parseInt(SavedOrders[i]));
        }
    }

    public void SavedPlay() {
//        if(player == 1){
//            player++;
//        }else{
//            player--;
//        }
        for (int i = 0; i < order.size(); i++) {
            kernal5X5_HU_VS_HU.updateArrays(order.get(i));
            if (testFour(currX, currY, MainFrame_5X5.getPlayer()) == true) {

            } else {
                if (MainFrame_5X5.getPlayer() == 1) {
                    MainFrame_5X5.setPlayer(2);
                } else {
                    MainFrame_5X5.setPlayer(1);
                }
            }
        }
    }



    public void fileWrite() throws Exception {
        String OUT = "";
        OUT = OUT + MainFrame_5X5.getPlayer() + " ";
        for (int i = 0; i < order.size(); i++) {
            OUT = OUT + order.get(i) + " ";
            if (i == order.size() - 1) {
                OUT = OUT + "-1 -1 ";
            }
        }
        String filepath = System.getProperty("user.dir")+ "/save.txt";
        File file = new File(filepath);
        file.createNewFile();
        BufferedWriter output = new BufferedWriter(new FileWriter(file));
        output.write(OUT);
        output.flush();
        output.close();
    }

    private static MainFrame_5X5 mainframe = new MainFrame_5X5();


    public static void main(String[] args) throws Exception {

        mainframe.setVisible(true);
        Scanner in = new Scanner(System.in);
        kernal5X5_HU_VS_HU game = new kernal5X5_HU_VS_HU();

        System.out.println("New Game? Please input yes or no");
        String newgame = in.nextLine();
        if (newgame.toLowerCase().equals("yes")) {
            System.out.println("Which one do you want to play first?\n" +
                    "1 for player and 2 for computer");
            int anumber = in.nextInt();
            MainFrame_5X5.setPlayer(anumber);
        } else {
            game.fileread();
            game.SavedPlay();
            game.show(vectors2D);
        }
        for (; ; ) {
            if (isfull(order) == true) {
                break;
            }

            game.show(vectors2D);
            System.out.println("\n");
            if (isfull(order) == true) {
                break;
            }
        }
        System.out.println("Score of PLayer1 is:");
        System.out.println(scoreOfPlayer1 + "\n");
        System.out.println("Score of Player2 is:");
        System.out.println(scoreOfPlayer2 + "\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Do you want to save this game?\n" +
                "yes or no");
        String DoSave = "";
        for(;;){
            DoSave = in.nextLine();
            if(DoSave.toLowerCase().equals("yes") || DoSave.toLowerCase().equals("no")){
                break;
            }
        }
        if (DoSave.toLowerCase().equals("no")) {
        } else {
            game.fileWrite();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Game Saved");
        }
        System.out.println("\nGame Over");

    }

    public static void HU_VS_HU() throws Exception{
        mainframe.setVisible(true);
        Scanner in = new Scanner(System.in);
        kernal5X5_HU_VS_HU game = new kernal5X5_HU_VS_HU();

        System.out.println("New Game? Please input yes or no");
        String newgame = in.nextLine();
        if (newgame.toLowerCase().equals("yes")) {
            System.out.println("Which one do you want to play first?\n" +
                    "1 for player and 2 for computer");
            int anumber = in.nextInt();
            MainFrame_5X5.setPlayer(anumber);
        } else {
            game.fileread();
            game.SavedPlay();
            game.show(vectors2D);
        }
        for (; ; ) {
            if (isfull(order) == true) {
                break;
            }
            TimeUnit.SECONDS.sleep(1);

            game.show(vectors2D);
            System.out.println("\n");
            if (isfull(order) == true) {
                break;
            }
        }
        System.out.println("Score of PLayer1 (human player 1) is:");
        System.out.println(scoreOfPlayer1 + "\n");
        System.out.println("Score of Player2 (computer) is:");
        System.out.println(scoreOfPlayer2 + "\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Do you want to save this game?\n" +
                "yes or no");
        String DoSave = "";
        for(;;){
            DoSave = in.nextLine();
            if(DoSave.toLowerCase().equals("yes") || DoSave.toLowerCase().equals("no")){
                break;
            }
        }
        if (DoSave.toLowerCase().equals("no")) {
        } else {
            game.fileWrite();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Game Saved");
        }
        System.out.println("\nGame Over");
    }
}
