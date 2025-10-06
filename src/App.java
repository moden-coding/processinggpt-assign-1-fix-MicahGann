import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void settings(){
        size(400, 400);
    }
    public void setup(){
        background(288, 594);
        noLoop();
    }
    public void draw(){
        stroke(79, 82, 175);
        strokeWeight(25);
        line(300, 300, 200, 200);
        fill(400, 200, 3);
        stroke(255);
        strokeWeight(25);
        ellipse(200, 200, 50, 50);
        fill(400, 200, 3);
        stroke(255);
        strokeWeight(25);
        rect(300, 300, 50, 50);
    }
}
