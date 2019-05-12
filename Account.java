package Project;

public class Account {

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getVIPlevel() {
        return VIPlevel;
    }

    public void setVIPlevel(int VIPlevel) {
        this.VIPlevel = VIPlevel;
    }

    public int getTopUpMoney() {
        return TopUpMoney;
    }

    public void setTopUpMoney(int topUpMoney) {
        TopUpMoney = topUpMoney;
    }

    public int getEXP() {
        return EXP;
    }

    public void setEXP(int EXP) {
        this.EXP = EXP;
    }

    private String Username;
    private String Password;
    private int Level;
    private int VIPlevel;
    private int TopUpMoney;
    private int EXP;
    //initially false
    private boolean regrate;

    public Account(String username, String password) {
        Username = username;
        Password = password;
        Level = 0;
        VIPlevel = 0;
        TopUpMoney = 0;
        EXP = 0;
        regrate = false;
    }

    public Account(String username, String password, int level, int VIPlevel, int topUpMoney, int EXP, boolean regrate) {
        Username = username;
        Password = password;
        Level = level;
        this.VIPlevel = VIPlevel;
        TopUpMoney = topUpMoney;
        this.EXP = EXP;
        this.regrate = regrate;
    }

    public Account() {
    }
}
