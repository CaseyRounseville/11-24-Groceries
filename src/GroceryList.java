// class to store list of Grocery items 
//Casey Rounseville
//9O
//11-24-2014
import java.util.ArrayList;
public class GroceryList
{
  ArrayList<GroceryItem>list=new ArrayList<GroceryItem>();
  public GroceryList()
  {
    list.clear();
  }
  public void add(GroceryItem item)
  {
    list.add(item);
  }
  public double getTotalCost()
  {
    GroceryItem itemA=new GroceryItem(list.get(0).name,list.get(0).quantity,list.get(0).price);
    double totalCost=itemA.getCost();
    for(int i=1;i<list.size();i++)
    {
      GroceryItem itemB=new GroceryItem(list.get(i).name,list.get(i).quantity,list.get(i).price);      
      totalCost+=itemB.getCost();
    }
    return totalCost;
  }
  public String toString()
  {
    String groceryList=list.get(0).toString()+"\n";
    for(int i=1;i<list.size();i++)
    {
      String temp=list.get(i).toString()+"\n";
      groceryList+=temp;
    }
    return groceryList;
  }
}
