import java.awt.Color;

public class Turtles
{
    public static void main(String[]args)
    {
        World turtleWorld = new World();
        Turtle tommy = new Turtle(turtleWorld);
        Turtle lily = new Turtle(turtleWorld);
        tommy.setShellColor(Color.CYAN); 
        lily.setShellColor(Color.PINK);
        lily.setBodyColor(Color.GREEN);
        tommy.setBodyColor(Color.GREEN);
        lily.setPenColor(Color.BLACK);
        tommy.setPenColor(Color.BLACK);
        tommy.setPenWidth(5);
        lily.setPenWidth(5);
        tommy.turn(-90);
        lily.forward(100);
        tommy.forward(100);
        lily.turn(90);
        tommy.turn(-90);
        lily.forward(90);
        tommy.forward(90);
        lily.turn(90);
        tommy.turn(-90);
        lily.setPenColor(Color.RED);
        tommy.setPenColor(Color.RED);
        lily.forward(90);
        tommy.forward(90);
        lily.turn(90);
        tommy.turn(-90);
        lily.setPenColor(Color.ORANGE);
        tommy.setPenColor(Color.ORANGE);
        lily.forward(80);
        tommy.forward(80);
        lily.turn(90);
        tommy.turn(-90);
        lily.setPenColor(Color.YELLOW);
        tommy.setPenColor(Color.YELLOW);
        lily.forward(80);
        tommy.forward(80);
        lily.turn(90);
        tommy.turn(-90);
        lily.setPenColor(Color.GREEN);
        tommy.setPenColor(Color.GREEN);
        lily.forward(70);
        tommy.forward(70);
        lily.turn(90);
        tommy.turn(-90);
        lily.setPenColor(Color.BLUE);
        tommy.setPenColor(Color.BLUE);
        lily.forward(60);
        tommy.forward(60);
        lily.turn(90);
        tommy.turn(-90);
        lily.setPenColor(Color.MAGENTA);
        tommy.setPenColor(Color.MAGENTA);
        lily.forward(70);
        tommy.forward(70);
        tommy.penUp();
        lily.penUp();
        lily.forward(90);
        tommy.forward(90);
  
    }
}
  