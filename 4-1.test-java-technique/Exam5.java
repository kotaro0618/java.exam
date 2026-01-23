import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        LocalDate birthday=LocalDate.of(2000, 6, 18);
        int year=birthday.getYear();
        int month=birthday.getMonthValue();
        int day=birthday.getDayOfMonth();
        System.out.println("私の誕生日は"+year+"年"+month+"月"+day+"日です");
    }
}
