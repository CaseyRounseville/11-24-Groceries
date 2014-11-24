// c// class to store list of Grocery items 
import java.util.ArrayList;
public class GroceryList
{
  ArrayList<String>list=new ArrayList<String>();
  public GroceryList()
  {
    list.clear();
  }
  public void add(String name)
  {
    list.add(name);
  }
  public double getTotalCost()
  {
    int j=0;
    double totalCost=list.get(j).getCost();
    for(int i=1;i<list.size()-1;i++)
    {
      temp+=list.get(i).getCost();
    }
    return totalCost;
  }
  public String toString()
  {
    String groceryList;
    for(int i=0;i<list.size();i++)
    {
      groceryList=list(i).quantity+" "+list.grt(i).name+" @ $"+list.get(i).price+"=$"+list.get(i).getCost()\n;
    }
    return groceryList;
  }
}
