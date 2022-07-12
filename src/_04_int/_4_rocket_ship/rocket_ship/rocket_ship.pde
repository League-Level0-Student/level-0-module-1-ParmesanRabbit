int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    
}

void draw() {
int count =0;


while(count<500) {
    background(0, 0, 40); 
    fill(random(255), 0, 0);
    ellipse(x, y-1 + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y-1 + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y-1 + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y-1+ 10, x + 50, y-1 + 100, x - 50, y -1+ 100);
    count +=1;
    y -=1;
  }
}
