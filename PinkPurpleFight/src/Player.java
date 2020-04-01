import processing.core.PApplet;

import java.awt.*;

public class Player {
    int nbColor;
    int score;
    int startXcoordinate;
    int startYcoordinate;
    Point startPosition;
    String name;
    String upButton;
    String downButton;
    String rightButton;
    String leftButton;
    String hitButton;
    public static Ball ball;

    Player (String name, int nbColor, int startXcoordinate, int startYcoordinate){
        this.name = name;
        this.nbColor = nbColor;
        score = 0;
        generateBall(this.startXcoordinate, this.startYcoordinate);

    }


    void generateBall( int startXcoordinate, int startYcoordinate){
        startPosition = new Point(this.startXcoordinate,this.startYcoordinate);
        ball = new Ball(MainClass.p.color(nbColor), startPosition);
    }
}
