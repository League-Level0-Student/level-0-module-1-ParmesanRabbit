
void setup() {
size(600,600);
PImage face = loadImage("rabbit.png");
face.resize(500, 500);
image(face, 60, 60);


}
void draw() {
//right eye
fill(mouseX,mouseY,2);
ellipse(180,400,40,40);
fill(0,0,0);
ellipse(180,400,20,20);
//left eye
fill(mouseX,mouseY,2);
ellipse(110,390,40,40);
fill(0,0,0);
ellipse(110,390,20,20);


}
