  PImage pepperoni;
  PImage mushroom;
  PImage olive;
void setup() {
 size(500,500);
  pepperoni = loadImage("pepperoni.png");
  mushroom = loadImage("mushroom.png");
  olive = loadImage("olive.png");
  pepperoni.resize(60,60);
  mushroom.resize(35,35);
  olive.resize(30,30);
  fill(#D8AE6D);
  ellipse(250, 250, 300, 300);
  fill(#E33707);
  ellipse(250, 250, 270, 270);
  fill(#E3BF07);
  ellipse(250, 250, 250, 250);
}
void draw() {
  if(mousePressed) {
     image(pepperoni,280,200);
     image(olive,200,290);
     image(mushroom,220,170);
  }
}
