//Source file: C:\\Users\\User\\Desktop\\MoreMovies\\List.java


public interface List 
{
   private ArrayList<Friend> friendList;
   public Iterating theIterating;
   
   /**
    * @roseuid 581F844403B2
    */
   public void addItem();
   
   /**
    * @roseuid 581F844403B3
    */
   public void removeItem();
   
   /**
    * @return Integer
    * @roseuid 581F844403B4
    */
   public Integer getNumberOfItems();
   
   /**
    * @return Friend
    * @roseuid 581F844403B5
    */
   public Friend next();
}
