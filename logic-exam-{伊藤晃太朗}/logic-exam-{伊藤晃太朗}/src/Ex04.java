public class Ex04 {
    int year = 0;

    static boolean isUrudoshi(int year) {
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(uru(1000));
    }
}
