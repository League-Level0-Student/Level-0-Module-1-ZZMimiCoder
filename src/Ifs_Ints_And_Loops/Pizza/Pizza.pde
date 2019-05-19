void setup() {
  size(500, 500);
  fill(240, 155, 155);
  ellipse(250, 250, 290, 290);
  fill(200, 0, 0);
  ellipse(250, 250, 250, 250);
  fill(195, 255, 0);
  ellipse(250, 250, 210, 210);
}

void draw() { 
  if (mousePressed) {
    PImage Pepperoni = loadImage("Pepperoni.png");
    Pepperoni.resize(50, 50);
    image(Pepperoni, mouseX, mouseY);
  }
}
