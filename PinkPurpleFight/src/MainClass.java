import processing.core.PApplet;
import java.util.ArrayList;
import java.util.ListIterator;

public class MainClass extends PApplet {
        Game game;
        public static PApplet p;
        public static void main (String... args) {
            PApplet.main("MainClass", args);
            Game game= new Game();
        }


    public void settings(){
            p = this;
        smooth(); // Lissage des dessins
        size(800,400);

    }
    public void draw(){
        background(0,0,0);// On dessine un fond noir
        noStroke(); // on supprime le contour

        Game.display();

        }

}
