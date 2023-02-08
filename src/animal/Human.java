package animal;

public class Human extends Animal implements Thinkable {

    public Human(String name, int age, String hobby) {
        super(name, age);
        super.setName(name);
        super.setAge(age);
        this.hobby = hobby;

    }
    private String hobby;

    public void Animal(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // think メソッドを実装
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }

}
