import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex02 {
    public static void main(String[] args) {
        int hour=Integer.parseInt(args[0]);
        int minutes=Integer.parseInt(args[1]);
        int seconds=Integer.parseInt(args[2]);
        LocalDateTime date=LocalDateTime.of(0, 0, 0, hour, minutes, seconds);
        LocalDateTime results=date
                              .plusSeconds(1);
    System.out.println(hour+"時"+minutes+"分"+seconds+"秒後は"+results+"です");
    }
}
