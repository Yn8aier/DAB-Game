package Project;

import java.util.Scanner;

public class GameStart {
    public static int gamemode;
    public static void main(String[] args) throws Exception{
//        System.out.println("Select game mode");
//        System.out.println("0 for MA-MA, 1 for HU-MA, 2 for HU-HU");
//        Scanner in = new Scanner(System.in);
//        gamemode = in.nextInt();
//        if(gamemode == 0){
//            kernal3X3_MA_VS_MA.MA_VS_MA();
//        }else if(gamemode == 1){
//            kernal3X3_HU_VS_MA.HU_vs_MA();
//        }else if(gamemode == 2){
//            kernal3X3_HU_VS_HU.HU_VS_HU();
//        }
        gamestart();
    }
    public static void gamestart() throws Exception{
        System.out.println("Select game mode");
        System.out.println("0 for MA-MA, 1 for HU-MA, 2 for HU-HU");
        Scanner in = new Scanner(System.in);
        gamemode = in.nextInt();
        if(gamemode == 0){
            kernal3X3_MA_VS_MA.MA_VS_MA();
        }else if(gamemode == 1){
            kernal3X3_HU_VS_MA.HU_vs_MA();
        }else if(gamemode == 2){
            kernal3X3_HU_VS_HU.HU_VS_HU();
        }
    }
}
