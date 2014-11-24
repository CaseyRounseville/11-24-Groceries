// class to represent a grocery item
public class GroceryItem
{
  int quantity;
  String name;
  double price;
  public GroceryItem(String n,int q,double p)
  {
    quantity=q;
    name=n;
    price=p;
  }
  public double getCost()
  {
    double cost=quantity*price;
    return cost;
  }
  public void setQuantity(int q)
  {
    quantity=q;
  }
  public String toString()
  {
    String list=quantity+" "+name+" @ $"+price+"=$"+getCost();
    return list;
  }
}
