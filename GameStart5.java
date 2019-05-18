package Project;

public class GameStart5 {
    public static int gamemode;
    public static void GameStart() throws Exception{
        if(gamemode == 0){
            kernal5X5_MA_VS_MA.MA_VS_MA();
        }else if(gamemode == 1){
            kernal5X5_HU_VS_MA.HU_vs_MA();
        }else if(gamemode == 2){
            kernal5X5_HU_VS_HU.HU_VS_HU();
        }
    }
}
