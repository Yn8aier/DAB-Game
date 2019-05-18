package Project;

public class GameStart6 {
    public static int gamemode;
    public static void GameStart() throws Exception{
        if(gamemode == 0){
            kernal6X6_MA_VS_MA.MA_VS_MA();
        }else if(gamemode == 1){
            kernal6X6_HU_VS_MA.HU_vs_MA();
        }else if(gamemode == 2){
            kernal6X6_HU_VS_HU.HU_VS_HU();
        }
    }
}
