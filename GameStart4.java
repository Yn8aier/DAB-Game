 package Project;

public class GameStart4 {
    public static int gamemode;
    public static void GameStart() throws Exception {
        if (gamemode == 0) {
            Project.kernal4X4_MA_VS_MA.MA_VS_MA();
        } else if (gamemode == 1) {
            kernal4X4_HU_VS_MA.HU_vs_MA();
        } else if (gamemode == 2) {
            Project.kernal4X4_HU_VS_HU.HU_VS_HU();
        }
    }
}
