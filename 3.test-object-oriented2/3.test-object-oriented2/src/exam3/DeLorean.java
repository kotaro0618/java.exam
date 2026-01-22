package exam3;

public class DeLorean implements Car, Airplane, TimeMachine {
    @Override
    public void run() {
        System.out.println("デロリアンが走る！");
    }

    public void fly() {
        System.out.println("デロリアンが飛ぶ!");
    }

    public void timeTravel() {
        System.out.println("デロリアンがタイムレポート！");
    }
    public void engineStart(){
        run();
        fly();
        timeTravel();
    }
}
