public class ConcatDemo
{
   public static void main(String[] args)
   {
      String animal1 = "quick brown fox";
      String animal2 = "lazy dog.";
      String article = "The";
      String action = "jumps over";
      /* Your work goes here */
      String message = (article);
      message = message.concat(" "+animal1);
      message = message.concat(" "+article);
      message = message.concat(" "+animal2);
      

      System.out.println(message);
   }
}


