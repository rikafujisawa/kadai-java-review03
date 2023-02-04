package baseball;

public class BaseBallTeam {
    // フィールド
    public String name; // チーム名
    public int win; // 勝
    public int lose; // 負
    public int draw; // 同点

    // 勝率メソッド
    public double getRate(int win, int lose) {
        double getRate = ((double) win / (win + lose));
        return getRate;
    }

    // reportメソッド
    public void report(String name, int win, int lose, int draw) {
        System.out.println(
                name + "の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + getRate(win, lose) + "です。");

    }
}