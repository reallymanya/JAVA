package arraylist;
import java.util.ArrayList;
public class twod {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic breads");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("tea");
        drinksList.add("coffee");
        
        groceryList.add(bakeryList);
        groceryList.add(drinksList);
        groceryList.add(produceList);

        System.out.println(groceryList.get(0).get(0));
    }
}
