void setup() {
  size(500, 500);
  fill(200, 0, 0);
  ellipse(250, 250, 250, 250);
}

void draw() { 
  if (mousePressed) {
    PImage Pepperoni = loadImage("Pepperoni.png");
    Pepperoni.resize(50, 50);
    image(Pepperoni, mouseX, mouseY);
  }
}
