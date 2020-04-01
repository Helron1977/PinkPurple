//import java.util.ArrayList;

public class Game {
    private static Player player01;
    private static Player player02;



    public Game(){
        generatePlayer();
        }
    void generatePlayer(){
        player01= new Player("Helron",255,100,200);
        player02= new Player("Nico",125,200,100);
    }
    static void display(){
        player01.ball.display();
        player02.ball.display();
    }
}
