package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam base1 = new BaseBallTeam();
        base1.setName("東京ヤクルトスワローズ");
        base1.setWin(80);
        base1.setLose(59);
        base1.setDraw(4);
        base1.report();


        BaseBallTeam base2 = new BaseBallTeam();
        base2.setName("横浜DeNAベイスターズ");
        base2.setWin(73);
        base2.setLose(68);
        base2.setDraw(2);
        base2.report();


        BaseBallTeam base3 = new BaseBallTeam();
        base3.setName("阪神タイガース");
        base3.setWin(68);
        base3.setLose(71);
        base3.setDraw(4);
        base3.report();


        BaseBallTeam base4 = new BaseBallTeam();
        base4.setName("読売ジャイアンツ");
        base4.setWin(68);
        base4.setLose(72);
        base4.setDraw(3);
        base4.report();


        BaseBallTeam base5 = new BaseBallTeam();
        base5.setName("広島東洋カープ");
        base5.setWin(66);
        base5.setLose(74);
        base5.setDraw(3);
        base5.report();


        BaseBallTeam base6 = new BaseBallTeam();
        base6.setName("中日ドラゴンズ");
        base6.setWin(66);
        base6.setLose(75);
        base6.setDraw(2);
        base6.report();
    }
}
