void setup(){
size(1400,600);
background(0);
stroke(#686d7c);
strokeWeight(2);
frameRate(10);
}
void draw(){
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

