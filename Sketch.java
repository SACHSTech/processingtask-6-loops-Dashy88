import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {

    size(400, 400);
  }

 
  public void setup() {
    background(225);
  }

  //quad 1

  public void draw() {

    float colour = 1;
  
    for (int lineX = 0; lineX <= 200; lineX += 1) {
      
      stroke(colour);
      line(lineX, 200, lineX, height);
      colour++;
    }

    //quad 2

   for (int circleY = 40; circleY <= 150; circleY += 25) {
    for (int circleX = 250; circleX <= 350; circleX += 25) {
      ellipse(circleX, circleY, 15, 15);
    }
}

    //quad 3

    stroke(1);
    fill(1);
	  for (int line = 20; line <= 180; line += 20) {
      line(line, 0, line, 200);
    }
    for (int line = 20; line <= 200; line += 20) {
      line(0, line, 200, line);
    }

  }
  
}