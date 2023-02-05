package baseball;

public class BaseBallTeam {
    // フィールド
    private String name; // チーム名
    private int win; // 勝
    private int lose; // 負
    private int draw; // 同点

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    // 勝率メソッド
    public double getRate() {
        return (double) this.win / (this.win + this.lose);
    }

    // reportメソッド
    public void report() {
        System.out.println(this.name + "の2022年の成績は " + this.win + "勝 " + this.lose + "敗 " + this.draw + "分、勝率は "
                + this.getRate() + "です。");
    }
}
