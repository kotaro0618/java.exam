
import java.time.LocalDateTime;

public class Exam6 {
    public static void main(String[] args) {
        LocalDateTime birthday=LocalDateTime.of(1543, 2, 10, 05, 12);
        System.out.print("徳川家康の誕生日は"+birthday+"です");
        Object date=birthday
                 .plusYears(1)
                 .plusMonths(2)
                 .plusDays(3)
                 .plusHours(4)
                 .plusMinutes(5);
                 System.out.println();
                 System.out.println("1年2ヶ月3日4分後は"+date+"です");
    }
}
