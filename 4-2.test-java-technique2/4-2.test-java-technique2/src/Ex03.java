import java.util.ArrayList;
import java.util.List;


public class Ex03 {
    public static void main(String[] args) {
        List<Employee>lists=new ArrayList<>();
lists.add(new Employee("後藤", 31));
lists.add(new Employee("山田", 28));
lists.add(new Employee("佐藤", 25));
lists.add(new Employee("田中", 19));
for(Employee list:lists){
System.out.println(list.getName()+"("+(list.getAge())+"歳)");
}
    }
}
