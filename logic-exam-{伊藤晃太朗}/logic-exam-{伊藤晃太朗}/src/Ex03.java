public class Ex03 {
    public static void main(String[] args) {
        int Age=Integer.parseInt(args[0]);
        int seiki=(Age-1)/100+1;
        System.out.println(Age+"年は"+seiki+"世紀です");
    }
}
