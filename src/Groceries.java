// main program to run the GroceryList
//Casey Rounseville
//9O
//11-24-2014
public class Groceries
{
  public static void main(String[] args)
  {
    GroceryItem item1=new GroceryItem("chicken",1,7.99);
    GroceryItem item2=new GroceryItem("gallon of milk",2,1.99);
    GroceryItem item3=new GroceryItem("box of cereal",3,2.50);
    GroceryItem item4=new GroceryItem("loaf of bread",1,1.25);
    GroceryItem item5=new GroceryItem("dozen eggs",2,0.99);
    GroceryList gList=new GroceryList();
    gList.add(item1);
    gList.add(item2);
    gList.add(item3);
    gList.add(item4);
    gList.add(item5);
    System.out.println("Grocery List:");
    System.out.println(gList.toString());
    System.out.println("Total: $"+gList.getTotalCost());
  }
}
