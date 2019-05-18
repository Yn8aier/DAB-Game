package Project;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class kernal7X7_MA_VS_MA {
    private Color currentColor = Color.RED;
    private static int currX = 0;
    private static int currY = 0;
    private static int[][] vectors2D = {
            {0, -1, 0, -1, 0,-1,0,-1,0,-1,0,-1,0},
            {-1, 0, -1, 0, -1,0,-1,0,-1,0,-1,0,-1},
            {0, -1, 0, -1, 0,-1,0,-1,0,-1,0,-1,0},
            {-1, 0, -1, 0, -1,0,-1,0,-1,0,-1,0,-1},
            {0, -1, 0, -1, 0,-1,0,-1,0,-1,0,-1,0},
            {-1, 0, -1, 0, -1,0,-1,0,-1,0,-1,0,-1},
            {0, -1, 0, -1, 0,-1,0,-1,0,-1,0,-1,0},
            {-1, 0, -1, 0, -1,0,-1,0,-1,0,-1,0,-1},
            {0, -1, 0, -1, 0,-1,0,-1,0,-1,0,-1,0},
            {-1, 0, -1, 0, -1,0,-1,0,-1,0,-1,0,-1},
            {0, -1, 0, -1, 0,-1,0,-1,0,-1,0,-1,0},
            {-1, 0, -1, 0, -1,0,-1,0,-1,0,-1,0,-1},
            {0, -1, 0, -1, 0,-1,0,-1,0,-1,0,-1,0}
    };
    private static ArrayList<Integer> order = new ArrayList<>();
    private static int scoreOfPlayer1 = 0;
    private static int scoreOfPlayer2 = 0;

    public static void updateArrays(int index) {
        switch (index) {
            case 0: {
                vectors2D[12][1] = 1;
                currX = 12;
                currY = 1;
                break;
            }
            case 1: {
                vectors2D[12][3] = 1;
                currX = 12;
                currY = 3;
                break;
            }
            case 2: {
                vectors2D[12][5] = 1;
                currX = 12;
                currY = 5;
                break;
            }
            case 3: {
                vectors2D[12][7] = 1;
                currX = 12;
                currY = 7;
                break;
            }
            case 4: {
                vectors2D[12][9] = 1;
                currX = 12;
                currY = 9;
                break;
            }
            case 5: {
                vectors2D[12][11] = 1;
                currX = 12;
                currY = 11;
                break;
            }

            case 6: {
                vectors2D[10][1] = 1;
                currX = 10;
                currY = 1;
                break;
            }
            case 7: {
                vectors2D[10][3] = 1;
                currX = 10;
                currY = 3;
                break;
            }
            case 8: {
                vectors2D[10][5] = 1;
                currX = 10;
                currY = 5;
                break;
            }
            case 9: {
                vectors2D[10][7] = 1;
                currX = 10;
                currY = 7;
                break;
            }
            case 10: {
                vectors2D[10][9] = 1;
                currX = 10;
                currY = 9;
                break;
            }
            case 11: {
                vectors2D[10][11] = 1;
                currX = 10;
                currY = 11;
                break;
            }

            case 12: {
                vectors2D[8][1] = 1;
                currX = 8;
                currY = 1;
                break;
            }
            case 13: {
                vectors2D[8][3] = 1;
                currX = 8;
                currY = 3;
                break;
            }
            case 14: {
                vectors2D[8][5] = 1;
                currX = 8;
                currY = 5;
                break;
            }
            case 15: {
                vectors2D[8][7] = 1;
                currX = 8;
                currY = 7;
                break;
            }
            case 16: {
                vectors2D[8][9] = 1;
                currX = 8;
                currY = 9;
                break;
            }
            case 17: {
                vectors2D[8][11] = 1;
                currX = 8;
                currY = 11;
                break;
            }

            case 18: {
                vectors2D[6][1] = 1;
                currX = 6;
                currY = 1;
                break;
            }
            case 19: {
                vectors2D[6][3] = 1;
                currX = 6;
                currY = 3;
                break;
            }
            case 20: {
                vectors2D[6][5] = 1;
                currX = 6;
                currY = 5;
                break;
            }
            case 21:{vectors2D[6][7] = 1;
                currX = 6;
                currY = 7;
                break;}
            case 22:{vectors2D[6][9] = 1;
                currX = 6;
                currY = 9;
                break;}
            case 23: {
                vectors2D[6][11] = 1;
                currX = 6;
                currY = 11;
                break;
            }
            case 24:{vectors2D[4][1] = 1;
                currX = 4;
                currY = 1;
                break;}
            case 25:{vectors2D[4][3] = 1;
                currX = 4;
                currY = 3;
                break;}
            case 26:{vectors2D[4][5] = 1;
                currX = 4;
                currY = 5;
                break;}
            case 27:{vectors2D[4][7] = 1;
                currX = 4;
                currY = 7;
                break;}
            case 28:{vectors2D[4][9] = 1;
                currX = 4;
                currY = 9;
                break;}
            case 29: {
                vectors2D[4][11] = 1;
                currX = 4;
                currY = 11;
                break;
            }
            case 30 :{vectors2D[2][1] = 1;
                currX = 2;
                currY = 1;
                break;}
            case 31:{vectors2D[2][3] = 1;
                currX = 2;
                currY = 3;
                break;}
            case 32:{vectors2D[2][5] = 1;
                currX = 2;
                currY = 5;
                break;}
            case 33:{vectors2D[2][7] = 1;
                currX = 2;
                currY = 7;
                break;}
            case 34:{vectors2D[2][9] = 1;
                currX = 2;
                currY = 9;
                break;}
            case 35: {
                vectors2D[2][11] = 1;
                currX = 2;
                currY = 11;
                break;
            }
            case 36: {
                vectors2D[0][1] = 1;
                currX = 0;
                currY = 1;
                break;
            }
            case 37: {
                vectors2D[0][3] = 1;
                currX = 0;
                currY = 3;
                break;
            }
            case 38: {
                vectors2D[0][5] = 1;
                currX = 0;
                currY =5 ;
                break;
            }
            case 39: {
                vectors2D[0][7] = 1;
                currX = 0;
                currY = 7;
                break;
            }
            case 40: {
                vectors2D[0][9] = 1;
                currX = 0;
                currY = 9;
                break;
            }
            case 41: {
                vectors2D[0][11] = 1;
                currX = 0;
                currY = 11;
                break;
            }
            case 42: {
                vectors2D[1][0] = 1;
                currX = 1;
                currY =0 ;
                break;
            }
            case 43: {
                vectors2D[3][0] = 1;
                currX =3 ;
                currY = 0;
                break;
            }
            case 44: {
                vectors2D[5][0] = 1;
                currX = 5;
                currY = 0;
                break;
            }
            case 45: {
                vectors2D[7][0] = 1;
                currX = 7;
                currY = 0;
                break;
            }
            case 46: {
                vectors2D[9][0] = 1;
                currX =9 ;
                currY =0 ;
                break;
            }
            case 47: {
                vectors2D[11][0] = 1;
                currX =11 ;
                currY =0 ;
                break;}
            case 48: {
                vectors2D[1][2] = 1;
                currX = 1;
                currY = 2;
                break;
            }
            case 49: {
                vectors2D[3][2] = 1;
                currX = 3;
                currY = 2;
                break;
            }
            case 50:{vectors2D[5][2] = 1;
                currX = 5;
                currY = 2;
                break;}

            case 51:{
                vectors2D[7][2] = 1;
                currX = 7;
                currY = 2;
                break;
            }
            case 52: {
                vectors2D[9][2] = 1;
                currX = 9;
                currY = 2;
                break;
            }
            case 53: {
                vectors2D[11][2] = 1;
                currX =11 ;
                currY =2 ;
                break;}
            case 54:{vectors2D[1][4] = 1;
                currX = 1;
                currY = 4;
                break;}
            case 55:{vectors2D[3][4] = 1;
                currX = 3;
                currY = 4;
                break;}
            case 56:{vectors2D[5][4] = 1;
                currX = 5;
                currY = 4;
                break;}
            case 57:{vectors2D[7][4] = 1;
                currX = 7;
                currY = 4;
                break;}
            case 58:{vectors2D[9][4] = 1;
                currX = 9;
                currY = 4;
                break;}
            case 59: {
                vectors2D[11][4] = 1;
                currX =11 ;
                currY =4 ;}
            case 60:{vectors2D[1][6] = 1;
                currX = 1;
                currY = 6;
                break;}
            case 61: {
                vectors2D[3][6] = 1;
                currX = 3;
                currY = 6;
                break;
            }
            case 62: {
                vectors2D[5][6] = 1;
                currX = 5;
                currY = 6;
                break;
            }
            case 63: {
                vectors2D[7][6] = 1;
                currX = 7;
                currY =6 ;
                break;
            }
            case 64: {
                vectors2D[9][6] = 1;
                currX = 9;
                currY = 6;
                break;
            }
            case 65: {
                vectors2D[11][6] = 1;
                currX =11 ;
                currY =6 ;}
            case 66: {
                vectors2D[1][8] = 1;
                currX = 1;
                currY = 8;
                break;
            }
            case 67: {
                vectors2D[3][8] = 1;
                currX = 3;
                currY =8 ;
                break;
            }
            case 68: {
                vectors2D[5][8] = 1;
                currX =5 ;
                currY = 8;
                break;
            }
            case 69: {
                vectors2D[7][8] = 1;
                currX = 7;
                currY = 8;
                break;
            }
            case 70: {
                vectors2D[9][8] = 1;
                currX = 9;
                currY = 8;
                break;
            }
            case 71: {
                vectors2D[11][8] = 1;
                currX =11 ;
                currY =8 ;}
            case 72: {
                vectors2D[1][10] = 1;
                currX =1 ;
                currY =10 ;
                break;
            }
            case 73: {
                vectors2D[3][10] = 1;
                currX = 3;
                currY = 10;
                break;
            }
            case 74: {
                vectors2D[5][10] = 1;
                currX = 5;
                currY = 10;
                break;
            }
            case 75:{vectors2D[7][10] = 1;
                currX = 7;
                currY = 10;
                break;}

            case 76:{
                vectors2D[9][10] = 1;
                currX = 9;
                currY = 10;
                break;
            }
            case 77: {
                vectors2D[11][10] = 1;
                currX =11 ;
                currY =10;}



            case 78: {
                vectors2D[1][12] = 1;
                currX =1 ;
                currY =12 ;
                break;
            }
            case 79: {
                vectors2D[3][12] = 1;
                currX = 3;
                currY = 12;
                break;
            }
            case 80: {
                vectors2D[5][12] = 1;
                currX = 5;
                currY = 12;
                break;
            }
            case 81:{vectors2D[7][12] = 1;
                currX = 7;
                currY = 12;
                break;}

            case 82:{
                vectors2D[9][12] = 1;
                currX = 9;
                currY = 12;
                break;
            }
            case 83: {
                vectors2D[11][12] = 1;
                currX =11 ;
                currY =12;}


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
        if (x % 2 != 0 && y != 12) {
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
        if (x % 2 == 0 && x != 12) {
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
        if (order.size() == 84) {
            return true;
        }
        return isFull;
    }

    public int getRandom() {
        int random = 0;
        Random rand = new Random();
        random = rand.nextInt(84);
        return random;
    }

    public void computer1Play() {
        int index = -1;
        for (; ; ) {
            index = getRandom();
            if (isRepeat(index) == true) {
                continue;
            } else {
                kernal7X7_MA_VS_MA.updateArrays(index);
                order.add(index);
                MainFrame_7X7.getGUIedges().get(index).setColor(Color.RED);
                MainFrame_7X7.getGUIedges().get(index).setVisible(true);
                break;
            }
        }
        if (testFour(currX, currY, MainFrame_7X7.getPlayer()) == true) {

        } else {
            MainFrame_7X7.setPlayer(2);
        }

    }

    public void computer2Play() {
        int index = -1;
        for (; ; ) {
            index = getRandom();
            if (isRepeat(index) == true) {
                continue;
            } else {
                kernal7X7_MA_VS_MA.updateArrays(index);
                order.add(index);
                MainFrame_7X7.getGUIedges().get(index).setColor(Color.BLUE);
                MainFrame_7X7.getGUIedges().get(index).setVisible(true);
                break;
            }
        }
        if (testFour(currX, currY, MainFrame_7X7.getPlayer()) == true) {

        } else {
            MainFrame_7X7.setPlayer(1);
        }

    }

    public static void show(int[][] vectors2D) {
        for (int i = 0; i < vectors2D.length; i++) {
            for (int j = 0; j < vectors2D[0].length; j++) {
                System.out.printf("%-4d", vectors2D[i][j]);
                if (j == 12) {
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
        MainFrame_7X7.setPlayer(Integer.parseInt(SavedOrders[0]));
        for (int i = 1; i < SavedOrders.length; i++) {
            if (SavedOrders[i].equals("-1")) {
                break;
            }
            order.add(Integer.parseInt(SavedOrders[i]));
        }
    }

    public void SavedPlay() throws Exception{
//        if(player == 1){
//            player++;
//        }else{
//            player--;
//        }
        for (int i = 0; i < order.size(); i++) {
            kernal7X7_MA_VS_MA.updateArrays(order.get(i));
            if(MainFrame_7X7.getPlayer() == 1){
                currentColor = Color.RED;
            }else{
                currentColor = Color.BLUE;
            }
            MainFrame_7X7.getGUIedges().get(order.get(i)).setColor(currentColor);
            MainFrame_7X7.getGUIedges().get(order.get(i)).setVisible(true);
            TimeUnit.SECONDS.sleep(1);
            if (testFour(currX, currY, MainFrame_7X7.getPlayer()) == true) {

            } else {
                if (MainFrame_7X7.getPlayer() == 1) {
                    MainFrame_7X7.setPlayer(2);
                } else {
                    MainFrame_7X7.setPlayer(1);
                }
            }
        }
    }



    public void fileWrite() throws Exception {
        String OUT = "";
        OUT = OUT + MainFrame_7X7.getPlayer() + " ";
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

    private static MainFrame_7X7 mainframe = new MainFrame_7X7();


    public static void main(String[] args) throws Exception {

        mainframe.setVisible(true);
        Scanner in = new Scanner(System.in);
        kernal7X7_MA_VS_MA game = new kernal7X7_MA_VS_MA();

        //Machine VS. Machine: Lock the mouse
        for(int i = 0; i < MainFrame_7X7.getGUIedges().size(); i++){
            MainFrame_7X7.getGUIedges().get(i).setFree(false);
        }

        String newgame = GamemodeSelect.newGame;
        if (newgame.toLowerCase().equals("yes")) {
            MainFrame_7X7.setPlayer(GamemodeSelect.playerFirst);
        } else {
            game.fileread();
            game.SavedPlay();
            game.show(vectors2D);
        }
        for (; ; ) {
            if (isfull(order) == true) {
                break;
            }
            if (MainFrame_7X7.getPlayer() == 1) {
                game.computer1Play();
                TimeUnit.SECONDS.sleep(1);
            } else {
                game.computer2Play();
                TimeUnit.SECONDS.sleep(1);
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

    public static void MA_VS_MA() throws Exception{
        mainframe.setVisible(true);
        Scanner in = new Scanner(System.in);
        kernal7X7_MA_VS_MA game = new kernal7X7_MA_VS_MA();

        //Machine VS. Machine: Lock the mouse
        for(int i = 0; i < MainFrame_7X7.getGUIedges().size(); i++){
            MainFrame_7X7.getGUIedges().get(i).setFree(false);
        }

        System.out.println("New Game? Please input yes or no");
        String newgame = in.nextLine();
        if (newgame.toLowerCase().equals("yes")) {
            System.out.println("Which one do you want to play first?\n" +
                    "1 for computer1 and 2 for computer 2");
            int a = in.nextInt();
            MainFrame_7X7.setPlayer(a);
        } else {
            game.fileread();
            game.SavedPlay();
            game.show(vectors2D);
        }
        for (; ; ) {
            if (isfull(order) == true) {
                break;
            }
            if (MainFrame_7X7.getPlayer() == 1) {
                game.computer1Play();
                TimeUnit.SECONDS.sleep(1);
            } else {
                game.computer2Play();
                TimeUnit.SECONDS.sleep(1);
            }
            game.show(vectors2D);
            System.out.println("\n");
            if (isfull(order) == true) {
                break;
            }
        }
        System.out.println("Score of Computer 1 is:");
        System.out.println(scoreOfPlayer1 + "\n");
        System.out.println("Score of Computer 2 is:");
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
