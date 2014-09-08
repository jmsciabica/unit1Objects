import java.awt.Rectangle;

public class Rectangle1
{
   public static void main(String[] args)
   {
       Rectangle box = new Rectangle(5,10,20,30);
       box.add(0,0);
       System.out.println(box);
       System.out.println("Expected: 0");
       System.out.println("Final:"+box.getX());
       System.out.println("Expected: 0");
       System.out.println("Final:"+box.getY());
       
   }
}

