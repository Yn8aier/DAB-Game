package Project;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class kernal3X3_HU_VS_MA {
    public static int currX = 0;
    public static int currY = 0;
    private static int[][] vectors2D = {
            {0, -1, 0, -1, 0},
            {-1, 0, -1, 0, -1},
            {0, -1, 0, -1, 0},
            {-1, 0, -1, 0, -1},
            {0, -1, 0, -1, 0}
    };
    public static ArrayList<Integer> order = new ArrayList<>();
    private static int scoreOfPlayer1 = 0;
    private static int scoreOfPlayer2 = 0;

    public static void updateArrays(int index) {
        switch (index) {
            case 0: {
                vectors2D[4][1] = 1;
                currX = 4;
                currY = 1;
                break;
            }
            case 1: {
                vectors2D[4][3] = 1;
                currX = 4;
                currY = 3;
                break;
            }
            case 2: {
                vectors2D[2][1] = 1;
                currX = 2;
                currY = 1;
                break;
            }
            case 3: {
                vectors2D[2][3] = 1;
                currX = 2;
                currY = 3;
                break;
            }
            case 4: {
                vectors2D[0][1] = 1;
                currX = 0;
                currY = 1;
                break;
            }
            case 5: {
                vectors2D[0][3] = 1;
                currX = 0;
                currY = 3;
                break;
            }
            case 6: {
                vectors2D[3][0] = 1;
                currX = 3;
                currY = 0;
                break;
            }
            case 7: {
                vectors2D[1][0] = 1;
                currX = 1;
                currY = 0;
                break;
            }
            case 8: {
                vectors2D[3][2] = 1;
                currX = 3;
                currY = 2;
                break;
            }
            case 9: {
                vectors2D[1][2] = 1;
                currX = 1;
                currY = 2;
                break;
            }
            case 10: {
                vectors2D[3][4] = 1;
                currX = 3;
                currY = 4;
                break;
            }
            case 11: {
                vectors2D[1][4] = 1;
                currX = 1;
                currY = 4;
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
        if (x % 2 != 0 && y != 4) {
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
        if (x % 2 == 0 && x != 4) {
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
        if (order.size() == 12) {
            return true;
        }
        return isFull;
    }

    public int getRandom() {
        int random = 0;
        Random rand = new Random();
        random = rand.nextInt(12);
        return random;
    }

    public void computer1Play() {
        int index = -1;
        for (; ; ) {
            index = getRandom();
            if (isRepeat(index) == true) {
                continue;
            } else {
                kernal3X3_HU_VS_MA.updateArrays(index);
                order.add(index);
                MainFrame_3X3.getGUIedges().get(index).setFree(false);
                MainFrame_3X3.getGUIedges().get(index).setColor(Color.RED);
                MainFrame_3X3.getGUIedges().get(index).setVisible(true);
                MainFrame_3X3.getGUIedges().get(index).repaint();
                break;
            }
        }
        if (testFour(currX, currY, MainFrame_3X3.getPlayer()) == true) {

        } else {
            MainFrame_3X3.setPlayer(2);
        }

    }

    public void computer2Play() {
        int index = -1;
        for (; ; ) {
            index = getRandom();
            if (isRepeat(index) == true) {
                continue;
            } else {
                kernal3X3_HU_VS_MA.updateArrays(index);
                order.add(index);
                MainFrame_3X3.getGUIedges().get(index).setFree(false);
                MainFrame_3X3.getGUIedges().get(index).setColor(Color.BLUE);
                MainFrame_3X3.getGUIedges().get(index).setVisible(true);
                MainFrame_3X3.getGUIedges().get(index).repaint();
                break;
            }
        }
        if (testFour(currX, currY, MainFrame_3X3.getPlayer()) == true) {

        } else {
            MainFrame_3X3.setPlayer(1);
        }

    }

    public static void show(int[][] vectors2D) {
        for (int i = 0; i < vectors2D.length; i++) {
            for (int j = 0; j < vectors2D[0].length; j++) {
                System.out.printf("%-4d", vectors2D[i][j]);
                if (j == 4) {
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
        MainFrame_3X3.setPlayer(Integer.parseInt(SavedOrders[0]));
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
            kernal3X3_HU_VS_MA.updateArrays(order.get(i));
            if (testFour(currX, currY, MainFrame_3X3.getPlayer()) == true) {

            } else {
                if (MainFrame_3X3.getPlayer() == 1) {
                    MainFrame_3X3.setPlayer(2);
                } else {
                    MainFrame_3X3.setPlayer(1);
                }
            }
        }
    }



    public void fileWrite() throws Exception {
        String OUT = "";
        OUT = OUT + MainFrame_3X3.getPlayer() + " ";
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

    private static MainFrame_3X3 mainframe = new MainFrame_3X3();



    public static void HU_vs_MA() throws Exception{
        mainframe.setVisible(true);
        Scanner in = new Scanner(System.in);
        kernal3X3_HU_VS_MA game = new kernal3X3_HU_VS_MA();
        String newgame = GamemodeSelect.newGame;
        if (newgame.toLowerCase().equals("yes")) {
            MainFrame_3X3.setPlayer(GamemodeSelect.playerFirst);
        } else {
            game.fileread();
            game.SavedPlay();
            game.show(vectors2D);
        }
        for (; ; ) {
            if (isfull(order) == true) {
                break;
            }
            if(MainFrame_3X3.getPlayer() == 1){

            }else{
                game.computer2Play();
                TimeUnit.SECONDS.sleep(1);
            }

            game.show(vectors2D);
            System.out.println("\n");
            if (isfull(order) == true) {
                break;
            }
        }
        System.out.println("Score of PLayer1 (human player) is:");
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

//    public static void main(String[] args) throws Exception {
//        mainframe.setVisible(true);
//        Scanner in = new Scanner(System.in);
//        kernal3X3_HU_VS_MA game = new kernal3X3_HU_VS_MA();
//        System.out.println("New Game? Please input yes or no");
//        String newgame = in.nextLine();
//        if (newgame.toLowerCase().equals("yes")) {
//            System.out.println("Which one do you want to play first?\n" +
//                    "1 for player and 2 for computer");
//            int anumber = in.nextInt();
//            MainFrame_3X3.setPlayer(anumber);
//        } else {
//            game.fileread();
//            game.SavedPlay();
//            game.show(vectors2D);
//        }
//        for (; ; ) {
//            if (isfull(order) == true) {
//                break;
//            }
//            if(MainFrame_3X3.getPlayer() == 1){
//
//            }else{
//                game.computer2Play();
//                TimeUnit.SECONDS.sleep(1);
//            }
//
//            game.show(vectors2D);
//            System.out.println("\n");
//            if (isfull(order) == true) {
//                break;
//            }
//        }
//        System.out.println("Score of PLayer1 (human player) is:");
//        System.out.println(scoreOfPlayer1 + "\n");
//        System.out.println("Score of Player2 (computer) is:");
//        System.out.println(scoreOfPlayer2 + "\n");
//        TimeUnit.SECONDS.sleep(1);
//        System.out.println("Do you want to save this game?\n" +
//                "yes or no");
//        String DoSave = "";
//        for(;;){
//            DoSave = in.nextLine();
//            if(DoSave.toLowerCase().equals("yes") || DoSave.toLowerCase().equals("no")){
//                break;
//            }
//        }
//        if (DoSave.toLowerCase().equals("no")) {
//        } else {
//            game.fileWrite();
//            TimeUnit.SECONDS.sleep(1);
//            System.out.println("Game Saved");
//        }
//        System.out.println("\nGame Over");
//
//
//    }