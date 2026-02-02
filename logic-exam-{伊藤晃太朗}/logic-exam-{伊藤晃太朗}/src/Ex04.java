public class Ex04 {
    int age = 0;

    boolean uru(int age) {
        if (age % 4 == 0 && age % 100 == 0 && age % 400 == 0) {
            return true;
        } else if (age % 4 == 0 && age % 100 == 0) {
            return false;
        } else if (age % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(uru(1000));
    }
}
