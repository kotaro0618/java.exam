package exam1;

public class SuperCar extends Car{
    @Override
    void run(){
        System.out.println("ブオーン!"+getName()+"が走ります");
    }
   
}
