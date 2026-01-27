import java.util.ArrayList;

public class ShoppingCart extends LinkedList{
    ArrayList<Item> itemList;
    ShoppingCart(){
        itemList=new ArrayList<>();
    } 
    public void additem(Item item){
itemList.add(item);
    }
    public void itemsize(){
        itemList.size();
    }
    public int getTotalPrice(){
        int sum=0;
        for(Item item:itemList){
            sum+=item.getPrice();
        }
        return sum;
    }
    public double getAveragePrice(){
        return getTotalPrice()/itemsize();
    }
}
