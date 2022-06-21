void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#E33A27);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#2FE327);
    rect(176, 103, 12, 32);
    if(mousePressed) {
      fill(#FFFFFF);
      ellipse(mouseX, mouseY, 40, 40); }
}
