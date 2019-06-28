import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class pro extends PApplet {

public void setup(){
size(1400,600);
background(0);
stroke(0xff686d7c);
strokeWeight(2);
frameRate(10);
}
public void draw(){
  background(255);
strokeWeight(2);
line(450,150,450,150);
fill(220,0,0);
ellipse(0,0,10,10);
fill(120);
ellipse(pmouseX,pmouseY,10,10);
line(mouseX,mouseY,pmouseX,pmouseY);
fill(random(mouseX),random(mouseY),random(mouseX));
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--stop-color=#cccccc", "pro" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
