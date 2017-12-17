import Present.Chupachups;
import Present.Mars;
import Present.Sladost;
import Present.Snikers;

public class Base {
    public static void main(String[] args){
        System.out.println("Подарок состоит из следующих сладостей:");
        Chupachups chupachups1=new Chupachups("Chupachups1", 56,1000, "klubnika");
        Mars mars1=new Mars("Mars1", 67, 200, 3500);
        Snikers snikers1=new Snikers ("Snikers1", 300, 450,"5 nuts");
        Sladost [] present = {chupachups1, mars1, snikers1};
        for (Sladost someSladost : present){
            System.out.println(someSladost.toString());
        }
        int comWeight=chupachups1.getWeight()+snikers1.getWeight()+mars1.getWeight();
        System.out.println("Общий вес подарка равен " +comWeight);
        int comPrice=chupachups1.getPrice()+snikers1.getPrice()+mars1.getPrice();
        System.out.println("Общая цена подарка равна "+ comPrice);
    }
}
