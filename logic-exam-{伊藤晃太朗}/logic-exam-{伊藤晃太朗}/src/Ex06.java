import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        Random rand=new Random();
        int[]answer={5,6,7};
        List<Integer>answer=new ArrayList<>();
        for(int i=0;i<3;i++){
            int num=rand.nextInt(10);
            if(!answer.contains(num)){
                answer.add(num);
            }
            
        }
        System.out.println(answer);
    }
}
