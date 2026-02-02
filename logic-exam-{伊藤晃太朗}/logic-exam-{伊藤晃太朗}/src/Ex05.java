import java.util.HashMap;
import java.util.Map;

public class Ex05 {
    public static void main(String[] args) {
        String[]sports={ "soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer" };
        Map<String,Integer>map=new HashMap<>();
        for(String sport:sports){
            if(sports.contains(sport)){
                map.put(sport, suport.get(suport)+1);
            }
        }
    }
}
