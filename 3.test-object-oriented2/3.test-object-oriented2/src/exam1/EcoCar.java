package exam1;

public class EcoCar extends Car {
    @Override
    void run() {
        System.out.println("シーン！" + getName() + "が走ります");
    }
}
