package exam1;

public class Car {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    void putOnGas(){
        System.out.println(name+"に給油します");
    }
    void run(){
        System.out.println("ブーン！車が走ります");
    }
}
