import processing.core.*;
import processing.data.*;

import java.awt.*;
import java.awt.geom.Point2D;

public class Ball {


    int color;
    Point actualPosition;

    //Constructeur de la balle
    Ball (int color, Point actualPosition) {
        this.color    = color;
        this.actualPosition = actualPosition;
    }

    //Dessin de la balle
    public final void display() {
        MainClass.p.fill(MainClass.p.color(color));
        MainClass.p.ellipse(actualPosition.x, actualPosition.y, 40, 40);
    }
}
